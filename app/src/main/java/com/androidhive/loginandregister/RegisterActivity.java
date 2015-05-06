package com.androidhive.loginandregister;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View to register.xml
        setContentView(R.layout.register);


              // link to login
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        EditText fullName = (EditText) findViewById(R.id.reg_fullname);
        EditText regEmail=(EditText) findViewById(R.id.reg_email);
        EditText regPass1= (EditText) findViewById(R.id.reg_password);
        EditText regPass2 =(EditText) findViewById(R.id.reg2_password);

        Button regButton= (Button) findViewById(R.id.btnRegister);


        if ( fullName.getText().length() > 0 && regEmail.getText().length() > 0 &&
                regPass1.getText().length() > 0 && regPass2.getText().length() > 0)  {

           regButton.setOnClickListener( new View.OnClickListener() {
               public void onClick(View view) {

                  //TODO här ska koden för actvity som ska läsa användarens cloud filer

               }
           });


        }else {

            Toast.makeText(getApplicationContext(), "Please fill in all fields ", Toast.LENGTH_LONG).show();


        }


        // Listening to Login Screen link
        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // Switching to Login Screen/closing register screen


                finish();
            }
        });



    }
}