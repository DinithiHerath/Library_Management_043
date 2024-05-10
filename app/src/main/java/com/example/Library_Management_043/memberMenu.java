package com.example.Library_Management_043;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class memberMenu extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_menu);

        button = findViewById(R.id.btnmemberlogout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });

        button = findViewById(R.id.btnserachbook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                serachBooks();
            }
        });


    }

    public void MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void serachBooks(){
        Intent intent = new Intent(this, activityserachBooks.class);
        startActivity(intent);
    }
}
