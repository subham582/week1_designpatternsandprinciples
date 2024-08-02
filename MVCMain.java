
public class MVCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
        student.setName("John Doe");
        student.setId("123");
        student.setGrade("A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();

	}

}
