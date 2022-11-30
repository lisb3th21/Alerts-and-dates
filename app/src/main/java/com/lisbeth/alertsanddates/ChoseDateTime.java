package com.lisbeth.alertsanddates;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;

public class ChoseDateTime extends AppCompatActivity {
    DatePickerDialog picker;
    TimePickerDialog picker1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_date_time);
    }

    public void date(View view) {
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);
        picker = new DatePickerDialog(this,
                (view1, year1, monthOfYear, dayOfMonth) -> Toast.makeText(ChoseDateTime.this, dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1, Toast.LENGTH_SHORT).show(), year, month, day);
        picker.show();

    }

    public void time(View view) {
        final Calendar cldr = Calendar.getInstance();
        int houre = cldr.get(Calendar.HOUR_OF_DAY);
        int minute = cldr.get(Calendar.MINUTE);

        // date picker dialog
        picker1 = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                Toast.makeText(ChoseDateTime.this, houre+"h"+minute, Toast.LENGTH_SHORT).show();
            }
        }, houre, minute, DateFormat.is24HourFormat(this));
        picker1.show();


    }

}