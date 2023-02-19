package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //입력된 숫자 더하기 logic
    public void btnAddClicked(View view){
        EditText Num1 = findViewById(R.id.Num1);
        EditText Num2 = findViewById(R.id.Num2);
        TextView Result = findViewById(R.id.Result);

        //양 옆 공백 제거
        Num1.setText(Num1.getText().toString().trim());
        Num2.setText(Num2.getText().toString().trim());

        if(Num1.getText().toString().length()==0) {
            toastMsg("숫자1을 입력해주세요.");
            Num1.requestFocus();
            return;
        }

        if(Num2.getText().toString().length()==0){
            toastMsg("숫자2를 입력해주세요.");
            Num2.requestFocus();
            return;
        }

        int num1 = Integer.parseInt(Num1.getText().toString());
        int num2 = Integer.parseInt(Num2.getText().toString());
        int rs = num1 + num2;
        Result.setText("결과: " + rs);

        Toast.makeText(getApplicationContext(), "결과 : "+ rs, Toast.LENGTH_LONG).show();
    }

    void toastMsg(String msg){
        Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_SHORT).show();
    }

    //I/O Clear logic
    public void btnDeleteClicked(View view) {
        EditText Num1 = findViewById(R.id.Num1);
        EditText Num2 = findViewById(R.id.Num2);
        TextView Result = findViewById(R.id.Result);

        Num1.setText("");
        Num2.setText("");
        Result.setText("");
    }
}