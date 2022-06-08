package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int v= 0;
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
                    v++;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run()
                        {
                            count.setText(String.valueOf(v));
                        }
                    });

            }
        }


        }.start();
//앙라릴러

    }
}
