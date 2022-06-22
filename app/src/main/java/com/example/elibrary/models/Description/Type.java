
package com.example.elibrary.models.Description;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;


@Parcel
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
     * @param key;
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
