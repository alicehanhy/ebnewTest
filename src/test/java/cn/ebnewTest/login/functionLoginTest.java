package cn.ebnewTest.login;

import org.testng.annotations.Test;

import cn.ebnew.utils.CreateConn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class functionLoginTest {
  @Test
  //正常登录，正确的用户名和密码
  public void login1() {
	  
  }
  @Test
  //异常登录：正确的用户名，错误的密码
  public void login2(){
	  
  }
  @Test
  //异常登录：正确的用户名，密码为空
  public void login3(){
	  
  }
  @Parameters
  
  @BeforeTest
  public void BeforeTest(){
	  CreateConn conn=new CreateConn();
//	  conn.setHost(host);
//	  conn.setPort(port);
  }
  @AfterTest
  public void AfterTest(){
	  
  }

}
