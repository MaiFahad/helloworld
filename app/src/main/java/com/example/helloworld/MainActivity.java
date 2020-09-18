package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
EditText E;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.hbutton);
        E = (EditText) findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String s = E.getText().toString();
                sendData(s);

            }
        })
    ;}

    private void sendData(String s) {
        Intent intent = new Intent(this , hello.class);
        intent.putExtra("PersonName",s);
        startActivity(intent);

    }
}