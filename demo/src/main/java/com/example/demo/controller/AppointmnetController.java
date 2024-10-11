package com.example.demo.controller;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Slf4j
public class AppointmnetController {

    AppointmentService appointmentService;
    public AppointmnetController(AppointmentService appointmentService)
    {
        this.appointmentService=appointmentService;
    }
    @GetMapping("/get")
    public ResponseEntity<Appointment> getApproint()
    {
        return ResponseEntity.ok(appointmentService.getappointmnet());
    }
}
