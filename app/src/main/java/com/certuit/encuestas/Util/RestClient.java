package com.certuit.encuestas.Util;

/**
 * Created by ivane on 09/06/15.
 */
public class RestClient {

    private static API REST_CLIENT;
    //private static String ROOT = "http://192.168.1.69/sorteo/public/";
    //private static String ROOT = "http://192.168.3.30:8080/kairos/api/";
    private static String ROOT = "http://104.45.238.146/encuestas/index.php/admin/remotecontrol";
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
