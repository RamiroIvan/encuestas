package com.certuit.encuestas.Util;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;


/**
 * Created by ivane on 09/06/15.
 */
public interface API {

    @Headers({
            "Content-Type: application/json",
            "Connection: Keep-Alive"
    })
    @POST("/")
    void auteticacion(@Body JsonObject autenticacion, Callback<Object> callback);


}
