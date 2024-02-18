package com.beratkaya.retrofitjava.service;

import com.beratkaya.retrofitjava.model.CyrptoModel;

import java.net.CacheRequest;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CyrptoAPI {
    //GET, POST, UPDATE, DELETE
//URL BASE = WWW.WEBSİTE.COM
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CyrptoModel>> getData();
    //Call<List<CyrptoModel>> getData();



}
