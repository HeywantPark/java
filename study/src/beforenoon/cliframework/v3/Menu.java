package beforenoon.cliframework.v3;

public class Menu {
    String menus [] = {"1. 학생수" , " 2. 점수입력" , " 3. 점수리스트" , " 4. 분석" , " 5. 종료"};

    public void printMenu(){
        System.out.println("------------------------------------------------");
        for (int i = 0; i <menus.length; i++) {
            System.out.printf(menus[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    public int getSelect(){
        int selectNo = Input.getInt("선택> ");
        return selectNo;
    }
}
