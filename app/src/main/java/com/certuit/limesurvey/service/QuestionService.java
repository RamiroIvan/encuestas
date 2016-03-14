package com.certuit.limesurvey.service;

import com.certuit.limesurvey.model.Group;
import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.Survey;
import com.google.gson.JsonObject;

import org.json.JSONException;

/**
 * Created by andre on 3/13/16.
 */
public class QuestionService {
    private static String methodListGroups = "list_questions";
    private static String id = "1"; //This doesn't matters

    public static JsonObject getJsonListQuestions(Survey survey,Group Group,String token,String lenguage) throws JSONException {
        JsonObject userParams = new JsonObject();
        userParams.addProperty("sSessionKey",token);
        userParams.addProperty("iSurveyID",survey.getSid());
        userParams.addProperty("iGroupID",Group.getGid());
        userParams.addProperty("sLanguage",lenguage);
        JsonObject authenticationJsonObject = LimeSurveyJsonObject
                .createLimeSurveyJsonObject(methodListGroups, userParams, id);
        return authenticationJsonObject;
    }
}
