 package com.sanved.submissionportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVals();

    }

    public void initVals(){

        user = findViewById(R.id.etUser);
        pass = findViewById(R.id.etPass);
        
        login = findViewById(R.id.bLogin);
        
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                String suser, spass;
                
                suser = user.getText().toString();
                spass = pass.getText().toString();
                
                if(suser.equals("root") && spass.equals("root")){
                    // TODO: 3/12/2019 add the intent 
                    //Intent i = new Intent(this, \)
                }
                
            }
        });

    }
}
