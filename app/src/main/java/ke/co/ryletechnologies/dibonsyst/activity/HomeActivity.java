package ke.co.ryletechnologies.dibonsyst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ke.co.ryletechnologies.dibonsyst.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openBuyAirtime(View view) {
        Intent myintent = new Intent(this,AirtimeActivity.class);
        startActivity(myintent);
    }
    public void openctob(View view) {
        Intent myintent = new Intent(this, ctobActivity.class);
        startActivity(myintent);
    }
    public void openbtoc(View view) {
        Intent myintent = new Intent(this, btocActivity.class);
        startActivity(myintent);
    }
}