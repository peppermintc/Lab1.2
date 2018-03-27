package org.androidtown.lab12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText edit_name;
    public Button   btn_print;
    public Button   btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    //reference activity_main and run init method

    public void init(){
        edit_name  = findViewById(R.id.edittext1);
        btn_clear  = findViewById(R.id.button1);
        btn_print  = findViewById(R.id.button2);
        view_print = findViewById(R.id.textview1);
    }
    //references views

    public void clearClicked(View v) {
        edit_name.setText("");
        view_print.setText("contents");
    }
    //resets the text view that shows name

    public void printClicked(View v) {
        String text = "";
        text = edit_name.getText().toString();
        view_print.setText(text);
    }
    //prints the name on text view

}
