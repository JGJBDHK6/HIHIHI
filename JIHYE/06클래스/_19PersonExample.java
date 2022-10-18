package HIHIHI_Project.src._06클래스;

public class _19PersonExample {
    public static void main(String[] args) {
        _19Person p1 = new _19Person("123456-1234567","계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";            //컴파일 에러 발생 - final로 지정하여 값 수정 불가
//        p1.ssn = "654321-7654321";    //컴파일 에러 발생 - final로 지정하여 값 수정 불가
        p1.name = "을지문덕";
    }
}
