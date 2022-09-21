package com.example.HelloConstraints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import HelloConstraints.R;

public class StateSave extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button button_count;
    private TextView mReplyHeadTextView;
    private static final String TEXTVIEW_STATE_KEY = "TEXTVIEW_STATE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.state_save);
        mShowCount = (TextView) findViewById(R.id.show_count2);
        String text = "0";
        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_STATE_KEY))
            text = savedInstanceState.getString(TEXTVIEW_STATE_KEY);
        mShowCount.setText(text);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        TextView myTextView = (TextView)findViewById(R.id.show_count2);
        outState.putString(TEXTVIEW_STATE_KEY, myTextView.getText().toString());
        super.onSaveInstanceState(outState);
    }
}

