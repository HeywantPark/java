package afternoon.extendss.superrr;

public class ItemMain {
    public static void main(String[] args) {
      Book book = new Book("책",10000,"채쌤","jsp");
      Album album = new Album("앨범",30000,"아이유","꽃갈피");

      book.print();
        System.out.println();
      album.print();


    }
}
