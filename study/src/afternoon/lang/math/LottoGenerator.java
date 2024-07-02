package afternoon.lang.math;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    Random random = new Random();
    int[] lottoMembers = new int[6];

    public void generate() {
        int count = 0;
        while (count < 6) {
            int rand = random.nextInt(45) + 1;
            if(!isDuplication(rand, count)) {
                lottoMembers[count] = rand;
                count++;
            }
        }
    }
    public boolean isDuplication(int rand, int count) {
        for (int i = 0; i < count; i++) {
            if (lottoMembers[i] == rand) {
                return true;
            }
        }
        return false;
    }
    public void printLottoMembers() {
        System.out.println("로또 번호는 : " + Arrays.toString(lottoMembers));
    }
}
