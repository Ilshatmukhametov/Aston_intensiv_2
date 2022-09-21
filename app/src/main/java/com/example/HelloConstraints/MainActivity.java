package com.example.HelloConstraints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import HelloConstraints.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button button_count;
    private Button button_zero;
    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_count = (Button) findViewById(R.id.button_count);
        button_zero = (Button) findViewById(R.id.zero_button);
        Log.i("MainActivity", "MainActivity layout is complete");
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, ToastPage.class);
        intent.putExtra(EXTRA_MESSAGE, String.valueOf(mCount));
        startActivity(intent);
        Log.i("MainActivity", String.valueOf(mCount));
    }

    public void countUp(View view) {
        mCount++;
        button_zero.setBackgroundColor(Color.GREEN);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            button_count.setBackgroundColor(Color.BLUE);
        }
        else {
            button_count.setBackgroundColor(Color.RED);
        }

    }

    public void set_zero(View view) {
        mCount = 0;
        button_zero.setBackgroundColor(getResources().getColor(R.color.grey));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}