
package com.example.elibrary.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Type__1 {

    @SerializedName("key")
    @Expose
    private String key;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type__1() {
    }

    /**
     * 
     * @param key;
     */
    public Type__1(String key) {
        super();
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
