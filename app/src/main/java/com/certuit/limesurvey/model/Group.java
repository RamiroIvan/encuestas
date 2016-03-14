package com.certuit.limesurvey.model;

/**
 * Created by andre on 3/13/16.
 */
public class Group {
    private Id id;
    private String gid;
    private String sid;
    private String group_name;
    private String group_order;
    private String description;
    private String language;
    private String randomization_group;
    private String grelevance;

    private class Id{
        private String gid;
        private String language;
    }
}
