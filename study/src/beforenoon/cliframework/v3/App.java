package beforenoon.cliframework.v3;

public class App {
    Menu menu;
    Command[] commands;

    public App() {

        menu = new Menu();
        commands = new Command[] {
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoresCommand(),
                new AnalizeCommand(),
                new ExitCommand(),
        };
    }

    public void executeCommand (int selectNo){
        Command cmd = commands[selectNo-1];
        cmd.execute();
    }

    public void run(){
        while(true){
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
