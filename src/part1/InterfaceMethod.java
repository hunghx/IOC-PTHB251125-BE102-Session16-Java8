package part1;

public interface InterfaceMethod {
    void printf(); // trừu tượng

    // default : phương thức mặc đinh
    default void printColor(){
        System.out.println("Mau do");
    }
    // static : Phương thức tĩnh
    static void printSize(){
        System.out.println("XXL");
    }
}
