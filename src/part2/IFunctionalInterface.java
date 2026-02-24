package part2;

@FunctionalInterface
public interface IFunctionalInterface {
    // là 1 interface có duy nhát 1 chức năng(method abstract)
    boolean flyable();
//    void print();
    default void run(){

    }
}
