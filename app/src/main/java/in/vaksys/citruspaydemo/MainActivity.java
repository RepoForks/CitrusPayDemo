package in.vaksys.citruspaydemo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.citrus.sdk.Environment;
import com.citrus.sdk.ui.utils.CitrusFlowManager;

public class MainActivity extends BaseActivity {
    public static final String sandboxReturnURL = "http://192.168.127.1/CitrusPay/returnUrl.php";
    public static final String sandboxBillGeneratorURL = "http://192.168.127.1/CitrusPay/billgen.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

        CitrusFlowManager.initCitrusConfig("691k6cmbh1-signup", "3e70270f33489807a26e64bf8498d3b5",
                "691k6cmbh1-signin", "2d637519e49813506e262fd7cba8ec6c", Color.RED, this, Environment.SANDBOX,
                "691k6cmbh1", sandboxBillGeneratorURL, sandboxReturnURL);

        findViewById(R.id.quick_pay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startShoppingFlow(MainActivity.this,
                        "developercitrus@mailinator.com", "9769507476", "5");
//                CitrusFlowManager.startShoppingFlow(MainActivity.this, "akshay@leftshift.io",
//                        "8605535811", "50");
//                CitrusFlowManager.startShoppingFlow(MainActivity.this, "kaul.akshay17@gmail.com", "8605535881","5");
            }
        });
        findViewById(R.id.custom_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomDetailsActivity.class));
            }
        });
        findViewById(R.id.wallet_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startWalletFlow(MainActivity.this, "developercitrus@mailinator" +
                        ".com", "9769507476");
            }
        });
        findViewById(R.id.pink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startShoppingFlowStyle(MainActivity.this,
                        "developercitrus@mailinator.com", "9769507476", "5", R.style.AppTheme_pink);
            }
        });
        findViewById(R.id.blue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startShoppingFlowStyle(MainActivity.this,
                        "developercitrus@mailinator.com", "9769507476", "5", R.style.AppTheme_blue);
            }
        });
        findViewById(R.id.green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startShoppingFlowStyle(MainActivity.this,
                        "developercitrus@mailinator.com", "9769507476", "5", R.style
                                .AppTheme_Green);
            }
        });
        findViewById(R.id.purple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.startShoppingFlowStyle(MainActivity.this,
                        "developercitrus@mailinator.com", "9769507476", "5", R.style
                                .AppTheme_purple);
            }
        });
        findViewById(R.id.logout_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CitrusFlowManager.logoutUser(MainActivity.this);
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }
}
