package com.cornez.bloodbanksystem.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.cornez.bloodbanksystem.Activity.AuthActivity;
import com.cornez.bloodbanksystem.Activity.MenuActivity;
import com.cornez.bloodbanksystem.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email, pass;
    Button Submit;

    FirebaseAuth Auth;

    String Email_s,Pass_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email1);
        pass = findViewById(R.id.password);
        Submit = findViewById(R.id.auth);
        Auth = FirebaseAuth.getInstance();



        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Email_s = email.getText().toString().trim();
                Pass_s = pass.getText().toString().trim();


                if(TextUtils.isEmpty(Email_s)){
                    Toast.makeText(LoginActivity.this, "Enter Email", Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(Pass_s)){
                    Toast.makeText(LoginActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
                if(Pass_s.length()<6){
                    Toast.makeText(LoginActivity.this, "pass too short", Toast.LENGTH_SHORT).show();
                }else

                Auth.signInWithEmailAndPassword(Email_s, Pass_s)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();



                                } else {
                                    Toast.makeText(LoginActivity.this, "Login Not Successful", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });



            }
        });
    }


    public void Create(View view) {
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }
}
