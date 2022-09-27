package HIHIHI_Project.src._06클래스;

public class _18SingletonExample {
    public static void main(String[] args) {

//        _18Singleton obj1 = new _18Singleton();
//        _18Singleton obj2 = new _18Singleton();

        _18Singleton obj1 = _18Singleton.getSingleton();
        _18Singleton obj2 = _18Singleton.getSingleton();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
