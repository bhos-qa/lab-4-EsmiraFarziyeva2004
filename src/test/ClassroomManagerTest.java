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
        
        // Now, the total number of students should be 1
        assertEquals(1, classroomManager.getTotalStudents(), "Total students should be 1 after adding one student.");
        
        // Add another student
        classroomManager.addStudent();
        
        // Now, the total number of students should be 2
        assertEquals(2, classroomManager.getTotalStudents(), "Total students should be 2 after adding another student.");
    }
}
