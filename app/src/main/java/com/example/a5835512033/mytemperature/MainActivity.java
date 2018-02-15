package com.example.a5835512033.mytemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1,edt2;
    private TextView tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcf(View view) {
        EditText edt1 = findViewById(R.id.edt1);
        TextView tv3 = findViewById(R.id.tv3);
        String sedt1 = edt1.getText().toString();

        if (TextUtils.isEmpty(sedt1)){
            edt1.setError("Error");
        }
        else {
        double cal1=Double.parseDouble(String.valueOf(edt1.getText()));
        cal1 = (cal1 * (9.0 / 5.0)) + 32;
        tv3.setText (cal1 + " Fahrenheit");
        }

    }

    public void calfc(View view) {
        EditText edt2 = findViewById(R.id.edt2);
        TextView tv4 = findViewById(R.id.tv4);
        String sedt2 = edt2.getText().toString();

        if (TextUtils.isEmpty(sedt2)){
            edt2.setError("Error");
        }
        else {
            double cal2=Double.parseDouble(String.valueOf(edt2.getText()));
            cal2 = (cal2-32)*(5.0 / 9.0);
            tv4.setText (cal2 + " Celsius");
        }

    }
}