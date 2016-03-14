package com.certuit.limesurvey.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by andre on 3/13/16.
 */
public class Question {
    @SerializedName(value = "id")
    private QuestionId id;
    @SerializedName(value = "qid")
    private String qid;
    @SerializedName(value = "parent_qid")
    private String parentQid;
    @SerializedName(value = "sid")
    private String sid;
    @SerializedName(value = "gid")
    private String gid;
    @SerializedName(value = "type")
    private String type;
    @SerializedName(value = "title")
    private String title;
    @SerializedName(value = "question")
    private String question;
    @SerializedName(value = "preg")
    private String preg;
    @SerializedName(value = "help")
    private String help;
    @SerializedName(value = "other")
    private String other;
    @SerializedName(value = "mandatory")
    private String mandatory;
    @SerializedName(value = "question_order")
    private String questionOrder;
    @SerializedName(value = "language")
    private String language;
    @SerializedName(value = "scale_id")
    private String scaleId;
    @SerializedName(value = "same_default")
    private String sameDefault;
    @SerializedName(value = "relevance")
    private String relevance;
    @SerializedName(value = "modulename")
    private String modulename;

    private class QuestionId{
        @SerializedName(value = "qid")
        private String qid;
        @SerializedName(value = "language")
        private String language;
    }

}
