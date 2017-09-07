package ke.co.ryletechnologies.dibonsyst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ke.co.ryletechnologies.dibonsyst.R;

public class AirtimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airtime);
    }
    public void openSingleAirtime(View view){
        Intent myIntent= new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
    public void openBulkAirtime(View view){
        Intent myIntent = new Intent(this,CsvuploadActivity.class);
        startActivity(myIntent);
    }

}
