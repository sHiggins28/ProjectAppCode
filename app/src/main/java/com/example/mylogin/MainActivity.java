package com.example.mylogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editName);
        Password = (EditText)findViewById(R.id.editpassword);
        Info = (TextView)findViewById(R.id.info);
        Login = (Button)findViewById(R.id.BtnLogin);


        Info.setText("No of attempts remaining: 5");


        Login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               validate(Name.getText().toString(),Password.getText().toString());
           }
        });
    }



    private void validate(String userName, String userPassword){
        if ((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("No of Attempts remaining :" + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
