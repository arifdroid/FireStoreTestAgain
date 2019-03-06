package com.example.firestoretestagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;

public class InitActivity extends AppCompatActivity {

    private Button buttonGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
       // FirebaseApp.initializeApp(InitActivity.this);

        buttonGo = findViewById(R.id.buttonMainID);

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InitActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
