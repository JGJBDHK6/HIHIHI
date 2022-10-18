package _1018TEST_SH;

public class BEAST extends Idol{

    public BEAST(String groupName, String fandom) {
        super(groupName, fandom);
    }

    @Override
    void GroupName() {
        System.out.println("그룹명 : " + super.getGroupName() );
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
