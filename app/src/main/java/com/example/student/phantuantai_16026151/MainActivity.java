package com.example.student.phantuantai_16026151;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSo1;
    EditText editSo2;
    TextView tvResult;
    Button btnSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSo1 = (EditText)findViewById(R.id.editSo1);
        editSo2 = (EditText)findViewById(R.id.editSo2);
        tvResult = (TextView)findViewById(R.id.tvResult);
        btnSum = (Button)findViewById(R.id.btnSum);
        btnSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int result = Integer.parseInt(editSo1.getText().toString()) + Integer.parseInt(editSo2.getText().toString());
                tvResult.setText("Tổng hai số là : " + result);
                editSo1.setText("");
                editSo2.setText("");
            }
        });
    }


}
