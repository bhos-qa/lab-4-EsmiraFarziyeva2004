public class Classroom {
    private int totalStudents;
    private int totalClasses;
    
    public Classroom() {
        this.totalStudents = 0;
        this.totalClasses = 0;
    }

    public void addStudent() {
        totalStudents++;
    }

    public void removeStudent() {
        if (totalStudents > 0) {
            totalStudents--;
        }
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void createClass() {
        totalClasses++;
    }

    public void removeClass() {
        if (totalClasses > 0) {
            totalClasses--;
        }
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public boolean isClassFull(int capacity) {
        return totalStudents >= capacity;
    }

    public boolean isStudentEnrolled(int studentId) {
        // Simulate a student enrollment check
        return studentId <= totalStudents;
    }

    public void clearClassroom() {
        totalStudents = 0;
        totalClasses = 0;
    }

    public double calculateStudentToClassRatio() {
        if (totalClasses == 0) return 0.0;
        return (double) totalStudents / totalClasses;
    }

    public void addStudents(int number) {
        totalStudents += number;
    }
}
