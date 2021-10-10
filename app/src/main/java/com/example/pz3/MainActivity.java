package com.example.pz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pz3.fragment.AuthorsDialogFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button greenBtn;
    private Button redBtn;
    private Button blueBtn;
    private Button yellowBtn;
    private Button imageBtn;
    private Button authorsBtn;
    private ConstraintLayout screenLayout;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greenBtn = (Button) findViewById(R.id.green);
        redBtn = (Button) findViewById(R.id.red);
        blueBtn = (Button) findViewById(R.id.blue);
        yellowBtn = (Button) findViewById(R.id.yellow);
        imageBtn = (Button) findViewById(R.id.image);
        authorsBtn = (Button) findViewById(R.id.authors);
        screenLayout = (ConstraintLayout) findViewById(R.id.screenLayout);

        blueBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        imageBtn.setOnClickListener(this);
        authorsBtn.setOnClickListener(this);

        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.green:{
                screenLayout.setBackgroundColor(Color.parseColor("#A7E541"));
                showToast("green");
                break;
            }
            case R.id.blue:{
                screenLayout.setBackgroundColor(Color.parseColor("#7AB1FF"));
                showToast("blue");
                break;
            }
            case R.id.red:{
                screenLayout.setBackgroundColor(Color.parseColor("#EE3D48"));
                showToast("red");
                break;
            }
            case R.id.yellow:{
                screenLayout.setBackgroundColor(Color.parseColor("#FFF851"));
                showToast("yellow");
                break;
            }
            case R.id.image:{
                screenLayout.setBackgroundResource(R.drawable.image);
                break;
            }
            case R.id.authors:{
                AuthorsDialogFragment dialog = new AuthorsDialogFragment();
                dialog.show(getSupportFragmentManager(), "authors_tag");
            }
        }
    }
    private void showToast(String text) {
        toast.cancel();
        toast.setText(text);
        toast.show();
    }
}