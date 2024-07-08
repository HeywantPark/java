package afternoon.jeneric.limlit;

public class LongWorld {
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
    public Double transDouble() {
        return number.doubleValue();
    }

    @Override
    public String toString() {
        return "LongWorld{" +
                "number=" + number +
                '}';
    }
}
