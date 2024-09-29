import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassroomManagerTest {

    // Unit test for calculateTotalStudents
    @Test
    public void testCalculateTotalStudents() {
        ClassroomManager manager = new ClassroomManager();
        int result = manager.calculateTotalStudents(10, 15);
        assertEquals(25, result, "Total students should be 25");
    }

    // Unit test for isClassFull
    @Test
    public void testIsClassFull() {
        ClassroomManager manager = new ClassroomManager();
        boolean result = manager.isClassFull(30, 30);
        assertTrue(result, "Class should be full when current students equal capacity");
    }

    // Unit test for addStudent
    @Test
    public void testAddStudent() {
        ClassroomManager manager = new ClassroomManager();
        int result = manager.addStudent(28);
        assertEquals(29, result, "Number of students should increase by 1");
    }

    // Unit test for calculateAttendancePercentage
    @Test
    public void testCalculateAttendancePercentage() {
        ClassroomManager manager = new ClassroomManager();
        double result = manager.calculateAttendancePercentage(20, 25);
        assertEquals(80.0, result, 0.01, "Attendance percentage should be 80%");
    }

    // Unit test for promoteStudent
    @Test
    public void testPromoteStudent() {
        ClassroomManager manager = new ClassroomManager();
        String result = manager.promoteStudent("1st Grade");
        assertEquals("2nd Grade", result, "Student should be promoted to 2nd Grade");
    }
}
