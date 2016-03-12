package com.certuit.encuestas.Util;

import com.certuit.encuestas.Modelo.Login;
import com.google.gson.JsonObject;
import com.squareup.okhttp.Call;

import org.json.JSONObject;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;


/**
 * Created by ivane on 09/06/15.
 */
public interface API {

    @POST("/")
    void auteticacion(@Body JSONObject autenticacion, Callback<JSONObject> callback);


}
