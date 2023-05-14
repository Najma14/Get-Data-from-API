package com.example.getdatafromapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_interface {
    @GET("api/users")
     Call<model> getAllData();
}
