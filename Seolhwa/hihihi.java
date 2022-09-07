package kkkk;

import java.util.Random;

public class klklk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¡Ú¡Ù¿À´ÃÀÇ ¸Ş´ºÀ» Á¤ÇØµå¸®°Ú½À´Ï´Ù^^¡Ú¡Ù");
		System.out.println("----------------------------");

		Random meunnum = new Random();

		int meun = meunnum.nextInt(1, 4);

		if (meun == 1) {
			System.out.println("ÇÑ½Ä");
			Random kor = new Random();
			int kormeun = kor.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("±èÄ¡Âî°³");
			}
			if (meun == 2) {
				System.out.println("µÈÀåÂî°³");
			}
			if (meun == 3) {
				System.out.println("ÇÑÁ¤½Ä");
			}
			if (meun == 4) {
				System.out.println("ºÒ°í±â");
			}
			if (meun == 5) {
				System.out.println("Á¦À°ººÀ½");
			}

		}
		if (meun == 2) {
			System.out.println("ÀÏ½Ä");
			Random jap = new Random();
			int japmeun = jap.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("±Ôµ¿");
			}
			if (meun == 2) {
				System.out.println("¶ó¸à");
			}
			if (meun == 3) {
				System.out.println("ÃÊ¹ä");
			}
			if (meun == 4) {
				System.out.println("¼Ò¹Ù");
			}
			if (meun == 5) {
				System.out.println("µ·Ä«Ã÷");
			}
		}
		if (meun == 3) {
			System.out.println("Áß½Ä");
			Random cha = new Random();
			int chameun = cha.nextInt(1, 5);
			if (meun == 1) {
				System.out.println("Â¥Àå¸é");
			}
			if (meun == 2) {
				System.out.println("Â«»Í");
			}
			if (meun == 3) {
				System.out.println("ÅÁ¼öÀ°");
			}
			if (meun == 4) {
				System.out.println("ÀâÃ¤¹ä");
			}
			if (meun == 5) {
				System.out.println("¸¶¶óÅÁ");
			}
		}
		System.out.println("----------------------------");

	}
}