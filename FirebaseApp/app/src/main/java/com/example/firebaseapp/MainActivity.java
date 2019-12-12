package com.example.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText txtname,txtage;
    Button btnSend;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtname=(EditText)findViewById(R.id.txtname);
        txtage=(EditText) findViewById(R.id.txtage);
        btnSend=(Button)findViewById(R.id.btnSend);
        member= new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int agea = Integer.parseInt(txtage.getText().toString().trim());

                member.setName(txtname.getText().toString().trim());
                member.setAge(agea);
                reff.push().setValue(member);
                Toast.makeText(MainActivity.this,"Insertion réussie",Toast.LENGTH_LONG).show();
            }
        });
    }
}
