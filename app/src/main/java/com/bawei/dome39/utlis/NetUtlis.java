package com.bawei.dome39.utlis;

import com.bawei.dome39.api.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.PUT;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public class NetUtlis {
    private static NetUtlis netUtlis;
    private final Retrofit retrofit;

    public NetUtlis() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(8, TimeUnit.SECONDS)
                .writeTimeout(8,TimeUnit.SECONDS)
                .readTimeout(8,TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();


    }

    public static NetUtlis getInstance() {
        if(netUtlis==null){
            synchronized (NetUtlis.class){
                if(netUtlis==null){
                    netUtlis= new  NetUtlis();
                }
            }
        }
        return netUtlis;
    }
    public <T>T create(Class<T> tClass){
        return retrofit.create(tClass);
    }
}
