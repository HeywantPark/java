package org.scoula.lib.cli.ui;

import org.scoula.lib.cli.command.Command;

public class Menu {
    MenuItem[] menus;
    private int ix = 0;
    private int size;

    public Menu() {
        menus = new MenuItem[size];
    }

    //메뉴 항목 주입
    public void add(MenuItem item) {
        menus[ix] = item;
    }

    public void printMenu(){
        System.out.println("------------------------------------------");
        for(int i = 0; i < menus.length; i++){
            System.out.printf(" %d.%s | ", i+1, menus[i].getTitle());
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
    public Command getSelect() throws Exception{
        try {
            int selectNo = Input.getInt("선택 >");
            return (Command) menus[selectNo-1].getCommand();
        } catch (Exception e) {
            throw new Exception();
        }

    }
}
