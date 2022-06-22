
package com.example.elibrary.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Type {

    @SerializedName("key")
    @Expose
    private String key;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param key
     */
    public Type(String key) {
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