public class ClassroomManagement {
    private List<Student> students;
    private List<Course> courses;

    public ClassroomManagement() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);
        if (student != null && course != null) {
            course.enrollStudent(student);
        }
    }

    public void dropStudentFromCourse(int studentId, int courseId) {
        Course course = findCourseById(courseId);
        if (course != null) {
            course.removeStudent(studentId);
        }
    }

    public void createCourse(String courseName) {
        courses.add(new Course(courseName));
    }

    public void removeCourse(int courseId) {
        courses.removeIf(course -> course.getId() == courseId);
    }

    public List<Student> getStudentsInCourse(int courseId) {
        Course course = findCourseById(courseId);
        return course != null ? course.getEnrolledStudents() : new ArrayList<>();
    }

    public void markAttendance(int courseId, int studentId) {
        Course course = findCourseById(courseId);
        if (course != null) {
            course.markAttendance(studentId);
        }
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    private Student findStudentById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    private Course findCourseById(int id) {
        return courses.stream().filter(course -> course.getId() == id).findFirst().orElse(null);
    }
}
