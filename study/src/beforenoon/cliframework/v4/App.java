package beforenoon.cliframework.v4;

import java.awt.event.ItemListener;

public class App {
    Menu menu;

    public App() {
 }
 public void init(int menuSize) {
        menu = new Menu(menuSize);
        creatMenu(menu);
 }
 private void creatMenu(Menu menu) {
        menu.add(0, new MenuItem("학생 수", (beforenoon.cliframework.v3.Command) new InitScoresCommand()));
        menu.add(1, new MenuItem("점수 입력", (beforenoon.cliframework.v3.Command) new GetScoresCommand()));
        menu.add(2, new MenuItem("점수리스트", (beforenoon.cliframework.v3.Command) new PrintScoresCommand()));
        menu.add(3, new MenuItem("분석", (beforenoon.cliframework.v3.Command) new AnalizeCommand()));
        menu.add(4, new MenuItem("종료", (beforenoon.cliframework.v3.Command) new ExitCommand()));
 }
 public void run(){
        init(5);
        while(true){
            menu.printMenu();
            Command command = menu.getSelect();
            command.execute();
        }
 }
 public static void main(String[] args) {
        App app = new App();
        app.run();
 }
}
