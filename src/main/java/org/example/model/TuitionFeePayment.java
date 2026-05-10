package org.example.model;

public class TuitionFeePayment {
    private String studentId;
    private double balance;

    public TuitionFeePayment(String studentId, double initialTuition) {
        this.studentId = studentId;
        this.balance = initialTuition;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStudentId() {
        return studentId;
    }
}