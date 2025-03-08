package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    TextView tv1;
    Exponent e= new Exponent();
    Factorial f= new Factorial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);

    }

    public void addition(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();
        int n1, n2, res;
        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);
        res = n1 + n2;
        tv1.setText(n1+"+"+n2+" = "+res);
    }

    public void substraction(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();
        int n1, n2, res;
        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);
        res = n1 - n2;
        tv1.setText(n1+"-"+n2+" = "+res);
    }

    public void multiplication(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();
        int n1, n2, res;
        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);
        res = n1 * n2;
        tv1.setText(n1+"*"+n2+" = "+res);
    }

    public void division(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();
        int n1, n2;
        double res;
        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);
        res = (double) n1 / n2;
        tv1.setText(n1+"/"+n2+" = "+res);
    }

    public void factorial(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        int n1, res = 1;
        n1 = Integer.parseInt(value1);
        res= f.factorial(n1);
        tv1.setText(n1+"! = "+res);
    }

    public void exponential(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();
        int n1, n2;
        double res = 1;
        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);
        res= e.exp(n1,n2);
        tv1.setText(n1+"^"+n2+" = "+res);
    }

    public void reversal(View view) {
        et1 = (EditText) findViewById(R.id.et11);
        et2 = (EditText) findViewById(R.id.et22);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();

        int n1, n3, nr = 0;
        double res = 1;
        n1 = Integer.parseInt(value1);
        n3 = Integer.parseInt(value1);
        while (n1 != 0) {
            nr = nr * 10 + n1 % 10;
            n1 /= 10;
        }
        tv1.setText(n3+" inverted is: "+nr);
    }

    public void sqroot(View view){
        et1 = (EditText) findViewById(R.id.et11);
        tv1 = (TextView) findViewById(R.id.tv11);
        String value1 = et1.getText().toString();
        int n1;
        double res = 0;
        n1 = Integer.parseInt(value1);
        res= Math.sqrt(n1);
        tv1.setText("√"+n1+" = "+res);
    }
    public void sen(View view){
        EditText et1 = (EditText) findViewById(R.id.et11);
        EditText et2 = (EditText) findViewById(R.id.et22);
        TextView tv1 = (TextView) findViewById(R.id.tv11);
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        float n1, n2;
        int z = 1;
        n1 = Float.parseFloat(valor1);
        n2 = Float.parseFloat(valor2);

        double sum = 0;
        for (int i = 1; i <= n2; i++) {
            if (i % 2 == 0) {
                sum = sum + ((e.exp(n1, z)) / f.factorial(z)) * -1;
            } else {
                sum = sum + (e.exp(n1, z)) / f.factorial(z);
            }
            z = z + 2;
        }
        tv1.setText("El seno de"+n1+" es: "+sum);
    }
    public void cos(View view){
        EditText et1 = (EditText) findViewById(R.id.et11);
        EditText et2 = (EditText) findViewById(R.id.et22);
        TextView tv1 = (TextView) findViewById(R.id.tv11);
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        float n1, n2;
        int z = 0;
        n1 = Float.parseFloat(valor1);
        n2 = Float.parseFloat(valor2);
        double sum = 0;
        for (int i = 1; i <= n2; i++) {
            if (i % 2 == 0) {
                sum = sum + ((e.exp(n1, z)) / f.factorial(z)) * -1;
            } else {
                sum = sum + (e.exp(n1, z)) / f.factorial(z);
            }
            z = z + 2;
        }
        tv1.setText("El coseno de "+n1+" es: " + sum);
    }
}