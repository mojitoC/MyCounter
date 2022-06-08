package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.count);

        new Thread(){
            @Override
            public void run() {

                for(int i = 0; i < 10; i++){
                    SystemClock.sleep(100);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run()
                        {
                            count.setText();
                        }
                    });

            }
        }


        }.start();


    }
}