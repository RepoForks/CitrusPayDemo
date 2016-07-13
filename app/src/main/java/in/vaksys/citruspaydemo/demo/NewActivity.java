package in.vaksys.citruspaydemo.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import in.vaksys.citruspaydemo.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewActivity extends Activity {

    Button btn;
    private static final String TAG = "NewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ApiInterface apiClient = ApiClient
                        .getClient()
                        .create(ApiInterface.class);

                Call<Responce> responceCall = apiClient.RESPONCE_CALL("John Smith", "Garden", "Link Road", "Mumbai"
                        , "Maharashtra", "India", "412345", "test@test.com", "9422173793"
                        , "ICIC0001206", "johnsmith@gmail.com", "IMPS", "12345", 1);

                responceCall.enqueue(new Callback<Responce>() {
                    @Override
                    public void onResponse(Call<Responce> call, Response<Responce> response) {
                        Log.e(TAG, "onResponse: " + response.code());

                        System.out.println(response.body().toString());
                        System.out.println(response.body().getMessage());
                        String res = response.raw().body().toString();

                        System.out.println(res);

                        try {
                            String aa = new String(response.raw().body().bytes());
                            System.out.println(aa);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        Responce res11 = response.body();
                       /*  System.out.println(response.body().getErrorCategory());
                        System.out.println(response.body().getErrorDescription());
                        System.out.println(response.body().getAuthToken());*/
                    }

                    @Override
                    public void onFailure(Call<Responce> call, Throwable t) {

                    }
                });

            }
        });
    }
}
