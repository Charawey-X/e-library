
package com.example.elibrary.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Author {

    @SerializedName("author")
    @Expose
    private Author__1 author;
    @SerializedName("type")
    @Expose
    private Type type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Author() {
    }

    /**
     * 
     * @param author
     * @param type
     */
    public Author(Author__1 author, Type type) {
        super();
        this.author = author;
        this.type = type;
    }

    public Author__1 getAuthor() {
        return author;
    }

    public void setAuthor(Author__1 author) {
        this.author = author;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
