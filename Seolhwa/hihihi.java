package kkkk;

import java.util.Random;

public class klklk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ڡٿ����� �޴��� ���ص帮�ڽ��ϴ�^^�ڡ�");
		System.out.println("----------------------------");

		Random meunnum = new Random();

		int meun = meunnum.nextInt(1, 4);

		if (meun == 1) {
			System.out.println("�ѽ�");
			Random kor = new Random();
			int kormeun = kor.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("��ġ�");
			}
			if (meun == 2) {
				System.out.println("�����");
			}
			if (meun == 3) {
				System.out.println("������");
			}
			if (meun == 4) {
				System.out.println("�Ұ��");
			}
			if (meun == 5) {
				System.out.println("��������");
			}

		}
		if (meun == 2) {
			System.out.println("�Ͻ�");
			Random jap = new Random();
			int japmeun = jap.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("�Ե�");
			}
			if (meun == 2) {
				System.out.println("���");
			}
			if (meun == 3) {
				System.out.println("�ʹ�");
			}
			if (meun == 4) {
				System.out.println("�ҹ�");
			}
			if (meun == 5) {
				System.out.println("��ī��");
			}
		}
		if (meun == 3) {
			System.out.println("�߽�");
			Random cha = new Random();
			int chameun = cha.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("¥���");
			}
			if (meun == 2) {
				System.out.println("«��");
			}
			if (meun == 3) {
				System.out.println("������");
			}
			if (meun == 4) {
				System.out.println("��ä��");
			}
			if (meun == 5) {
				System.out.println("������");
			}
		}
		System.out.println("----------------------------");

	}
}