package org.example.service;
import org.example.model.PaymentValidation;
import org.example.model.Student;
import java.util.HashMap;
import java.util.Map;

public class TuitionServiceImpl implements ITuitionService {
    private final double RATE_PER_COURSE = 1500.00; // Fixed rate for calculation
    private Map<String, Double> studentBalances = new HashMap<>();

    @Override
    public double calculateFee(Student student) {
        return student.getEnrolledSections().size() * RATE_PER_COURSE;
    }

    @Override
    public void makePayment(Student student, double amount) {
        double currentBalance = getRemainingBalance(student);
        studentBalances.put(student.getStudentId(), currentBalance - amount);
        System.out.println("Payment of " + amount + " processed for " + student.getName());
    }

    @Override
    public double getRemainingBalance(Student student) {
        return studentBalances.getOrDefault(student.getStudentId(), calculateFee(student));
    }

    public void validatePayment(Student s) throws PaymentValidation {
        if (s.getTuitionFee() > 5000.0) {
            throw new PaymentValidation("Rejection: Outstanding balance is $" + s.getTuitionFee());
        }
    }
}