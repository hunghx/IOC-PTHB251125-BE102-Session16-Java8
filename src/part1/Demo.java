package part1;

public class Demo implements InterfaceMethod{
    @Override
    public void printf() {

    }

    @Override
    public void printColor() {
        System.out.println("Mau xanh");
    }

    public static void main(String[] args) {
        Demo  d = new Demo();
        d.printColor(); // mau do

        InterfaceMethod.printSize(); // gọi trực tiếp phương thức tĩnh
    }

}
