package com.practica.gestiontoque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private TextView norte;
    private StringBuilder builder = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        norte = (TextView) findViewById(R.id.norte);
        norte.setText("Arrastre");
        norte.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        builder = new StringBuilder();
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                builder.append("Down");
                break;
            case MotionEvent.ACTION_MOVE:
                builder.append("Move");
                break;
            case MotionEvent.ACTION_CANCEL:
                builder.append("Cancel");
                break;
            case MotionEvent.ACTION_UP:
                builder.append("Up");
                break;
        }
        norte.setText(builder);
        return true;
    }
}
