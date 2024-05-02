package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //생성
        Period periodDays = Period.ofDays(10);  //P10D
        System.out.println("periodDays = " + periodDays);

        Period periodMonths = Period.ofMonths(3);  //P3M
        System.out.println("periodMonths = " + periodMonths);

        Period periodYears = Period.ofYears(5);  //P5Y
        System.out.println("periodYears = " + periodYears);

        //계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        System.out.println("currentDate = " + currentDate);

        LocalDate plusDays = currentDate.plus(periodDays);
        System.out.println("plus10Days = " + plusDays);

        LocalDate plusMonths = currentDate.plus(periodMonths);
        System.out.println("plus3Months = " + plusMonths);

        LocalDate plusYears = currentDate.plus(periodYears);
        System.out.println("plus5Years = " + plusYears);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between);   //P1Y3M1D
        System.out.println("기간: " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
