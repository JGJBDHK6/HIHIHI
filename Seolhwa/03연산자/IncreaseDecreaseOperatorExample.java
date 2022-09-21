
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #이것이 자바다 71페이지 예제 2개
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("--------------");
		int a = 10;
		int b = 10;
		int z;
		System.out.println("--------------");
		a++;
		++a;
		System.out.println("a는=" + a);
		System.out.println("--------------");
		b--;
		--b;
		System.out.println("b는=" + b);

		System.out.println("--------------");
		z = a++; // 12
		System.out.println("z는=" + z);// 12
		System.out.println("x는=" + a);// 13

		System.out.println("--------------");
		z = ++a; // 14
		System.out.println("z는=" + z);// 14
		System.out.println("x는=" + a);// 14
		System.out.println("--------------");
		z = ++a + b++;// 23
		System.out.println("z는=" + z);
		System.out.println("a는=" + a);
		System.out.println("b는=" + b);

	}

}
