package com.cornez.bloodbanksystem.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.cornez.bloodbanksystem.Login.LoginActivity;
import com.cornez.bloodbanksystem.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

//import java.util.regex.Pattern;

public class AuthActivity extends AppCompatActivity {

//    private static final Pattern PASSWORD_PATTERN =
//            Pattern.compile("^" +
//                    "(?=.*[a-zA-Z])" +
//                    "(?=.*[@#$%^&+=])" +
//                    "(?=\\S+$)" +
//                    ".{4,}" +
//                    "$");

    EditText Email, pass, Con_Pass;
    FirebaseAuth Auth;
    Button Submit;
    String Email_s, Pass_s, Con_Pass_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        initialize();

    }


    private void initialize() {

        Email = findViewById(R.id.email1);
        pass = findViewById(R.id.password);
        Submit = findViewById(R.id.auth);
        Con_Pass = findViewById(R.id.conform_password);
        Auth = FirebaseAuth.getInstance();

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Email_s = Email.getText().toString().trim();
                Pass_s = pass.getText().toString().trim();
                Con_Pass_s = Con_Pass.getText().toString().trim();

                if (TextUtils.isEmpty(Email_s)) {
                    Toast.makeText(AuthActivity.this, "Email is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(Pass_s)) {
                    Toast.makeText(AuthActivity.this, "Password is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(Con_Pass_s)) {
                    Toast.makeText(AuthActivity.this, "Conform Password is Empty", Toast.LENGTH_SHORT).show();
                }
                if (Pass_s.length() < 6) {
                    Toast.makeText(AuthActivity.this, "Password too Short", Toast.LENGTH_SHORT).show();
                }
                if (Pass_s.length() > 12) {
                    Toast.makeText(AuthActivity.this, "Password too Long", Toast.LENGTH_SHORT).show();
                }
                if (Pass_s.equals(Con_Pass_s)) {


                    Auth.createUserWithEmailAndPassword(Email_s, Pass_s).addOnCompleteListener(AuthActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                                Toast.makeText(AuthActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(AuthActivity.this, "Wrong Pass/ID", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });}

                }
            });


    }


    }



