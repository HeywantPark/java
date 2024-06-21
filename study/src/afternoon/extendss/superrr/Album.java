package afternoon.extendss.superrr;

public class Album extends Item{
    private String artist;
    private String album;

    Album(String name, int price, String artist, String album) {
        super(name, price);
        this.artist = artist;
        this.album = album;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("앨범 제목은 : " + this.album);
        System.out.println("아티스트의 이름은: " + this.artist);
    }
}
