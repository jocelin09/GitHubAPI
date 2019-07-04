package com.jocelin.githubapi.rest;

import com.jocelin.githubapi.model.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserEndPoints {

    @GET("/users/{user}")
    Call<GitHubUser> getUser(@Path("user") String user);
}



