package com.assignment.hrms_applicationm;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Attendance extends AppCompatActivity {
    TextView name;
    CalendarView calendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        calendarView=findViewById(R.id.calendarView);
        name=findViewById(R.id.empname);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String d=dayOfMonth+"/"+month+"/"+"year";
                name.setText(d);
            }
        });

    }
}
