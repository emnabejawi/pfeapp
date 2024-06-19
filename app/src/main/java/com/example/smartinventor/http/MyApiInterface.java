package com.example.smartinventor.http;

import com.example.smartinventor.http.models.LoginRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MyApiInterface {

    @GET("/users/}") // Replace with your endpoint path
    Call<Object> getUser(@Path("username") String username);

    @POST("/auth/login")
    Call<Object> login(@Body LoginRequest login);
}
