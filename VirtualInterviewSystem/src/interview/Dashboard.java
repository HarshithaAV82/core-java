package interview;

public class Dashboard {
    public static void main(String[] args) {
        System.out.println("--- Virtual Interview System Demo ---");

        Login adminLogin = new Login("admin@gmail.com", "1234");
        System.out.println("Admin login successful: " + adminLogin.authenticate());

        Register candidate = new Register("Priya", "priya@example.com", "mypassword");
        candidate.showDetails();

        HRInterview hrInterview = new HRInterview();
        hrInterview.showQuestions();

        Result result = new Result(8);
        result.display();
    }
}
