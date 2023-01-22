package com.example.controle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn_reinitializer;
    Button btn_quitter;
    EditText number;
    Button btn_afficher;
    TextView textview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_reinitializer=findViewById(R.id.btn_1);
        btn_afficher=findViewById(R.id.btn_2);
        btn_quitter=findViewById(R.id.btn_3);
        number =findViewById(R.id.et_number);
        textview=findViewById(R.id.text_1);
        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });
        
        btn_reinitializer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(null);
                textview.setText("" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?\n" +
                        "         ? * 0 =?");

            }
        });



        Toast toast;
        toast=Toast.makeText(MainActivity.this,"veuillez saisir un entier",Toast.LENGTH_SHORT);

        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int Number1 = Integer.parseInt(number.getText().toString());
                    String s = "";
                    for (int i = 1; i <= 10; i++) {
                        int result = Number1 * i;
                        s += String.format(" %d*%d=%d \n", Number1, i, result);
                        result = 0;

                    }
                    textview.setText(s);
                } catch (NumberFormatException e) {
                    toast.show();

                }
            }

        });


    }

}

