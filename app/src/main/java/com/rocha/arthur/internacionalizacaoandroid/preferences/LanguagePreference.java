package com.rocha.arthur.internacionalizacaoandroid.preferences;

import android.content.Context;
import android.content.SharedPreferences;
/**
 * @author ARTHUR ROCHA
 */
public class LanguagePreference {
    private static final String KEY = "LANGUAGE.PREFERENCE";

    public static void setLanguage(Context context, String language){
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY,0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("language", language);

        editor.commit();
    }

    public static String getLanguage(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY, 0);
        String language = sharedPreferences.getString("language", null);
        return language != null ? language : null;
    }

    public static void setClearLanguage(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.clear();
        editor.commit();
    }
}
