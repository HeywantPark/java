package beforenoon.cliframework.v1;

import java.util.Scanner;

public class App {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;

    Scanner scanner = new Scanner(System.in);
    // 메뉴 출력
    public void printMenu () {
        System.out.println("----------------------");
        System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료 " );
        System.out.println("----------------------");
    }
    // 선택
    public int getSelect () {
        System.out.println("선택> ");
        return Integer.parseInt(scanner.nextLine());
    }
    //분석
    public void analize() {
        int max = 0;
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < scores.length; i++) {
            max = (max < scores[i]) ? scores[i] : max;
            sum += scores[i];
        }
        avg = (double) sum / studentNum;
        System.out.println("최고 점수는 : " + max);
        System.out.println("평균 점수는 : " + avg);
    }
    //학생 수 입력
    public void getStudentNum(){
        System.out.println("학생 수> ");
        studentNum = Integer.parseInt(scanner.nextLine());
        scores = new int[studentNum];
    }
    //점수 입력
    public void getScores(){
        for(int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] > ");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }
    }
    //점수 출력
    public void printScore(){
        for(int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] : " + scores[i]);
        }
    }
    //종료
    public void exit(){
        run = false;
    }
    public void executeCommand (int selectNo) {
        if (selectNo == 1) {
            getStudentNum();
        } else if (selectNo == 2) {
            getScores();
        } else if (selectNo == 3) {
            printScore();
        } else if (selectNo == 4) {
            analize();
        } else if (selectNo == 5) {
            exit();
        }
    }

    public void run(){
        while (run) {
            printMenu();
            int select = getSelect();
            executeCommand(select);
        }

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}


