import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassroomManagerTest {
    private ClassroomManager classroomManager;

    @BeforeEach
    void setUp() {
        classroomManager = new ClassroomManager();
    }

    @Test
    void testAddStudent() {
        // Initially, the total number of students should be 0
        assertEquals(0, classroomManager.getTotalStudents(), "Total students should initially be 0.");
        
        // Add a student
        classroomManager.addStudent();
        assertEquals(1, classroomManager.getTotalStudents(), "Total students should be 1 after adding one student.");
        
        // Add another student
        classroomManager.addStudent();
        assertEquals(2, classroomManager.getTotalStudents(), "Total students should be 2 after adding another student.");
    }

    @Test
    void testRemoveStudent() {
        classroomManager.addStudent(); // Add a student first
        assertEquals(1, classroomManager.getTotalStudents(), "Total students should be 1 after adding a student.");
        
        classroomManager.removeStudent();
        assertEquals(0, classroomManager.getTotalStudents(), "Total students should be 0 after removing the student.");
        
        // Attempt to remove a student when none are present
        classroomManager.removeStudent(); // Should not throw an error
        assertEquals(0, classroomManager.getTotalStudents(), "Total students should remain 0 after attempting to remove again.");
    }

    @Test
    void testCreateClass() {
        assertEquals(0, classroomManager.getTotalClasses(), "Total classes should initially be 0.");
        
        classroomManager.createClass();
        assertEquals(1, classroomManager.getTotalClasses(), "Total classes should be 1 after creating a class.");
        
        classroomManager.createClass();
        assertEquals(2, classroomManager.getTotalClasses(), "Total classes should be 2 after creating another class.");
    }

    @Test
    void testIsClassFull() {
        classroomManager.addStudents(30); // Add 30 students
        classroomManager.createClass(); // Create a class

        // Check with a capacity of 30 (should be full)
        assertTrue(classroomManager.isClassFull(30), "Class should be full with 30 students and capacity of 30.");
        
        // Check with a capacity of 31 (should not be full)
        assertFalse(classroomManager.isClassFull(31), "Class should not be full with 30 students and capacity of 31.");
    }

    @Test
    void testCalculateStudentToClassRatio() {
        classroomManager.addStudents(10); // Add 10 students
        classroomManager.createClass(); // Create 1 class
        
        assertEquals(10.0, classroomManager.calculateStudentToClassRatio(), "The student-to-class ratio should be 10.0.");
        
        classroomManager.removeClass(); // Remove class
        assertEquals(0.0, classroomManager.calculateStudentToClassRatio(), "The student-to-class ratio should be 0.0 when there are no classes.");
        
        // Adding classes again
        classroomManager.createClass(); // Create a class
        classroomManager.addStudents(5); // Add 5 students
        assertEquals(5.0, classroomManager.calculateStudentToClassRatio(), "The student-to-class ratio should be 5.0 with 5 students and 1 class.");
    }
}
