import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {
    @Test
    public void testAddStudent() {
        Classroom classroom = new Classroom();
        classroom.addStudent();
        assertEquals(1, classroom.getTotalStudents());
    }

    @Test
    public void testRemoveStudent() {
        Classroom classroom = new Classroom();
        classroom.addStudent();
        classroom.removeStudent();
        assertEquals(0, classroom.getTotalStudents());
    }

    @Test
    public void testCreateClass() {
        Classroom classroom = new Classroom();
        classroom.createClass();
        assertEquals(1, classroom.getTotalClasses());
    }

    @Test
    public void testCalculateStudentToClassRatio() {
        Classroom classroom = new Classroom();
        classroom.addStudents(10);
        classroom.createClass();
        assertEquals(10.0, classroom.calculateStudentToClassRatio());
    }

    @Test
    public void testIsClassFull() {
        Classroom classroom = new Classroom();
        classroom.addStudents(30);
        assertTrue(classroom.isClassFull(30));
        assertFalse(classroom.isClassFull(31));
    }
}
