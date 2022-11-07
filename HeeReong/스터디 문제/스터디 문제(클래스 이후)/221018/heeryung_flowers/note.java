package HRtest;

public class note {
/*
        1) 다음 파일들을 생성한다.
        Flowers.java
        Tulip.java
        Carnation.java
        Rose.java
        Fragrance.java(향기라는 뜻)
        SmellFragrance.java (향기를 맡음)
        KeepFragrance.java (향기를 간직함)
        FlowerDemo.java(실행)

        2) 추상클래스, 구체(concrete)클래스, 인터페이스로 위 파일들을 정의한다.
        3) 모든 꽃들은 이름, 색깔, 꽃말, 향기 필드를 가지며, 해당 필드들은 캡슐화되어 있다.
        4) 모든 꽃 객체들은 객체 생성 시 인수로 이름과 색깔 값 2가지 인수를 부여한다. 꽃말의 경우 객체 생성 시 인수로 던져지지 않는다.
        5) 추상 클래스에는 이름에 접근할 수 있는 getter 메서드를 만든다.
        6) 추상 클래스에는 name, flowerGarden, flowerName 메서드를 추상메서드로 생성한다. (3 메서드 모두 리턴 타입은 void)
        7) 추상 클래스에 info 메서드를 만들고 바디 부분에서 name(); flowerGarden(); flowerName(); 3 메서드를 차례대로 호출한다.
        8) 상속관계(is a) 및 연관관계(has a)를 구축한다.
        9) Carnation.java에는 Present 전용 필드를 생성한다.
        10) FlowerDemo.java 파일은 다음 코드를 사용하며 수정하지 않는다.

        Flower carnation = new Carnation("카네이션", "빨강", "부모님");
        carnation.info();

        Flower tulip = new Tulip("튤립", "노랑");
        tulip.info();
        Flower rose = new Rose("장미", "분홍");
        rose.info();
        rose.setFragrance(new SmellFragrance());
        rose.perfumeFragrance();
        rose.setFragrance(new KeepFragrance());
        rose.perfumeFragrance();

        11) 꽃은 향기를 통해 맡거나 간직할 수 있습니다.

        12) FlowerDemo 파일의 실행 결과는 아래와 같습니다.

        이름: 피카츄, 속성: 번개.   - 이름은 게터로 겟네임으로 가져오면 됨(프라이빗이니까)
        공격 스킬: 백만 볼트
        패시브 스킬: 스피드

        주인 : 지우 - 게터로 가져와야함(프라이빗이니까)

        이름: 꼬부기, 속성: 물
        공격 스킬: 물 대포 발사
        패시브 스킬: 방어

        이름: 파이리, 속성: 불
        공격 스킬: 불꽃
        패시브 스킬: 방어

        날개를 펼쳐 날아갑니다~
        로켓 추진기를 사용하여 비행시작~ */

}
