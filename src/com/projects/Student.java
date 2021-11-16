package com.projects;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        totalFees = 10000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return  this.grade;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return this.totalFees - this.feesPaid;
    }

    public int totalFeesPaid() {
        return this.feesPaid;
    }


}
