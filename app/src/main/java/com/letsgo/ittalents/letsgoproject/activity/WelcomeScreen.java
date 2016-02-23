package com.letsgo.ittalents.letsgoproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.letsgo.ittalents.letsgoproject.R;

public class WelcomeScreen extends AppCompatActivity {
//    private static Button toLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        this.OnClickButtonListener();
    }

    public void OnClickButtonListener(){
//        toLogin = (Button) findViewById(R.id.toLogin);
//        toLogin.setOnClickListener(
//                new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent("android.intent.action.LoginActivity");
//                        startActivity(intent);
//                    }
//                }
//
//        );
    }
}
