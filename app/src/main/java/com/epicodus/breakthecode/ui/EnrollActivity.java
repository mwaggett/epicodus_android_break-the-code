package com.epicodus.breakthecode.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.breakthecode.R;

public class EnrollActivity extends AppCompatActivity {

    private TextView mInfoRequest;
    private EditText mNameText;
    private EditText mEmailText;
    private Button mSubmitButton;
    private TextView mThankYouText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        mInfoRequest = (TextView) findViewById(R.id.infoRequestLabel);
        mNameText = (EditText) findViewById(R.id.nameText);
        mEmailText = (EditText) findViewById(R.id.emailText);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mThankYouText = (TextView) findViewById(R.id.thankYouLabel);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                String email = mEmailText.getText().toString();
                String message = String.format(
                        "Hello %s, thank you for your interest in Break the Code!\n\n"+
                                "We have sent more information by email to %s.", name, email);
                mThankYouText.setText(message);
                mInfoRequest.setVisibility(View.INVISIBLE);
                mNameText.setVisibility(View.INVISIBLE);
                mEmailText.setVisibility(View.INVISIBLE);
                mSubmitButton.setVisibility(View.INVISIBLE);
                mThankYouText.setVisibility(View.VISIBLE);
            }
        });
    }
}
