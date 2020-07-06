package gaurav.thermometercricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        WebView myweb = (WebView) findViewById(R.id.web);

        myweb.loadUrl("https://www.almanac.com/content/predict-temperature-cricket-chirps#:~:text=The%20Cricket%20as%20a%20Thermometer&text=It's%20surprisingly%20simple%3A,chirps%20%2B%2040%20%3D%2070%C2%B0%20F");
    }

}
