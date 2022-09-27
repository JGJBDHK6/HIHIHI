package HIHIHI_Project.src._06클래스;

public class EX13_Member {
    // 필드
    String name;
    String id;
    String password;
    int age;

    // 생성자
    public EX13_Member(){
        this.name = name;
        this.id = id;
    }
    public EX13_Member(String name, String id){
        this.name = name;
        this.id = id;
    }
    // 메소드
    public boolean login(String id, String password){
        if (id == "hong" && password == "12345"){
            return true;
        } else {
            return false;
        }
    }
    public void logout(String id){
        System.out.println("로그아웃 되었습니다.");
    }

}
