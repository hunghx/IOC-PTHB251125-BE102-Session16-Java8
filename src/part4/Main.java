package part4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[1]+4; // thay đổi được mảng trong vòng lặp
        }

        // Stream hỗ trợ duyệt mảng nhanh và an toàn hơn
        // Tạo stream
        Arrays.stream(arr); // tạo stream vs array

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream();

        // các thao tác trung gian
        // Cho 1 danh sách cả phần tử ngẫu nhiên
        // Random
        // Tạo ra 1000 số ngaaux nhiên : 0 - 10000
        Random random = new Random();


        // Tạo list
        List<Integer> randomList = Stream.generate(()-> random.nextInt(10000))
                .distinct()
                .limit(1000)
                .toList();
        System.out.println(randomList);

        // Lọc và in các số lẻ trong list
        randomList.stream()
                .filter(num -> num%2!=0)
                .forEach(t-> System.out.println(t));
        // sắp xếp vá in ra theo thứ tự tăng dần
        randomList.stream().sorted((o1, o2) -> o2-o1)
                .forEach(System.out::println);
        // Tính tổng các sô chẵn
        Integer rs = randomList.stream().filter(num -> num%2==0)
                .reduce(0,(value, temp) -> value+temp );
        System.out.println("Tong : "+rs);

        // Min max
        Integer min = randomList.stream().min((o1, o2) -> o1-o2).get();
        Integer max = randomList.stream().max((o1, o2) -> o1-o2).get();
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        // Phương thức tạo stream : .stream()
        // phương thức trung gian: distinct, limit, skip, filter, map, sorted
        // phương thức đầu cuối : foreach , reduce, min, max, count, collect , toList,
        // findAny, findFirst, anyMatch , allMatch

        /*
        Tạo 1 danh sách ngẫu nhiên 100 số từ 0 - 100 (có trùng)
        1. Duyệt và tìm ra các số nguyên tố trong danh sách
        2. Duyệt và tính tổng tất cả các số chia hết cho 3
        3. Đêm số lần xuất hiện của giá trị 10 trong danh sách
        4. Kiểm tra tồn tại của giá trị 50 trong danh sách
        */
    }
}
