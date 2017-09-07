package ke.co.ryletechnologies.dibonsyst;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by User on 8/24/2017.
 */

public class App extends Application {

    public static final String TAG="dibon";
    private static App mInstance;
    private RequestQueue mRequestQueue;
    
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
    }

    public static App getInstance() {
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        if(mRequestQueue==null){
            mRequestQueue= Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
    
    public <T> void addToRequestQueue(Request<T> request){
        request.setTag(TAG);
        getRequestQueue().add(request);
    }
}
