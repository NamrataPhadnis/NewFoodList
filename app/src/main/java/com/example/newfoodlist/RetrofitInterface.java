package com.example.newfoodlist;



import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("foodjson.php")
    abstract public Call<CakeList> getCakeList();

}