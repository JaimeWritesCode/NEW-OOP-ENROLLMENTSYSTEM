import org.example.model.*;
import org.example.service.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class EnrollmentServiceTest {

    @Test
    void testEnrollment_WhenSectionIsFull_ThrowsException() {
        Section IT2A = new Section("S01", "IT2A", 1);
        Student s1 = new Student("S101", "Alice", 20);
        Student s2 = new Student("S102", "Bob", 21);
        IEnrollmentService service = new PersonEnrollment();

        assertDoesNotThrow(() -> service.enrollStudentInSection(s1, IT2A));

        assertThrows(SectionFullException.class, () -> {
            service.enrollStudentInSection(s2, IT2A);
        });
    }

    @Test
    void testPayment_WhenDebtIsHigh_ThrowsException() {
        Student debtStudent = new Student("ID105", "Defferson", 20);
        debtStudent.setTuitionFee(6000.0); // Over the 5000 limit
        ITuitionService tuitionService = new TuitionServiceImpl();

        assertThrows(PaymentValidation.class, () -> {
            tuitionService.validatePayment(debtStudent);
        });
    }

    @Test
    void testEnrollment_SuccessfulPath() throws SectionFullException {
        Section IT2D = new Section("S02", "IT2D", 30);
        Student goodStudent = new Student("ID305", "Alice", 20);
        IEnrollmentService service = new PersonEnrollment();

        service.enrollStudentInSection(goodStudent, IT2D);

        assertTrue(IT2D.getEnrolledStudents().contains(goodStudent), "Student should be in the list");
        assertEquals(1, IT2D.getEnrolledStudents().size());
    }

    @Test
    void testTuitionCalculation_MultipleSections() throws SectionFullException {
        Student s = new Student("ID101", "Miguel", 20);
        Section sec1 = new Section("S01", "Java", 30);
        Section sec2 = new Section("S02", "Python", 30);

        IEnrollmentService enrollment = new PersonEnrollment();
        ITuitionService tuition = new TuitionServiceImpl();

        enrollment.enrollStudentInSection(s, sec1);
        enrollment.enrollStudentInSection(s, sec2);

        assertEquals(3000.0, tuition.calculateFee(s), "Tuition should be 1500 per course");
    }

    @Test
    void testDepartmentAndInstructorLinkage() {

        Department ccs = new Department("D01", "College of Computer Studies", new ArrayList<>());
        Section javaSection = new Section("S01", "Advanced Java", 30);
        Instructor prof = new Instructor("P01", "Dr. Strange", 45, "Cybersecurity");

        javaSection.setAssignedInstructor(prof);
        ccs.getSections().add(javaSection);


        assertEquals(1, ccs.getSections().size());
        assertEquals("Advanced Java", ccs.getSections().get(0).getSectionName());

        assertNotNull(javaSection.getAssignedInstructor());
        assertEquals("Dr. Strange", javaSection.getAssignedInstructor().getName());
    }

}