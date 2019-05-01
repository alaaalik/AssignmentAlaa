package com.example.assignment_alaa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name=findViewById(R.id.n);
        TextView d=findViewById(R.id.dat);

        Bundle b=getIntent().getExtras();
        String first=b.getString("first");
        String last=b.getString("last");
        String Date=b.getString("DateOfBirth");
        name.setText("Name :" +first + " " +last);
        d.setText(Date);


    }
}
