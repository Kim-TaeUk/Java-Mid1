package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);

        LocalDate ofDate = LocalDate.of(2013, 6, 21);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변), 여러가지 plus 메서드들
        ofDate = ofDate.plusYears(1);
        System.out.println("지정 날짜+1y = " + ofDate);

        ofDate = ofDate.plusMonths(3);
        System.out.println("지정 날짜+1y+3m = " + ofDate);

        ofDate = ofDate.plusWeeks(4);
        System.out.println("지정 날짜+1y+3m+4w = " + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜+1y+3m+4w+10d = " + ofDate);
    }
}
