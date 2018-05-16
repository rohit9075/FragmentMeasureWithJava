package com.rohit.android.fragmentmeasurewithjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mOut;
    private boolean useFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOut = (TextView) findViewById(R.id.text_out);

    }

    public void onMeasureBtnClick(View view) {



        //object of the ScreenUtility Class
        ScreenUtility su = new ScreenUtility(this);

        // Calling the method and show width and height in textview
        mOut.setText(String.format("Width %s, Height %s," , su.getDpWidth(), su.getDpHeight()));

        if (su.getDpWidth() >= 820 ){
            useFragment = true;
        }else {
            useFragment = false;
        }
        Toast.makeText(this, "Using Fragment" + useFragment, Toast.LENGTH_SHORT).show();
    }
}
