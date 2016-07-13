package in.vaksys.citruspaydemo.demo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Harsh on 21-06-2016.
 */
public interface ApiInterface {


    @FormUrlEncoded
    @POST("seller/")
    Call<Responce> RESPONCE_CALL(@Field("seller_name") String seller_name, @Field("seller_add1") String seller_add1, @Field("address2") String address2, @Field("seller_city") String seller_city, @Field("seller_state") String seller_state, @Field("seller_country") String seller_country, @Field("zip") String zip, @Field("businessurl") String businessurl, @Field("seller_mobile") String seller_mobile, @Field("ifsccode") String ifsccode, @Field("selleremail") String selleremail, @Field("payoutmode") String payoutmode, @Field("accountnumber") String accountnumber, @Field("active") int active);


}
