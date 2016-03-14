package com.certuit.limesurvey.client;

import com.certuit.limesurvey.model.Group;
import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.Question;
import com.certuit.limesurvey.model.Survey;
import com.google.gson.JsonObject;

import java.util.List;

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
    void auteticacion(@Body JsonObject jsonObject, Callback<LimeSurveyJsonObject<String>> callback);

    @POST("/")
    void listSurveys(@Body JsonObject jsonObject, Callback<LimeSurveyJsonObject<List<Survey>>> callback);

    @POST("/")
    void listGroups(@Body JsonObject jsonObject, Callback<LimeSurveyJsonObject<List<Group>>> callback);

    @POST("/")
    void listQuestions(@Body JsonObject jsonObject, Callback<LimeSurveyJsonObject<List<Question>>> callback);
}
