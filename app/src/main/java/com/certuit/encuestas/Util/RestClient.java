package com.certuit.encuestas.Util;

/**
 * Created by ivane on 09/06/15.
 */
public class RestClient {

    private static API REST_CLIENT;
    //private static String ROOT = "http://192.168.1.69/sorteo/public/";
    private static String ROOT = "http://192.168.3.30:8080/kairos/api/";
    static{
        setupRestClient();
    }

    private RestClient(){

    }

    public static API get() { return REST_CLIENT; }

    private static void setupRestClient(){

        REST_CLIENT = ServiceGenerator.createService(API.class, ROOT);

    }

}
