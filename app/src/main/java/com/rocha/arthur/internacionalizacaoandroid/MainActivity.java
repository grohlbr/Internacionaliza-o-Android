package com.rocha.arthur.internacionalizacaoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValue = (TextView) findViewById(R.id.tvValue);

        tvValue.setText(R.string.value);
    }
}
