package _TEST;

public class _1007SHQ03 {
    public static void main(String[] args) {
        _1007SHQ02_KB KB1 = new _1007SHQ02_KB("201302-04-168765", "김지혜");
        KB1.customer();
        KB1.bankbook();
        KB1.savemoney();
        KB1.getInterest();

        _1007SHQ02_SH SH1 = new _1007SHQ02_SH("64580101-507-648", "김설화");
        SH1.customer();
        SH1.bankbook();
        SH1.savemoney();
        SH1.getInterest();
    }
}
