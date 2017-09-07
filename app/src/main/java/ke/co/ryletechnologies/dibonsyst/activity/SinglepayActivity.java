package ke.co.ryletechnologies.dibonsyst.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ke.co.ryletechnologies.dibonsyst.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import android.widget.Toast;

public class SinglepayActivity extends AppCompatActivity {

    //create variables for storing message & button objects
    EditText etMobNumber;
    Button bPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlepay);
        //make message text field object
        etMobNumber= (EditText) findViewById(R.id.etMobNumber);
        //make button object
        bPay = (Button) findViewById(R.id.bPay);
    }

        //when pay button is clicked
        public void pay(View view){
            //get message from message box
            String  msg = etMobNumber.getText().toString();

            //check whether the msg empty or not
            if(msg.length()>0) {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://www.yourdomain.com/serverside-script.php");

                try {
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                    nameValuePairs.add(new BasicNameValuePair("id", "01"));
                    nameValuePairs.add(new BasicNameValuePair("message", msg));
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                    httpclient.execute(httppost);
                    etMobNumber.setText(""); //reset the message text field
                    Toast.makeText(getBaseContext(),"Sent",Toast.LENGTH_SHORT).show();
                } catch (ClientProtocolException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                //display message if text field is empty
                Toast.makeText(getBaseContext(),"All fields are required",Toast.LENGTH_SHORT).show();
            }

    }
}
