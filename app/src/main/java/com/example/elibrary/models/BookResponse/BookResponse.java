
package com.example.elibrary.models.BookResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Generated("jsonschema2pojo")

@Parcel
public class BookResponse {

    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BookResponse() {
    }

    /**
     * 
     * @param docs
     */
    public BookResponse(List<Doc> docs) {
        super();
        this.docs = docs;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

}
