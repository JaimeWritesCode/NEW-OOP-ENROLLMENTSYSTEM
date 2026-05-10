import org.example.model.*;
import org.example.service.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EnrollmentServiceTest {

    @Test
    void testEnrollment_WhenSectionIsFull_ThrowsException() {
        Section tinySection = new Section("IT2A", "Tiny Lab", 1);
        Student s1 = new Student("ID101", "Mondregal", 20);
        Student s2 = new Student("ID202", "Andrea", 21);

        IEnrollmentService service = new PersonEnrollment();

        assertDoesNotThrow(() -> service.enrollStudentInSection(s1, tinySection));

        assertThrows(SectionFullException.class, () -> {
            service.enrollStudentInSection(s2, tinySection);
        });
    }

    @Test
    void testPayment_WhenDebtIsHigh_ThrowsException() {
        Student debtStudent = new Student("ID103", "Layla", 19);
        debtStudent.setTuitionFee(6500.0);

        ITuitionService tuitionService = new TuitionServiceImpl();

        assertThrows(PaymentValidation.class, () -> {
            tuitionService.validatePayment(debtStudent);
        });
    }
}