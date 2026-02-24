package part5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Date
        // truoc Java8
        Date date = new Date();
        System.out.println(date);
        // Java 8
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(today);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(zonedDateTime);

        // Phưg thức làm việc cơ bản với thời gian : cộng , trừ, tính khoảng thời gian

        LocalDate _10DateAfter = today.plusDays(10);
        System.out.println(_10DateAfter);
        LocalDate _10DateBefore = today.minusDays(10);
        System.out.println(_10DateBefore);


        // Khoảng thời gian
        LocalDate birth = LocalDate.of(2003,8,9);
        Period period = Period.between(birth, today);
        System.out.println(period);

        // format
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(dft));


        // Optional : trường hơợp có thể xảy ra
//        LocalDate obj = null;
//        if(obj!=null) {
//            obj.format(dft);
//        }

        // tìm số lớn nhất
    }
}
