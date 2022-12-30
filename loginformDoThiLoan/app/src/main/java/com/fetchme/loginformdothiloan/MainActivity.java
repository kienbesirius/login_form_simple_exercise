package com.fetchme.loginformdothiloan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login_button;
    EditText account_editText, password_editText;
    TextView result_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapID();
        setView();
    }

    private void setView() {
        login_button.setOnClickListener(this);
    }

    private void mapID() {
        login_button = findViewById(R.id.login_button);
        account_editText = findViewById(R.id.account_editText);
        password_editText = findViewById(R.id.password_editText);
        result_textView = findViewById(R.id.result_textView);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.login_button: {
                String email = "dtloan@ictu.edu.vn";
                String pass = "123456";
                if(account_editText.getText().toString().trim().equals(email) && password_editText.getText().toString().trim().equals(pass)){
                    Toast.makeText(this, email + "\n" + pass, Toast.LENGTH_SHORT).show();
                    String visibleText = "Tài Khoản: " + email + "\nMật Khẩu: " + pass;
                    result_textView.setText(visibleText);
                    result_textView.setVisibility(View.VISIBLE);
                }else{
                    Toast.makeText(this, "Sai tài khoản Mật Khẩu", Toast.LENGTH_SHORT).show();
                    result_textView.setText("");
                    result_textView.setVisibility(View.INVISIBLE);
                }
                break;
            }
        }
    }
}