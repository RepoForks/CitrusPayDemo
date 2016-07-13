package in.vaksys.citruspaydemo.demo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Harsh on 21-06-2016.
 */
public class ApiClient {

    private static Retrofit retrofit = null;

    public static OkHttpClient okHttpClient1 = new OkHttpClient().newBuilder()
            .connectTimeout(100, TimeUnit.SECONDS)
            .writeTimeout(100, TimeUnit.SECONDS)
            .readTimeout(100, TimeUnit.SECONDS)
            .build();

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://splitpaysbox.citruspay.com/marketplace/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient1)
                    .build();
        }
        return retrofit;
    }

}

