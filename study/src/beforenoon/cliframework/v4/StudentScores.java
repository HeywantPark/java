package beforenoon.cliframework.v4;

public class StudentScores {
    int studentNum = 0;
    int[] scores = null;

    //singleton 패턴
    private StudentScores() {}

    private static StudentScores instance = new StudentScores();

    public static StudentScores getInstance() {
        return instance;
    }
    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
        this.scores = new int[studentNum];
    }
    public int[] getScores() {
        return scores;
    }
}
