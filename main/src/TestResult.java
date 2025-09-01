import java.time.LocalDateTime;

public class TestResult {

    private final LocalDateTime testDateTime;
    private final int taskScore; // 30초 동안 맞춘 수학 문제 개수

    public TestResult(LocalDateTime testDateTime, int taskScore) {
        this.testDateTime = testDateTime;
        this.taskScore = taskScore;
    }

    public static TestResult fromCsvString(String csvLine) {
        String[] data = csvLine.split(",");
        LocalDateTime dateTime = LocalDateTime.parse(data[0]);
        int score = Integer.parseInt(data[1]);
        return new TestResult(dateTime, score);
    }

    public String toCsvString() {
        return testDateTime.toString() + "," + taskScore;
    }

    // Getters
    public LocalDateTime getTestDateTime() { return testDateTime; }
    public int getTaskScore() { return taskScore; }
}