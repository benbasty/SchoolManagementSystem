package com.projects;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public static void updateTotalMoneyEarned(int money) {
        totalMoneyEarned += money;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneySpent(int money) {
        totalMoneySpent += money;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


}
