package com.example.tsuyoshioka.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count= 0;
    private TextView counter_text;
    private Button push_btn;
    private Button push_btn_reset;
    private Button push_btn_random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //追加画面のアイテムと紐付け
        counter_text = (TextView) findViewById(R.id.text_counter);
        push_btn = (Button) findViewById(R.id.btn_push);
        push_btn_reset = (Button) findViewById(R.id.btn_reset);
        push_btn_random = (Button) findViewById(R.id.btn_random);

        //クリック
        push_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                counter_text.setText(String.valueOf(count));
            }
        });
        push_btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                counter_text.setText(String.valueOf(count));
            }
        });
        push_btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=(int)(Math.random() * 100);
                counter_text.setText(String.valueOf(count));
            }
        });
    }
}
