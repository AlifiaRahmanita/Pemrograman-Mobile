package com.example.activitypertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtWidhth, edtLength;
    private Button btnCalculate;
    private TextView kelResult, luasResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWidhth = findViewById(R.id.edt_width);
        edtLength = findViewById(R.id.edt_length);
        btnCalculate = findViewById(R.id.btn_calculate);
        kelResult = findViewById(R.id.kel_result);
        luasResult = findViewById(R.id.luas_result);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId()== R.id.btn_calculate){
            String inputLength = edtLength.getText().toString().trim();
            String inputWidth = edtWidhth.getText().toString().trim();

            Double keliling = (Double.parseDouble(inputLength) +
                    Double.parseDouble(inputWidth)) * 2;
            kelResult.setText(String.valueOf(keliling));

            Double luas = (Double.parseDouble(inputLength) *
                    Double.parseDouble(inputWidth));
            luasResult.setText(String.valueOf(luas));
        }
    }
}