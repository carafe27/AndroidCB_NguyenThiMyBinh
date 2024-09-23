package com.example.calcultor;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean isNewOp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.result);

        // Các nút số
        int[] numberButtons = {
                R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        };

        for (int id : numberButtons) {
            findViewById(id).setOnClickListener(view -> {
                String value = ((Button) view).getText().toString();
                appendOnDisplay(value);
            });
        }

        // Các nút phép toán
        int[] operatorButtons = {
                R.id.btnPlus, R.id.btnMinus, R.id.btnMultiply, R.id.btnDivide,
                R.id.btnPercent, R.id.btnLeftParenthesis, R.id.btnRightParenthesis
        };

        for (int id : operatorButtons) {
            findViewById(id).setOnClickListener(view -> {
                String value = ((Button) view).getText().toString();
                appendOnDisplay(value);
            });
        }

        // Nút "AC" - Xóa tất cả
        findViewById(R.id.btnAC).setOnClickListener(view -> textView.setText(""));

        // Nút "=" - Tính toán kết quả
        findViewById(R.id.btnEquals).setOnClickListener(view -> calculate());

        // Nút "OFF" - Thoát ứng dụng
        findViewById(R.id.btnOff).setOnClickListener(view -> finish());
    }

    private void appendOnDisplay(String value) {
        if (isNewOp) {
            textView.setText("");
        }
        isNewOp = false;
        textView.append(value);
    }

    private void calculate() {
        try {
            String expressionStr = textView.getText().toString();
            Expression expression = new ExpressionBuilder(expressionStr).build();
            double result = expression.evaluate(); // Tính toán kết quả
            textView.setText(String.valueOf(result));
            isNewOp = true;
        } catch (Exception e) {
            textView.setText("Error");
        }
    }
}
