package com.lisbeth.alertsanddates;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

public class ChoseDateTime extends AppCompatActivity {

    private static final Dialog DIALOG_TIME = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_date_time);
    }

    public void date(View view) {
        DialogFragment newFragment  = new Date();
        newFragment.show(getSupportFragmentManager());

    }

    public void time(View view) {
    }
}