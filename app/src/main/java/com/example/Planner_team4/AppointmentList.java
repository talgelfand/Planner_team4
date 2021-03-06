package com.example.Planner_team4;

import android.util.Log;

import java.util.ArrayList;

class AppointmentList {
    private static AppointmentList instance;

    private ArrayList<Appointment> appointmentList;

    private AppointmentList() {
        this.appointmentList = new ArrayList<Appointment>();
    }

    public static AppointmentList getInstance() {
        if(instance == null) {
            instance = new AppointmentList();
        }
        return instance;
    }

    public ArrayList<Appointment> getList() {
        return this.appointmentList;
    }

    public Appointment getAppointment(int item) {
        return this.appointmentList.get(item);
    }
}
