package TESTN;

import java.awt.PointerInfo;

import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Include_and_Exclude_TestNG {
	@Test
	public static void login() {
		// TODO Auto-generated method stub

		System.out.println("login");

	}

	@Test
	public static void sign() {
		// TODO Auto-generated method stub
		System.out.println("signIN");
	}

	@Test
	public static void signed() {
		// TODO Auto-generated method stub
		System.out.println("signIN before login");
	}

	@Test
	public static void signHaneef() {
		// TODO Auto-generated method stub
		System.out.println("signIN Haneef");
	}

	@Test
	public static void signRahman() {
		// TODO Auto-generated method stub
		System.out.println("signIN Rahman");
	}

	@Test
	public static void How() {
		// TODO Auto-generated method stub
		System.out.println("How");
	}

	@Test
	public static void Now() {
		// TODO Auto-generated method stub
		System.out.println("Now");
	}

	@Test
	public static void PointerInfo() {
		System.out.println("powerInfo");
	}
}