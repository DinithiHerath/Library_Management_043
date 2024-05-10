package com.example.Library_Management_043;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        button = findViewById(R.id.btnadminlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminLogin();
            }
        });

        button = findViewById(R.id.btnmemlogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                memberLogin();
            }
        });
    }

    public void signup(){
        Intent intent = new Intent(this, activitysignup.class);
        startActivity(intent);
    }

    public  void adminLogin(){
        Intent intent = new Intent(this, activityadminLogin.class);
        startActivity(intent);
    }
    public  void memberLogin(){
        Intent intent = new Intent(this, activitymemberLogin.class);
        startActivity(intent);
    }
}
