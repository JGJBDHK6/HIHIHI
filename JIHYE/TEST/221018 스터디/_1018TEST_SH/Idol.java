package _1018TEST_SH;

import java.lang.reflect.Member;

public abstract class Idol {
    private String GroupName;

    private String[] MemberName = {"윤두준","양요섭","이기광","손동운"};

    private String Fandom;

    public Idol(String groupName, String fandom) {
        GroupName = groupName;
        Fandom = fandom;
    }

    public String getGroupName() {
        return GroupName;
    }

    public String getFandom() {
        return Fandom;
    }

    public void getMemberName() {
        for (int i = 0; i < MemberName.length; i ++){
            System.out.print(MemberName[i]+ "♥ ");
        }
    }

    abstract void GroupName();
    abstract void MemberName();
    abstract void FandomName();

    void Info(){
        GroupName();
        MemberName();
        FandomName();
    }

    mic mic;

    void setSong(mic mic){
        this.mic = mic;
    }

    void SingIngSong(){
        this.mic.Song();
    }
}
