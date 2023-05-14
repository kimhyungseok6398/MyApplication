package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ImageView login_image;
    EditText login_id, login_pw;
    Button login_button;
    String m_id = "user", m_pw = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   //xml 과 변수를 연결
        //login_image = findViewById(R.id.login_image);
        login_id = findViewById(R.id.login_id);
        login_pw = findViewById(R.id.login_pw);
        login_button = findViewById(R.id.login_button);
          
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = login_id.getText().toString();
                String pw = login_pw.getText().toString();
                if(id.equals(m_id) && pw.equals(m_pw)){
                    Toast.makeText(getApplicationContext(), "로그인 성공!", Toast.LENGTH_LONG).show();
                    //화면을 프로덕트페이지로 이동시킨다
                    Intent intent = new Intent(MainActivity.this,productactivity.class);
                    intent.putExtra("main_id",id);
                    startActivity(intent);
                    //기존화면은 종료
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(), "로그인 실패ㅠㅠ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}