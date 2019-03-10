package com.example.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public void changeText (View view) {
        TextView helloText = (TextView) findViewById(R.id.helloTitleTextView);
        Log.i("From change Text", "Changing Text");
        helloText.setText("YO!");

        EditText nameTextBox = (EditText) findViewById(R.id.textInputEditText);
        String name = nameTextBox.getText().toString();

        helloText.setText(name);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
