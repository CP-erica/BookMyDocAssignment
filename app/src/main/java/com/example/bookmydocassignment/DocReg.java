package com.example.bookmydocassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class DocReg extends AppCompatActivity {

    Button btn_register;
    EditText txtname,txtpass,txtemail,txtphone,txtadd;
    Spinner spiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_reg);

    }
}
