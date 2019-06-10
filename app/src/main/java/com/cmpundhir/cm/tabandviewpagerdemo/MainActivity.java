package com.cmpundhir.cm.tabandviewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("myprefs",MODE_PRIVATE);
        editor = preferences.edit();
        //setPrefs();
        String name = preferences.getString("name","default value");
        Toast.makeText(this, "hello "+name, Toast.LENGTH_SHORT).show();

    }
    private void setPrefs(){
        editor.putString("name","kapil");
        editor.commit();
    }
}
