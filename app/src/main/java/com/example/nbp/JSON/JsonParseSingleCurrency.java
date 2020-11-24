package com.example.nbp.JSON;

import android.app.ProgressDialog;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParseSingleCurrency {
    private String property;

    public JsonParseSingleCurrency(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
