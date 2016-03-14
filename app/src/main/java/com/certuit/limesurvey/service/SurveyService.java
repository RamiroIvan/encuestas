package com.certuit.limesurvey.service;

import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.User;
import com.google.gson.JsonObject;

import org.json.JSONException;

/**
 * Created by andre on 3/13/16.
 */
public class SurveyService {
    private static String methodListSurvey = "list_surveys";
    private static String id = "1"; //This doesn't matters

    public static JsonObject getJsonListSurvey(User user,String token) throws JSONException {
        JsonObject userParams = new JsonObject();
        userParams.addProperty("sSessionKey",token);
        userParams.addProperty("sUsername",user.getUsername());
        JsonObject authenticationJsonObject = LimeSurveyJsonObject
                .createLimeSurveyJsonObject(methodListSurvey, userParams, id);
        return authenticationJsonObject;
    }
}
