package _1018TEST_SH;

public class HIGHLIGHT extends Idol{
    String beforeName;

    public HIGHLIGHT(String groupName, String fandom, String beforeName) {
        super(groupName, fandom);
        this.beforeName = beforeName;
    }
    @Override
    void GroupName() {
        System.out.println("그룹명 : " + super.getGroupName() + " / " + beforeName);
    }
    @Override
    void MemberName() {
        System.out.print("멤버 : ");
        super.getMemberName();
        System.out.println();
    }
    @Override
    void FandomName() {
        System.out.println("팬덤이름 : " + super.getFandom() );
        System.out.println();
    }


}
