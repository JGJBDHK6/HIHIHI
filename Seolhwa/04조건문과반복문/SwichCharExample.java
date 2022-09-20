public class SwichCharExample {
    public static void main(String[] args){
        int num=(int)(Math.random()*51)+0;




        char grade='B';
        switch (grade){
            case 'A':
            case 'B':
                System.out.println("우수회원 입니다.");
                break;
            case 'C':
            case 'D':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}