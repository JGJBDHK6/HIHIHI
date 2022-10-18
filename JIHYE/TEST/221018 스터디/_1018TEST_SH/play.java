package _1018TEST_SH;

public class play {
    public static void main(String[] args) {
        Idol B1 = new BEAST("비스트","뷰티");
        B1.Info();
        Idol H1 = new HIGHLIGHT("하이라이트","라이트","구) 비스트");
        H1.Info();

        H1.setSong(new musig_song());
        H1.SingIngSong();
        H1.setSong(new Dance_song());
        H1.SingIngSong();
    }
}
