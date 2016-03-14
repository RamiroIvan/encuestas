package com.certuit.limesurvey.client;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by andre on 3/13/16.
 */
public interface LimeSurveyAPI {

    @Headers({
            "Content-Type: application/json",
            "Connection: Keep-Alive"
    })
    @POST("/")
    void auteticacion(@Body JsonObject autenticacion, Callback<Object> callback);
}
