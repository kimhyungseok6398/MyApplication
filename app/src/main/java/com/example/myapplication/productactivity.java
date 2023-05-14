package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class productactivity extends AppCompatActivity {
    TextView product_text;
    Button result_button;
    GridView grid_View;

    String pdt_name[] = {"아이폰","맥북","키보드","마우스"};
    int pdt_image[] = {R.drawable.iphone,R.drawable.macbook,
            R.drawable.keyboard,R.drawable.mouse};
    int pdt_price[] = {1000000,2000000,50000,12000};
    int pdt_count



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productactivity);

        //화면과 변수를 연결
        result_text = findViewById(R.id.reslut_text);
        result_button = findViewById(R.id.result_button);
        grid_View = findViewById(R.id.grid_view);

        //버튼 클릭 기능 추가(결제하기)
        result_button.setOnClickListener(new View.onCancelPendingInputEvents());
        pub
    }
}