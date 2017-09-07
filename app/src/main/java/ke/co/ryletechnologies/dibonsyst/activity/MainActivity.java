package ke.co.ryletechnologies.dibonsyst.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import ke.co.ryletechnologies.dibonsyst.App;
import ke.co.ryletechnologies.dibonsyst.HttpClientExample;
import ke.co.ryletechnologies.dibonsyst.R;

public class MainActivity extends AppCompatActivity {
    

   // HttpClientExample http = new HttpClientExample();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bBuy = (Button) findViewById(R.id.bBuy);
        bBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new HttpClientExample();
            }
        });


    }
    
    private void buyAirtime(final String phoneNumber, final String amount, final String clientId){
        
        //show progress bar
        StringRequest request=new StringRequest(Request.Method.POST, "https://dibon.co.ke/api", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.i(App.TAG, "onResponse: "+response);
                
                //dismiss progress bar
                
                //parse response
                
                
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //show error message

                        Log.e(App.TAG, "onResponse: "+error.getMessage());
                        error.printStackTrace();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>();
                params.put("21",clientId);
                params.put("0711438911",phoneNumber);
                params.put("20",amount);
                
                return params;
            }
        };

        App.getInstance().addToRequestQueue(request);
    }
}

