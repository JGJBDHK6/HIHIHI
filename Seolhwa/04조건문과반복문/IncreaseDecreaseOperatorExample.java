
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #�̰��� �ڹٴ� 71������ ���� 2��
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
		System.out.println("a��=" + a);
		System.out.println("--------------");
		b--;
		--b;
		System.out.println("b��=" + b);

		System.out.println("--------------");
		z = a++; // 12
		System.out.println("z��=" + z);// 12
		System.out.println("x��=" + a);// 13

		System.out.println("--------------");
		z = ++a; // 14
		System.out.println("z��=" + z);// 14
		System.out.println("x��=" + a);// 14
		System.out.println("--------------");
		z = ++a + b++;// 23
		System.out.println("z��=" + z);
		System.out.println("a��=" + a);
		System.out.println("b��=" + b);

	}

}
