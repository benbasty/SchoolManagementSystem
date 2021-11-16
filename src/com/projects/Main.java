package com.projects;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to ABCD School Management System");

        Student karl = new Student(5,"Karl",5);
        Student anna = new Student(1,"Karl",4);
        Student carla = new Student(2,"Karl",3);
        Student bebo = new Student(3,"Karl",5);
        Student farlo = new Student(4,"Farlo",4);
        List<Student> students = new ArrayList<>();
        students.add(karl);
        students.add(anna);
        students.add(carla);
        students.add(bebo);
        students.add(farlo);

        Teacher lizzy = new Teacher(100,"Lizzy",9000);
        Teacher bob = new Teacher(101,"Bob",9200);
        Teacher robert = new Teacher(104,"Robert",9100);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(lizzy);
        teachers.add(bob);
        teachers.add(robert);

        School abcd = new School(teachers,students);
        Teacher megan = new Teacher(102,"Megan",9150);
        abcd.addTeacher(megan);

        karl.payFees(1000);
        anna.payFees(2000);
        carla.payFees(3000);
        bebo.payFees(3500);
        farlo.payFees(4000);
        karl.payFees(7000);
        anna.payFees(7000);
        carla.payFees(6000);
        bebo.payFees(6000);
        farlo.payFees(4000);
        karl.payFees(1500);

        System.out.println("Total Fees Paid For Karl: " + karl.totalFeesPaid() + "$");
        System.out.println("Total Fees Paid For Anna: " + anna.totalFeesPaid() + "$");
        System.out.println("Total Fees Paid For Carla: " + carla.totalFeesPaid() + "$");
        System.out.println("Total Fees Paid For Bebo: " + bebo.totalFeesPaid() + "$");
        System.out.println("Total Fees Paid For Farlo: " + farlo.totalFeesPaid() + "$");

        System.out.println();

        System.out.println("Remaining Fees For Karl: " + karl.getRemainingFees() + "$");
        System.out.println("Remaining Fees For Anna: " + anna.getRemainingFees() + "$");
        System.out.println("Remaining Fees For Carla: " + carla.getRemainingFees() + "$");
        System.out.println("Remaining Fees For Bebo: " + bebo.getRemainingFees() + "$");
        System.out.println("Remaining Fees For Farlo: " + farlo.getRemainingFees() + "$");

        System.out.println();

        System.out.println("ABCD has earned $" + abcd.getTotalMoneyEarned());






    }
}
