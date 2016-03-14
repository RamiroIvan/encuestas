package com.certuit.limesurvey.client;



/**
 * Created by andre on 3/13/16.
 */
public class LimeSurveyClient {

    private static LimeSurveyAPI REST_CLIENT;
    public static final String REST_URL = "http://104.45.238.146/encuestas/index.php/admin/remotecontrol";
    public static final String REST_CONSUMER_KEY = "N/A";
    public static final String REST_CONSUMER_SECRET = "N/A";
    public static final String REST_CALLBACK_URL = "N/A";

    static{
        setupRestClient();
    }

    private LimeSurveyClient(){

    }

    public static LimeSurveyAPI get() { return REST_CLIENT; }

    private static void setupRestClient(){

        REST_CLIENT = LimeSurveyServiceGenerator.createService(LimeSurveyAPI.class, REST_URL);

    }
}
