import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomManagementTest {
    private ClassroomManagement classroom;
    private Student student1;
    private Student student2;
    private Course course1;

    @BeforeEach
    void setUp() {
        classroom = new ClassroomManagement();
        student1 = new Student(1, "Alice");
        student2 = new Student(2, "Bob");
        course1 = new Course("Math 101");
        classroom.createCourse("Math 101");
    }

    @Test
    void testAddStudent() {
        classroom.addStudent(student1);
        assertEquals(1, classroom.getAllStudents().size());
        assertTrue(classroom.getAllStudents().contains(student1));
    }

    @Test
    void testRemoveStudent() {
        classroom.addStudent(student1);
        classroom.removeStudent(student1.getId());
        assertEquals(0, classroom.getAllStudents().size());
    }

    @Test
    void testEnrollStudentInCourse() {
        classroom.addStudent(student1);
        classroom.enrollStudentInCourse(student1.getId(), course1.getId());
        assertTrue(course1.getEnrolledStudents().contains(student1));
    }

    @Test
    void testDropStudentFromCourse() {
        classroom.addStudent(student1);
        classroom.enrollStudentInCourse(student1.getId(), course1.getId());
        classroom.dropStudentFromCourse(student1.getId(), course1.getId());
        assertFalse(course1.getEnrolledStudents().contains(student1));
    }

    @Test
    void testMarkAttendance() {
        classroom.addStudent(student1);
        classroom.enrollStudentInCourse(student1.getId(), course1.getId());
        classroom.markAttendance(course1.getId(), student1.getId());
        assertTrue(course1.getAttendanceList().contains(student1.getId()));
    }
}
