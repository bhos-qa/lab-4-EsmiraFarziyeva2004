public class ClassroomManagerTest {
    private ClassroomManager classroomManager;

    @BeforeEach
    public void setUp() {
        classroomManager = new ClassroomManager();
    }

    @Test
    public void testCalculateTotalStudents() {
        int totalStudents = classroomManager.calculateTotalStudents(15, 20);
        assertEquals(35, totalStudents);
    }

    @Test
    public void testIsClassFull() {
        assertTrue(classroomManager.isClassFull(30, 30));
        assertFalse(classroomManager.isClassFull(29, 30));
    }

    @Test
    public void testAddStudent() {
        int newCount = classroomManager.addStudent(29);
        assertEquals(30, newCount);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.addStudent(30);
        });
        assertEquals("Class is already full", exception.getMessage());
    }

    @Test
    public void testRemoveStudent() {
        int newCount = classroomManager.removeStudent(10);
        assertEquals(9, newCount);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.removeStudent(0);
        });
        assertEquals("Class is empty", exception.getMessage());
    }

    @Test
    public void testCalculateAttendancePercentage() {
        double percentage = classroomManager.calculateAttendancePercentage(20, 100);
        assertEquals(20.0, percentage);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            classroomManager.calculateAttendancePercentage(20, 0);
        });
        assertEquals("Total students cannot be zero", exception.getMessage());
    }
}
