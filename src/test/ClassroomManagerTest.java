import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassroomManagerTest {
    private ClassroomManager classroomManager;

    @BeforeEach
    public void setUp() {
        classroomManager = new ClassroomManager();
    }

    @Test
    public void testCalculateTotalStudents() {
        // Test normal case
        int totalStudents = classroomManager.calculateTotalStudents(15, 20);
        assertEquals(35, totalStudents);
        
        // Test edge case with zero
        totalStudents = classroomManager.calculateTotalStudents(0, 0);
        assertEquals(0, totalStudents);
    }

    @Test
    public void testIsClassFull() {
        // Test class is full
        assertTrue(classroomManager.isClassFull(30, 30));
        
        // Test class is not full
        assertFalse(classroomManager.isClassFull(29, 30));
        
        // Test edge case where class has 0 students
        assertFalse(classroomManager.isClassFull(0, 30));
    }

    @Test
    public void testAddStudent() {
        // Test adding a student when class is not full
        int newCount = classroomManager.addStudent(29);
        assertEquals(30, newCount);
        
        // Test adding a student when class is full
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.addStudent(30);
        });
        assertEquals("Class is already full", exception.getMessage());
    }

    @Test
    public void testCalculateAttendancePercentage() {
        // Test normal case
        double percentage = classroomManager.calculateAttendancePercentage(20, 100);
        assertEquals(20.0, percentage, 0.01);

        // Test edge case with no students
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.calculateAttendancePercentage(20, 0);
        });
        assertEquals("Total students cannot be zero", exception.getMessage());
    }

    @Test
    public void testPromoteStudent() {
        // Test valid promotions
        assertEquals("2nd Grade", classroomManager.promoteStudent("1st Grade"));
        assertEquals("3rd Grade", classroomManager.promoteStudent("2nd Grade"));
        assertEquals("4th Grade", classroomManager.promoteStudent("3rd Grade"));

        // Test invalid grade
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.promoteStudent("5th Grade");
        });
        assertEquals("Invalid grade", exception.getMessage());
    }
}
