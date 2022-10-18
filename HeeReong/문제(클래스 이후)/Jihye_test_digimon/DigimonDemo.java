package JHtest;

public class DigimonDemo {
    public static void main(String[] args) {
        JHadventure JH1 = new JHadventure("지혜");
        JH1.AdventureOne();
        JH1.SpecialPerson();
        JH1.SendingAdventures();

        HRadventure HR1 = new HRadventure("희령");
        HR1.AdventureOne();
        HR1.SpecialPerson();
        HR1.SendingAdventures();


        SHadventure SH1 = new SHadventure("설화");
        SH1.AdventureOne();
        SH1.SpecialPerson();
        SH1.SendingAdventures();
        SH1.EndingSong();
    }
}
