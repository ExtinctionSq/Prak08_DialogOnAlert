package com.example.dialogforalert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alarm_title);
        myAlertBuilder.setMessage(R.string.alarm_message);
        myAlertBuilder.setPositiveButton(R.string.ok_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pressed Ok", Toast.LENGTH_SHORT).show();

            }
        });
        myAlertBuilder.setNegativeButton(R.string.cancle_button, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Pressed Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.show();

    }
}
