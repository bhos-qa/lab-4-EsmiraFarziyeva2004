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
        classroomManager.addStudent();
        assertEquals(1, classroomManager.getTotalStudents(), "Total students should be 1 after adding a student.");
    }

    @Test
    void testRemoveStudent() {
        classroomManager.addStudent(); // First, add a student
        classroomManager.removeStudent();
        assertEquals(0, classroomManager.getTotalStudents(), "Total students should be 0 after removing a student.");
    }

    @Test
    void testGetTotalStudents() {
        assertEquals(0, classroomManager.getTotalStudents(), "Total students should be initially 0.");
        classroomManager.addStudent();
        assertEquals(1, classroomManager.getTotalStudents(), "Total students should be 1 after adding a student.");
    }

    @Test
    void testCreateClass() {
        classroomManager.createClass();
        assertEquals(1, classroomManager.getTotalClasses(), "Total classes should be 1 after creating a class.");
    }

    @Test
    void testCalculateStudentToClassRatio() {
        classroomManager.addStudents(10); // Adding 10 students
        classroomManager.createClass(); // Creating 1 class
        assertEquals(10.0, classroomManager.calculateStudentToClassRatio(), "The student-to-class ratio should be 10.0.");
        
        classroomManager.removeClass(); // Remove class
        assertEquals(0.0, classroomManager.calculateStudentToClassRatio(), "The student-to-class ratio should be 0.0 when there are no classes.");
    }
}
