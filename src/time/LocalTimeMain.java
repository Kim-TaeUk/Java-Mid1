package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);

        LocalTime ofTime = LocalTime.of(9, 10, 30);
        System.out.println("지정 시간 = " + ofTime);

        //계산(불변), 여러가지 plus 메서드들
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간+30s = " + ofTimePlus);

        ofTimePlus = ofTimePlus.plusMinutes(3);
        System.out.println("지정 시간+30s+3m = " + ofTimePlus);

        ofTimePlus = ofTimePlus.plusHours(2);
        System.out.println("지정 시간+30s+3m+2h = " + ofTimePlus);
    }
}
