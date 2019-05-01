package com.example.assignment_alaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register(View view) {
        EditText nf=findViewById(R.id.first);
        EditText nl=findViewById(R.id.last);
        TextView da=findViewById(R.id.date);



        Intent myIntent =new Intent(this,Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("first",nf.getText().toString());
        b.putString("last",nl.getText().toString());
        b.putString("DateOfBirth",da.getText().toString());




        myIntent.putExtras(b);

        startActivity(myIntent);




    }
}
