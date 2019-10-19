package com.example.seg2105walkinclinicservicesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDataBase;
    private Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check if user is signed in (non-null) and update UI accordingly.
        mAuth = FirebaseAuth.getInstance();
        mDataBase = FirebaseDatabase.getInstance();

        //Setting the button and interactive elements of the page
        registerButton = findViewById(R.id.registerButton);
    }

    public void registerUser(View v){
        Intent registerIntent = new Intent(this, SelectRegistrationActivity.class);
        startActivity(registerIntent);
    }


}
