package com.example.demo.service;

import com.example.demo.model.Appointment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AppointmnetServcieImpl implements AppointmentService{
    List<Appointment> appointmentsList= new ArrayList<Appointment>();

    public AppointmnetServcieImpl()
    {
        Appointment appointment=new Appointment("test",1);
        appointmentsList.add(appointment);
    }
    @Override
    public Appointment addAppointment(Appointment obj) {
        appointmentsList.add(obj);
        return obj;
    }

    @Override
    public Appointment getappointmnet() {
        System.out.println("hi");
        return appointmentsList.get(0);
    }
}
