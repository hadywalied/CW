package com.fekra.cw;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private TextInputLayout textInputLoggedInEmail;
    private TextInputLayout textInputLoggedInPassword;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputLoggedInEmail = findViewById(R.id.txt_input_loggedin_email);
        textInputLoggedInPassword = findViewById(R.id.txt_input_loggedin_password);
        btnLogIn = findViewById(R.id.btn_login);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correctDataInput();
            }
        });
    }

    private boolean validateEmailLogin(){
        String enteredEmail = textInputLoggedInEmail.getEditText().getText().toString().trim();

/*
    make a check here if the email is valid
*/

        if (enteredEmail.isEmpty()){
            textInputLoggedInEmail.setError("You should add a valid Email address");
            return false;
        }else {
            textInputLoggedInEmail.setError(null);
            return true;
        }
    }

    private boolean validatePasswordLogin(){
        String enteredEmail = textInputLoggedInEmail.getEditText().getText().toString().trim();

/*
    make a check here if the password is valid
*/

        if (enteredEmail.isEmpty()){
            textInputLoggedInEmail.setError("You should enter your password");
            return false;
        }else {
            textInputLoggedInEmail.setError(null);
            return true;
        }
    }

    private void correctDataInput(){
        if (!validateEmailLogin() | !validatePasswordLogin()){
            return;
        }
/*
    add Intent here to go to the list of the co working
*/
    }
}
