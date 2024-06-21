package afternoon.access.refactor;

import afternoon.access.Account;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행","골드","박혜원",10000000);

        //public 요소 접근
        System.out.println(account.bank);
        //default 요소 접근
        System.out.println(account.grade);
        //private 요소 접근 -> 접근 불가
//        System.out.println(account.name);
    }
}
