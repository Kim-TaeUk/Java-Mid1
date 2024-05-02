package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅(DateTimeFormatter): Date -> String
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        //ofPattern으로 원하는 포맷 지정
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate1 = date.format(formatter1);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate1);   //2024년 12월 31일

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("G yy/MM/dd");
        String formattedDate2 = date.format(formatter2);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDate2);

        // 파싱: String -> Date
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter1);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);
    }
}
