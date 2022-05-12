package sg.edu.rp.c346.id21035817.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    private double calcPay(double price, double discount) {
        double pay = price * (1 - discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBox);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("MyActivity", "Inside onClick()");
                Log.v("MyActivity", "Inside onClick()");
                Log.d("MyActivity", "Inside onClick()");
                Log.w("MyActivity", "Inside onClick()");
                Log.e("MyActivity", "Inside onClick()");

                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();

                if (cbEnabled.isChecked()) {
                    tvShow.setText("The discount is given.");
                } else {
                    tvShow.setText("The discount is not given.");
                }
            }
        });
    }
}