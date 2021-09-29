package com.example.reconnect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Reconnect_signIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setName(View view){
        final TextView nameView = findViewById(R.id.nameView);
        final EditText inputName = findViewById(R.id.inputname);
        final String nameValue = inputName.getText().toString();
        nameView.setText(nameValue);

        final TextView emailView = findViewById(R.id.emailView);
        final EditText inputEmail = findViewById(R.id.inputEmail);
        final String EmailValue = inputEmail.getText().toString();
        emailView.setText(EmailValue);

        final TextView phoneView = findViewById(R.id.phoneView);
        final EditText inputPhone = findViewById(R.id.inputPhone);
        final String phoneValue = inputPhone.getText().toString();
        phoneView.setText(phoneValue);

    }

}
