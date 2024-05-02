package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();    //UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);   //다른 타입 기준으로 Instant 생성
        System.out.println("from = " + from);

        Instant epoch = Instant.EPOCH;
        System.out.println("epoch = " + epoch);
        Instant epochStart = Instant.ofEpochSecond(0);  //Epoch 시간 기준 Instant 생성, 0이면 Instant.EPOCH랑 동일
        System.out.println("epochStart = " + epochStart);

        //계산, 여러가지 plus 메서드들
        Instant plusSeconds = epochStart.plusSeconds(3600);
        System.out.println("later = " + plusSeconds);

        Instant plusMillis = epochStart.plusMillis(30);
        System.out.println("plusLater = " + plusMillis);

        Instant plusNanos = epochStart.plusNanos(30);
        System.out.println("plusNanos = " + plusNanos);
        
        //조회
        long laterEpochSecond = plusSeconds.getEpochSecond();   //Epoch 시간으로부터 흐른 초를 반환
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
