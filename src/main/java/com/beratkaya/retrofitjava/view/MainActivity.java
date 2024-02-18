package com.beratkaya.retrofitjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.beratkaya.retrofitjava.R;
import com.beratkaya.retrofitjava.adapter.RecyclerViewAdapter;
import com.beratkaya.retrofitjava.model.CyrptoModel;
import com.beratkaya.retrofitjava.service.CyrptoAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.security.CryptoPrimitive;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<CyrptoModel> cyrptoModels;
    private String BASE_URL = "https://raw.githubusercontent.com";
    Retrofit retrofit;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

        //Retrofir && JSON

        recyclerView = findViewById(R.id.recyclerView);

        Gson gson = new GsonBuilder().setLenient().create();

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create(gson)).build();
loadData();
    }
    private void loadData(){

        final CyrptoAPI cyrptoAPI = retrofit.create(CyrptoAPI.class);

        compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(cyrptoAPI.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResponse));




/*
      Call<List<CyrptoModel>> call = cyrptoAPI.getData();

        call.enqueue(new Callback<List<CyrptoModel>>() {
            @Override
            public void onResponse(Call<List<CyrptoModel>> call, Response<List<CyrptoModel>> response) {
            if(response.isSuccessful()){
              List<CyrptoModel> responselist = response.body();
              cyrptoModels = new ArrayList<>(responselist);

              //RecyclerView
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerViewAdapter = new RecyclerViewAdapter(cyrptoModels);
                recyclerView.setAdapter(recyclerViewAdapter);

                for(CyrptoModel cyrptoModel : cyrptoModels){
                    System.out.println(cyrptoModel.currency);
                    System.out.println(cyrptoModel.price);

                }



            }


            }

            @Override
            public void onFailure(Call<List<CyrptoModel>> call, Throwable t) {
                t.printStackTrace();

            }
        });

*/

    }
    private void handleResponse(List<CyrptoModel>cryptoModelList){

        cyrptoModels = new ArrayList<>(cryptoModelList);

        //RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewAdapter = new RecyclerViewAdapter(cyrptoModels);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.clear();
    }
}