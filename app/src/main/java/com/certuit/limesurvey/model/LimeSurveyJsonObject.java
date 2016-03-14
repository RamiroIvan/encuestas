package com.certuit.limesurvey.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * Created by andre on 3/13/16.
 */
public class LimeSurveyJsonObject<T> {

    @SerializedName(value = "id")
    private int id=0;
    @SerializedName(value = "result")
    private T results;
    @SerializedName(value = "error")
    private Object error;

    public Object getError() {
        return error;
    }

    public int getId() {
        return id;
    }

    public Object getResults() {
        return results;
    }



    public static JsonObject createLimeSurveyJsonObject(String method, JsonObject params,String id){
        String jsonStr =params.toString();
        Gson gson = new Gson();
        JsonElement element = gson.fromJson (jsonStr, JsonElement.class);
        JsonObject obj = new JsonObject();
        obj.addProperty("method", method);
        obj.add("params", element);
        obj.addProperty("id", id);
        return obj;
    }
}
