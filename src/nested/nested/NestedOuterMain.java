package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();    //바깥.안 으로 생성하면 됨
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
        //nestedClass = class nested.nested.NestedOuter$Nested
        // $로 구분
    }
}
