package com.example.tema_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.d( tag: "debug", msg: "Este es mi mensaje de debug");
        log.i( tag: "informacion", msg: "Este es mi mensaje de información");
        log.w( tag: "warning", msg: "Este es mi mensaje de warning");
        log.e( tag: "error", msg: "Este es mi mensaje de error");
    }
}