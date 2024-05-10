package com.example.Library_Management_043;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminMenu extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        button = findViewById(R.id.btnlogout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });

        button = findViewById(R.id.btnaddingB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manageBooks();
            }
        });

        button = findViewById(R.id.btnmanagepub);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                managePublisher();
            }
        });

        button = findViewById(R.id.btnbranch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manageBranch();
            }
        });

        button = findViewById(R.id.btnlending);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lending();
            }
        });

    }

    public void manageBooks(){
        Intent intent = new Intent(this, manageBooks.class);
        startActivity(intent);
    }

    public void managePublisher(){
        Intent intent = new Intent(this, managePublisher.class);
        startActivity(intent);
    }

    public void manageBranch(){
        Intent intent = new Intent(this, manageBranch.class);
        startActivity(intent);
    }

    public void lending(){
        Intent intent = new Intent(this, activityBorrow.class);
        startActivity(intent);
    }

    public void MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
