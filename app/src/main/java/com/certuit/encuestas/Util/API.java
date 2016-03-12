package com.certuit.encuestas.Util;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import com.certuit.encuestas.Modelo.Reunion;


/**
 * Created by ivane on 09/06/15.
 */
public interface API {

    @GET("/reuniones?date=18/01/2016")
    void getReuniones( Callback<List<Reunion>> callback);



}
