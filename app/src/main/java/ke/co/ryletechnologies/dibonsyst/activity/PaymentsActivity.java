package ke.co.ryletechnologies.dibonsyst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ke.co.ryletechnologies.dibonsyst.R;

public class PaymentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);
    }
    public void openSinglePay(View view){
        Intent myIntent = new Intent(this,SinglepayActivity.class);
        startActivity(myIntent);
    }
    public void openBulkPay (View view){
        Intent myIntent = new Intent(this,BulkairtimeActivity.class);
        startActivity(myIntent);
    }
}
