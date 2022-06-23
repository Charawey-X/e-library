package com.example.elibrary.network;

import com.example.elibrary.models.BookResponse.BookResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LibraryApi {
    @GET("search.json")
    Call<BookResponse> getResults(
            @Query("q") String book
    );
}
