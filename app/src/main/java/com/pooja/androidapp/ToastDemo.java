package com.pooja.androidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ToastDemo extends AppCompatActivity {

    public void showTost(View view) {
        EditText name = (EditText) findViewById(R.id.enterNameId);
        Toast.makeText(ToastDemo.this, "Hi there, " + name.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_demo);
    }
}
