package ke.co.ryletechnologies.dibonsyst.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ke.co.ryletechnologies.dibonsyst.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Runnable runnable3secs = new Runnable() {
            @Override
            public void run() {
                nextActivity();
            }
        };
        Handler myHandler= new Handler();
        myHandler.postDelayed(runnable3secs,1500);
    }

    public void nextActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
}