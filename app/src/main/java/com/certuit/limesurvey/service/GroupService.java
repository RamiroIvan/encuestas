package com.certuit.limesurvey.service;

import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.Survey;
import com.google.gson.JsonObject;

import org.json.JSONException;

/**
 * Created by andre on 3/13/16.
 */
public class GroupService {
    private static String methodListGroups = "list_groups";
    private static String id = "1"; //This doesn't matters

    public static JsonObject getJsonListGroups(Survey survey,String token) throws JSONException {
        JsonObject userParams = new JsonObject();
        userParams.addProperty("sSessionKey",token);
        userParams.addProperty("iSurveyID",survey.getSid());
        JsonObject authenticationJsonObject = LimeSurveyJsonObject
                .createLimeSurveyJsonObject(methodListGroups, userParams, id);
        return authenticationJsonObject;
    }
}
