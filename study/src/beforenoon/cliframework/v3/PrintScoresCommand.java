package beforenoon.cliframework.v3;

public class PrintScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        int[] scores = studentScores.getScores();

        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]"+scores[i]);
        }
    }
}
