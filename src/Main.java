import part2.ICalculateShape;
import part2.IMath;
import part3.Calculate;
import part3.Rectangle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // trước Java 8
        // Lớp nặc danh
//        part2.IFlyable chicken = new part2.IFlyable() {
//            @Override
//            public boolean flyable() {
//                return true;
//            }
//        };
//
//        // Lambda expression
//        part2.IFlyable hoaMi = () -> true;
//        part2.IMath cal = (x,y)-> x+y;
        IMath cal1 =  (x,y) -> x+y; // biểu thức lambda
        IMath cal2 = Calculate::sum; // gọi đến tham chiếu của 1 phương thức có sẵn
        IMath cal3 = Calculate::multi; // gọi đến tham chiếu của 1 phương thức có sẵn
        Calculate calculate = new Calculate();
        IMath cal4 = calculate::sub;

        ICalculateShape shape = Rectangle::new;

        demo(cal1);
        demo( (a,b) -> a*b );
        demo( (x,y) -> x-y );

//        Danh sách functionalInterface dựng sẵn
         // Consumer, Predicate, Function, Supplier
        Consumer<Number> con = (i) -> {};
        Predicate<String> pre = (i)-> true;
        Function<String, Number> fun = (i)-> 1;
        Supplier sup = ()-> "cdbh";
        // dùng lambda tạo ra 4 đối tượng từ 4 interface trên

        // Ứng dụng :
        List<Integer> listInt = Arrays.asList(1,2,3,4,5,6);
        // In ra danh sách
        listInt.forEach(System.out::println);
        // chuyen thành danh sách bình phương cua từng số
        listInt.stream().map(i->i*i)
                .forEach(i-> System.out.println(i));
    }

    public static void demo(IMath cal){
        int a = 10; int b = 100;
        int rs =  cal.calculate(a,b);
        System.out.println(rs);
    }
}
