package com.codegnan.oop;

import java.util.Scanner;

public class DentistAppointment extends Appointment {

    @Override
    void schedule() {
        Scanner sc = new Scanner(System.in);

        String procedure = sc.nextLine();
        System.out.println("Dental procedure: " + procedure);
        System.out.println("Dentist appointment scheduled for " + procedure);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Appointment appt = new Appointment();
        appt.schedule();

        DoctorAppointment doc = new DoctorAppointment();
        doc.schedule();

        DentistAppointment den = new DentistAppointment();
        den.schedule();
    }
}
	


