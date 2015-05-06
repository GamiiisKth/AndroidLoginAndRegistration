package com.androidhive.loginandregister;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // take user to register activity
        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);


        EditText email= (EditText) findViewById(R.id.loginEmail);
        EditText pass =(EditText) findViewById(R.id.loginPassword );
        Button loginButton=(Button) findViewById(R.id.btnLogin);

         if (email.getText().length() >  0 && pass.getText().length() > 0 ){

             loginButton.setOnClickListener(new View.OnClickListener() {
                 public void onClick(View view) {


                     //TODO koden för inloggade användaren , användaresn filer ska laddas in nästa activiy
                 }
             });
         }else{
             Toast.makeText(getApplicationContext(),"Please fill in all fields", Toast.LENGTH_LONG).show();
         }

        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Register screen
				Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
				startActivity(i);
			}
		});
    }
}