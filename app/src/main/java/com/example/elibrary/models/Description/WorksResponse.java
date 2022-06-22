
package com.example.elibrary.models.Description;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class WorksResponse {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("covers")
    @Expose
    private List<Integer> covers = null;
    @SerializedName("subject_places")
    @Expose
    private List<String> subjectPlaces = null;
    @SerializedName("subjects")
    @Expose
    private List<String> subjects = null;
    @SerializedName("subject_people")
    @Expose
    private List<String> subjectPeople = null;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("authors")
    @Expose
    private List<Author> authors = null;
    @SerializedName("subject_times")
    @Expose
    private List<String> subjectTimes = null;
    @SerializedName("type")
    @Expose
    private Type__1 type;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("latest_revision")
    @Expose
    private Integer latestRevision;
    @SerializedName("revision")
    @Expose
    private Integer revision;
    @SerializedName("created")
    @Expose
    private Created created;
    @SerializedName("last_modified")
    @Expose
    private LastModified lastModified;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WorksResponse() {
    }

    /**
     * 
     * @param created;
     * @param subjects;
     * @param description;
     * @param title;
     * @param type;
     * @param revision;
     * @param subjectPlaces;
     * @param subjectTimes;
     * @param subjectPeople;
     * @param location;
     * @param lastModified;
     * @param latestRevision;
     * @param key;
     * @param covers;
     * @param authors;
     */
    public WorksResponse(String description, String title, List<Integer> covers, List<String> subjectPlaces, List<String> subjects, List<String> subjectPeople, String key, List<Author> authors, List<String> subjectTimes, Type__1 type, String location, Integer latestRevision, Integer revision, Created created, LastModified lastModified) {
        super();
        this.description = description;
        this.title = title;
        this.covers = covers;
        this.subjectPlaces = subjectPlaces;
        this.subjects = subjects;
        this.subjectPeople = subjectPeople;
        this.key = key;
        this.authors = authors;
        this.subjectTimes = subjectTimes;
        this.type = type;
        this.location = location;
        this.latestRevision = latestRevision;
        this.revision = revision;
        this.created = created;
        this.lastModified = lastModified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getCovers() {
        return covers;
    }

    public void setCovers(List<Integer> covers) {
        this.covers = covers;
    }

    public List<String> getSubjectPlaces() {
        return subjectPlaces;
    }

    public void setSubjectPlaces(List<String> subjectPlaces) {
        this.subjectPlaces = subjectPlaces;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjectPeople() {
        return subjectPeople;
    }

    public void setSubjectPeople(List<String> subjectPeople) {
        this.subjectPeople = subjectPeople;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<String> getSubjectTimes() {
        return subjectTimes;
    }

    public void setSubjectTimes(List<String> subjectTimes) {
        this.subjectTimes = subjectTimes;
    }

    public Type__1 getType() {
        return type;
    }

    public void setType(Type__1 type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getLatestRevision() {
        return latestRevision;
    }

    public void setLatestRevision(Integer latestRevision) {
        this.latestRevision = latestRevision;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public Created getCreated() {
        return created;
    }

    public void setCreated(Created created) {
        this.created = created;
    }

    public LastModified getLastModified() {
        return lastModified;
    }

    public void setLastModified(LastModified lastModified) {
        this.lastModified = lastModified;
    }

}
