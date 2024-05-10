package com.example.Library_Management_043;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activityadminLogin extends AppCompatActivity {

    private Button button;
    EditText UserName, Password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        button = findViewById(R.id.btnback1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });

        UserName = findViewById(R.id.txtUserName1);
        Password = findViewById(R.id.txtpass1);
        login = findViewById(R.id.login1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UserName.getText().toString().isEmpty() || Password.getText().toString().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Fields can't be null", Toast.LENGTH_SHORT).show();
                }
                else {
                    boolean valid;

                    if (UserName.getText().toString().equals("DPHerath") && Password.getText().toString().equals("HMDPH1#")) {
                        Toast.makeText(getApplicationContext(), "Succesfully logged as Admin", Toast.LENGTH_SHORT).show();
                        Intent libAdmin = new Intent(getApplicationContext(), adminMenu.class);
                        startActivity(libAdmin);
                        valid = true;

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Invalid Login", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });


    }

    public void MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
