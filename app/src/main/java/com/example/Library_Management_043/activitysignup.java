package com.example.Library_Management_043;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activitysignup extends AppCompatActivity {

    private Button button;
    private DBManager dbManager;

    EditText editText1, editText2, editText3,editText4,editText5, editText6,editText7;
    Button EnterData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        dbManager= new DBManager(this);
        EnterData = findViewById(R.id.btnSignUpS);
        editText1 = findViewById(R.id.txtFirstName);
        editText2 = findViewById(R.id.txtLastName);
        editText3 = findViewById(R.id.txtPhone);
        editText4 = findViewById(R.id.txtEmailAdd);
        editText5 = findViewById(R.id.txtaddress);
        editText6 = findViewById(R.id.txtUserName);
        editText7 = findViewById(R.id.txtpass);

        button = findViewById(R.id.btnback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });

        EnterData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean valid = true;

                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()
                        || editText3.getText().toString().isEmpty()
                        || editText4.getText().toString().isEmpty()|| editText5.getText().toString().isEmpty()
                        || editText6.getText().toString().isEmpty()|| editText7.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fields can't be null", Toast.LENGTH_LONG).show();
                    valid = false;
                }

                if(valid) {
                    String FirstName = editText1.getText().toString();
                    String LastName = editText2.getText().toString();
                    String Phone = editText3.getText().toString();
                    String EmailAdd = editText4.getText().toString();
                    String Address = editText5.getText().toString();
                    String UserName = editText6.getText().toString();
                    String Password = editText7.getText().toString();


                    dbManager.open();

                    dbManager.insert("insert into Member values(?,'" + FirstName + "','" + LastName + "'," +
                            "'" + Phone + "','" + EmailAdd + "','" + Address + "','" + UserName + "','" + Password + "')");
                    Toast.makeText(getApplicationContext(), "Successfully Inserted", Toast.LENGTH_SHORT).show();
                    Log.e("first","inserted");
                    dbManager.close();
                    Intent login = new Intent(getApplicationContext(), memberMenu.class);
                    startActivity(login);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Error in Sign Up", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
