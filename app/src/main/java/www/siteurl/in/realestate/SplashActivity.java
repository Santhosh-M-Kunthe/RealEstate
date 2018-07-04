package www.siteurl.in.realestate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        sharedPreferences=getApplicationContext().getSharedPreferences("RealEstateLoginDetails",MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (sharedPreferences.getString("loginID","").isEmpty() && sharedPreferences.getString("loginPswd","").isEmpty())
                    startActivity(new Intent(SplashActivity.this,Login.class));
                else
                    startActivity(new Intent(SplashActivity.this,Home.class));
            }
        },3000);



    }
}
