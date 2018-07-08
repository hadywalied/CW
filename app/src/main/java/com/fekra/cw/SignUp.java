package com.fekra.cw;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    private TextInputLayout textInputSignUpUserName;
    private TextInputLayout textInputSignUpEmail;
    private TextInputLayout textInputSignUpPassword;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textInputSignUpUserName = findViewById(R.id.txt_input_signed_up_username);
        textInputSignUpEmail = findViewById(R.id.txt_input_signed_up_email);
        textInputSignUpPassword = findViewById(R.id.txt_input__signed_up_password);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataCheckUp();
            }
        });

    }

    private boolean validateUserNameForSignUp(){
        String enteredUsername = textInputSignUpUserName.getEditText().getText().toString().trim();

/*
    make a check here if the user name is valid
*/

        if (enteredUsername.isEmpty() || enteredUsername.length() < 3){
            textInputSignUpPassword.setError("User name should be at lest 3 characters");
            return false;
        }else {
            textInputSignUpPassword.setError(null);
            return true;
        }
    }

    private boolean validateEmailForSignUp(){
        String enteredEmail = textInputSignUpEmail.getEditText().getText().toString().trim();

/*
    make a check here if the email is valid
*/

        if (enteredEmail.isEmpty()){
            textInputSignUpEmail.setError("You should add a valid Email address");
            return false;
        }else {
            textInputSignUpEmail.setError(null);
            return true;
        }
    }

    private boolean validatePasswordForSignUp(){
        String enteredPassword = textInputSignUpPassword.getEditText().getText().toString().trim();

/*
    make a check here if the password is valid
*/

        if (enteredPassword.isEmpty() || enteredPassword.length() < 3){
            textInputSignUpPassword.setError("Password should at least 6 characters");
            return false;
        }else {
            textInputSignUpPassword.setError(null);
            return true;
        }
    }

    private void dataCheckUp(){
        if (!validateEmailForSignUp() | !validatePasswordForSignUp() | !validateUserNameForSignUp()){
            return;
        }
/*
    add Intent here to go to the success page or log in page
*/
    }

}
