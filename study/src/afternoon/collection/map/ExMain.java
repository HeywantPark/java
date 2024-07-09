package afternoon.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randNums = new int[10];

        // 1 ~ 10 까지의 랜덤 정수 10개 생성
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = rand.nextInt(10) + 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 1; i <= randNums.length ; i++) {
            map.put(i,count);
        }
        for (int i = 0; i < randNums.length; i++) {
            int num = randNums[i];
            map.put(num,map.get(num) + 1);
        }
        System.out.println(map);
    }
}
