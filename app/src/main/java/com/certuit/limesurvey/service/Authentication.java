package com.certuit.limesurvey.service;

import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.User;
import com.google.gson.JsonObject;

import org.json.JSONException;

/**
 * Created by andre on 3/13/16.
 */
public class Authentication {
    private static String method = "get_session_key";
    private static String id = "1"; //This doesn't matters

    public static JsonObject getJsonAuthentication(User user) throws JSONException {
        JsonObject userParams = new JsonObject();
        userParams.addProperty("username",user.getUsername());
        userParams.addProperty("password",user.getPassword());
        JsonObject authenticationJsonObject = LimeSurveyJsonObject
                .createLimeSurveyJsonObject(method, userParams, id);
        return authenticationJsonObject;
    }
}
