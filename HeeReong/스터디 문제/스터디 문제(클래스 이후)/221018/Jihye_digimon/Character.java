package JHtest;

public abstract class Character implements Digimon, DigimonValue {
    private String name;
    private String digimon, digimonValue;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDigimon() {
        return digimon;
    }
    public String getDigimonValue() {
        return digimonValue;
    }

    public void setDigimon(String digimon) {
        this.digimon = digimon;
    }

    public void setDigimonValue(String digimonValue) {
        this.digimonValue = digimonValue;
    }

    void choice(){
        int i = (int)(Math.random()*8)+0;
        digimon = Digimon[i];
        digimonValue = DigimonValue[i];
    }

    void AdventureOne() {
        choice();
        System.out.println("디지털 세계 할아부지 : ");
        System.out.println("자네는 " + getName() + "(이)라고 하는군!"+ "\n");
    }
    void SpecialPerson() {
        System.out.println(getDigimonValue()+ "라는 가치를 배울 준비가 되어 있는 자여!");
        System.out.println("자네는 "+ getDigimon()+ "을 만나 디지털 월드를 모험하게 될 것이다!"+"\n");
    }
    void SendingAdventures(){

        System.out.println(getName() + "! " + getDigimon() + "과(와) 모험을 떠나 많은 것을 경험하고 오거라!" );
        System.out.println("==================뾰로로롱==================");
    }
    void EndingSong(){
        System.out.println();
        System.out.println("==================ENDING SONG==================");
        System.out.println("♬설레이는 이 마음은 뭘까 왠지 잠을 이룰 수가 없어♪");
        System.out.println("♬혹시 꿈을 꾸고 있는지 나는 몰라♪");
        System.out.println();
        System.out.println("♬내가 있는 곳 여기가 어딘지 언제부터 시작되어 온 건지♪");
        System.out.println("♬아무도 내게 말 안해 가르쳐 주지 않아♪");
        System.out.println();
        System.out.println("♬눈으로 볼 수 있는 세상이 너무나 작다는 걸 알았어♪");
        System.out.println("♬바람에 실려 온 세상 저 편에 소식들 궁금해♪");
        System.out.println();
        System.out.println("♬안녕 디지몬 네 꿈을 꾸면서 잠이 들래♪");
        System.out.println("♬안녕 디지몬 친구들 모두 안녕♪");
        System.out.println("♬안녕 디지몬 너와 함께하고 싶어♪");
        System.out.println("♬안녕 디지몬 난 너를 찾아갈래♪");
    }

}
