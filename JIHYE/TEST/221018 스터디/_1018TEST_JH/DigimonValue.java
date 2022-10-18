package _1018TEST_JH;

public class DigimonValue implements Digimon{
    String DigimonFriends;
    int ranNum = (int)(Math.random() * 8 );

    @Override
    public void getDigimon() {
        System.out.println( Value[ranNum] +"이라는 가치를 배울 준비가 되어 있는 자여!");
        System.out.println("자네는 " + Digimon[ranNum] + "을 만나 디지털 월드를 모험하게 될 것이다!");
        DigimonFriends = Digimon[ranNum];
    }

    @Override
    public void Friends() {
        System.out.print(DigimonFriends);
    }
}
