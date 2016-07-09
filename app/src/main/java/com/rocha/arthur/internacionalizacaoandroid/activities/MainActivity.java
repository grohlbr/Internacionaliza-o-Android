package com.rocha.arthur.internacionalizacaoandroid.activities;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;

import com.rocha.arthur.internacionalizacaoandroid.R;
import com.rocha.arthur.internacionalizacaoandroid.preferences.LanguagePreference;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView tvValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValue = (TextView) findViewById(R.id.tvValue);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String languagePreference = LanguagePreference.getLanguage(this);
        String languageDevice = Locale.getDefault().getLanguage();

        if(languagePreference != null){
            if(!languagePreference.equals(languageDevice)){
                LanguagePreference.setLanguage(this, Locale.getDefault().getLanguage());
            }
            setLanguage(languagePreference);
        }else{
            LanguagePreference.setLanguage(this, languageDevice);
        }
        tvValue.setText(R.string.value);
    }

    private void setLanguage(String vLanguage){
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = new Locale(vLanguage);
        resources.updateConfiguration(configuration,displayMetrics);
    }
}
