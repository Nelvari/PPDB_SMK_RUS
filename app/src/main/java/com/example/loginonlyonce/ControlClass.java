package com.example.loginonlyonce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SharedMemory;

public class ControlClass extends AppCompatActivity {

    private SharedPreferences mlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mlogin = getSharedPreferences("login", Context.MODE_PRIVATE);

        if (mlogin.getInt("userid", 0) == 0){

            Intent in = new Intent(ControlClass.this, Login.class);
            startActivity(in);
            finish();

        }
        else {

            Intent in = new Intent(ControlClass.this, MainActivity.class);
            startActivity(in);
            finish();

        }

    }
}
