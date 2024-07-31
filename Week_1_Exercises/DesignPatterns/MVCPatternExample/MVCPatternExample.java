public class MVCPatternExample {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student();
        student.setName("John Doe");
        student.setId("12345");
        student.setGrade("A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(student, view);

        // Display the initial student details
        controller.updateView();

        // Update the student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        // Display the updated student details
        controller.updateView();
    }
}
