package ke.co.ryletechnologies.dibonsyst.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ke.co.ryletechnologies.dibonsyst.R;

public class btocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btoc);
    }
    public void openPayments(View view){
        Intent myintent = new Intent(this,PaymentsActivity.class);
        startActivity(myintent);
    }
}
