package afternoon.collection.stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExMain {
    public static void main(String[] args) {
        int [] randArray = new int [10];
        Random rand = new Random();
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(randArray));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < randArray.length; i++) {
            boolean isDuplicated = set.add(randArray[i]);
            if (!isDuplicated) {
                System.out.println("중복이 아니다~~");
            } else  {
                System.out.println("중복이다~~");
            }
        }
    }
}
