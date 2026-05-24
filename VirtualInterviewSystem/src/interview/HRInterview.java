package interview;

public class HRInterview {
    private String interviewType;

    public HRInterview() {
        this.interviewType = "HR";
    }

    public void showQuestions() {
        System.out.println("""
HR Interview Questions:
1. Tell me about yourself.
2. What are your strengths?
3. Why should we hire you?
""");
    }

    public String getInterviewType() {
        return interviewType;
    }
}
