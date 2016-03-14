package com.certuit.limesurvey.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by andre on 3/13/16.
 */
public class Group {
    @SerializedName(value = "id")
    private GroupId id;
    @SerializedName(value = "gid")
    private String gid;
    @SerializedName(value = "sid")
    private String sid;
    @SerializedName(value = "group_name")
    private String groupName;
    @SerializedName(value = "group_order")
    private String groupOrder;
    @SerializedName(value = "description")
    private String description;
    @SerializedName(value = "language")
    private String language;
    @SerializedName(value = "randomization_group")
    private String randomizationGroup;
    @SerializedName(value = "grelevance")
    private String grelevance;

    private class GroupId{
        @SerializedName(value = "gid")
        private String gid;
        @SerializedName(value = "language")
        private String language;
    }

    public Group() {
    }

    public Group(GroupId id, String gid, String sid, String groupName, String groupOrder, String description, String language, String randomizationGroup, String grelevance) {
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.groupName = groupName;
        this.groupOrder = groupOrder;
        this.description = description;
        this.language = language;
        this.randomizationGroup = randomizationGroup;
        this.grelevance = grelevance;
    }

    public GroupId getId() {
        return id;
    }

    public void setId(GroupId id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(String groupOrder) {
        this.groupOrder = groupOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRandomizationGroup() {
        return randomizationGroup;
    }

    public void setRandomizationGroup(String randomizationGroup) {
        this.randomizationGroup = randomizationGroup;
    }

    public String getGrelevance() {
        return grelevance;
    }

    public void setGrelevance(String grelevance) {
        this.grelevance = grelevance;
    }
}
