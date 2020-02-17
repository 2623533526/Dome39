package com.bawei.dome39.service;

import com.bawei.dome39.api.Api;
import com.bawei.dome39.entity.Login_Entity;
import com.bawei.dome39.entity.Merchandiseorder_Entity;
import com.bawei.dome39.entity.Register_Entity;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * @author: 张家辅
 * @date: 2020/02/13
 */
public interface MyService {
    @POST(Api.REGISTR_URL)
    @FormUrlEncoded
    Observable<Register_Entity> getregister(@FieldMap Map<String,String> map);
    @POST(Api.LOGIN_URL)
    @FormUrlEncoded
    Observable<Login_Entity> getlogin(@FieldMap Map<String,String> map);
    @GET("small/order/verify/v1/findOrderListByStatus?")
    Observable<Merchandiseorder_Entity> getnerchandiseorder(@HeaderMap Map<String,String> headermap , @QueryMap Map <String,String> querymap);
}
