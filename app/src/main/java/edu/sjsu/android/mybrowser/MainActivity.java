package edu.sjsu.android.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = (TextView) findViewById(R.id.textview);
        Intent intent = getIntent();
        String websiteAddress = intent.getStringExtra("the content");
        textview.setText(websiteAddress);
    }
}