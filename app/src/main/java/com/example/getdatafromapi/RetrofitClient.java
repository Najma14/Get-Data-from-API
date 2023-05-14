package com.example.getdatafromapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static String BASE_URL="https://reqres.in/";
    private static Retrofit retrofit;

    //This Java class is used to send requests to an API.
    // We specify the URL that contains
    // the data required and use the Retrofit Builder class.

    public static Retrofit getRetrofitInstance()
    {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory
                     .create())
                    .build();

        }
        return retrofit;

    }
}
