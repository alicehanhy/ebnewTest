package cn.ebnewTest.login;

import org.testng.annotations.Test;

import cn.ebnew.utils.CreateConn;
import cn.ebnew.utils.StaticProvider;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.net.Socket;

import javax.sql.ConnectionPoolDataSource;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class functionLoginTest {

	@Test(dataProvider = "ConnctionDataProvider", dataProviderClass = StaticProvider.class)
	// 正常登录，正确的用户名和密码
	public void login1(String host, int port) {
		Socket socket=null;
		CreateConn conn = new CreateConn();
		conn.setHost(host);
		conn.setPort(port);
		socket=conn.createConnection();
		System.out.println("login1");
	}

	@Test
	// 异常登录：正确的用户名，错误的密码
	public void login2() {
		System.out.println("login2");
	}

	@Test
	// 异常登录：正确的用户名，密码为空
	public void login3() {
		System.out.println("login3");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("afterTest");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("afterMethod");
	}
}
