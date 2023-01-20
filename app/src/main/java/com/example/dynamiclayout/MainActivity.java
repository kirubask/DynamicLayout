package com.example.dynamiclayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText  editTextFiled;
    EditText textViewField;
    Button  generate;
    LinearLayout linearLayout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editTextFiled = findViewById(R.id.edittext);
        textViewField = findViewById(R.id.textView);
        generate = findViewById(R.id.generateBtn);
        linearLayout = findViewById(R.id.linearLayoutSecond);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer edit = Integer.parseInt(editTextFiled.getText().toString());

                Integer textView = Integer.parseInt(textViewField.getText().toString());

                if (!edit.equals("") && !textView.equals("")){
                    Toast.makeText(MainActivity.this, "value added ", Toast.LENGTH_SHORT).show();

                    for (int i = 0; i < textView.intValue(); i++) {
                        TextView textView1 = new TextView( getApplicationContext());
                        textView1.setText("Textview" + String.valueOf(i));
                        linearLayout.addView(textView1);


                    }

                    for (int j = 0; j <edit.intValue() ; j++) {
                        EditText editText = new EditText(getApplicationContext());
                        editText.setText("EditText"+String.valueOf(j));
                        linearLayout.addView(editText);


                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "failed to send the value ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}