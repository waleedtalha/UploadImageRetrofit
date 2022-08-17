package com.cwise.uploadimageretrofit;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    @Multipart
    @POST("AddCustomer.php")
    Call<AddCustomerRes> addCustomer(@Part MultipartBody.Part image,
                                     @Part("customer_name") RequestBody customername,
                                     @Part("reference") RequestBody refernce);
}
