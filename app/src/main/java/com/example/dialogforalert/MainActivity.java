package com.example.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setTitle(getString(R.string.alert_title));
        alertBuilder.setMessage(getString(R.string.alert_message));

        //Add the dialog buttons
        alertBuilder.setPositiveButton(getString(R.string.ok_button_text), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, R.string.ok_button_toast_message, Toast.LENGTH_SHORT).show();
            }
        });

        alertBuilder.setNegativeButton(getString(R.string.cancel_button_text), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, R.string.cancel_button_toast_message, Toast.LENGTH_SHORT).show();
            }
        });

        alertBuilder.show();
    }
}
