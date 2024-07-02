package afternoon.lang.math;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();

        generator.generate();
        generator.printLottoMembers();
    }
}
