package com.codegnan.oop;

import java.util.Scanner;

public class DoctorAppointment  extends Appointment {

    @Override
    void schedule() {
        Scanner sc = new Scanner(System.in);

        String specialization = sc.nextLine();
        System.out.println("Specialization: " + specialization);
        System.out.println("Doctor appointment scheduled for " + specialization);
    }
}



