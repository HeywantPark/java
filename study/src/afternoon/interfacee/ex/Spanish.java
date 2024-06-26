package afternoon.interfacee.ex;

public class Spanish implements Human{
    @Override
    public void speak() {
        System.out.println("hola~~");
    }
    @Override
    public void eat() {
        System.out.println("El espa ñ ol come paella");
    }
    @Override
    public void hello(){
        System.out.println("Hola. Actualmente es el año" + YEAR );
    }
}
