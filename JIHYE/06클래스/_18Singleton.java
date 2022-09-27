package HIHIHI_Project.src._06클래스;

public class _18Singleton {
    private static _18Singleton singleton = new _18Singleton();

    private _18Singleton() {}

    static _18Singleton getSingleton() {
        return singleton;
    }
}
