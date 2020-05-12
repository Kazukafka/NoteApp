package com.example.noteapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;


public class InsertActivity extends AppCompatActivity {

    EditText title_input;
    Button add_button;
    MultiAutoCompleteTextView message = (MultiAutoCompleteTextView)findViewById(R.id.me);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        title_input = findViewById(R.id.title_input2);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(InsertActivity.this);
                myDB.addNote(title_input.getText().toString().trim(),
                        message.getText().toString().trim());
            }
        });
    }
}
