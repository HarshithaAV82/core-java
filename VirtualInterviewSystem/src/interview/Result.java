package interview;

public class Result {
    private int score;

    public Result(int score) {
        this.score = score;
    }

    public boolean isPassed() {
        return score >= 7;
    }

    public void display() {
        if (isPassed()) {
            System.out.println("Result: Good performance. Keep learning and growing.");
        } else {
            System.out.println("Result: Need improvement. Review your answers and try again.");
        }
    }
}
