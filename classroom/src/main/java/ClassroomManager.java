public class ClassroomManager {

    // Method 1: Calculate total students across two classrooms
    public int calculateTotalStudents(int class1, int class2) {
        return class1 + class2;
    }

    // Method 2: Check if a classroom is full based on its capacity
    public boolean isClassFull(int currentStudents, int maxCapacity) {
        return currentStudents >= maxCapacity;
    }

    // Method 3: Add a student to the class (assuming maximum capacity is 30)
    public int addStudent(int currentStudents) {
        if (currentStudents < 30) {
            return currentStudents + 1;
        } else {
            throw new IllegalArgumentException("Class is already full");
        }
    }

    // Method 4: Remove a student from the class (assuming there’s at least 1 student)
    public int removeStudent(int currentStudents) {
        if (currentStudents > 0) {
            return currentStudents - 1;
        } else {
            throw new IllegalArgumentException("Class is empty");
        }
    }

    // Method 5: Calculate percentage of students attending a class
    public double calculateAttendancePercentage(int attendingStudents, int totalStudents) {
        if (totalStudents == 0) {
            throw new IllegalArgumentException("Total students cannot be zero");
        }
        return (attendingStudents / (double) totalStudents) * 100;
    }

    // Method 6: Calculate the average grade of students in a class
    public double calculateAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.length;
    }

    // Method 7: Check if a student is passing (assuming passing grade is 50)
    public boolean isStudentPassing(int grade) {
        return grade >= 50;
    }

    // Method 8: Promote a student to the next grade
    public String promoteStudent(String currentGrade) {
        switch (currentGrade) {
            case "1st Grade":
                return "2nd Grade";
            case "2nd Grade":
                return "3rd Grade";
            case "3rd Grade":
                return "4th Grade";
            default:
                throw new IllegalArgumentException("Invalid grade");
        }
    }

    // Method 9: Assign a teacher to a classroom
    public String assignTeacher(String teacherName, String classroomName) {
        return teacherName + " has been assigned to " + classroomName;
    }

    // Method 10: Get class information (simple method to return a string message)
    public String getClassInfo(String className, int numberOfStudents) {
        return "Class: " + className + ", Number of Students: " + numberOfStudents;
    }
}
