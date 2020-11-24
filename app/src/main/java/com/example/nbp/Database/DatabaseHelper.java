package com.example.nbp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context context;
    public static final String DATABASE_NAME = "Nbp.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Currencies";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_Code = "Code";
    public static final String COLUMN_Currency = "Currency";
    public static final String COLUMN_Mid = "Mid";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_Code + " TEXT," + COLUMN_Currency + " TEXT," + COLUMN_Mid + " FLOAT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(String code, String currency, float mid) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_Code, code);
        cv.put(COLUMN_Currency, currency);
        cv.put(COLUMN_Mid, mid);

        long insert = db.insert(TABLE_NAME, null, cv);
        if (insert == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public void truncateData() {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "DELETE FROM " + TABLE_NAME;
        String query1 = "VACUUM";
        db.execSQL(query);
        db.execSQL(query1);
    }

    public Cursor readData() {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * from " + TABLE_NAME + " ORDER BY 4 desc";
        Cursor cursor = db.rawQuery(query,null);

        return cursor;
    }
}
