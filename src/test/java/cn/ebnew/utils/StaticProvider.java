package cn.ebnew.utils;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name = "ConnctionDataProvider")
	public Object[][] connDataProvider(){
		return new Object[][]{{"121.40.29.77",9285}};
	}
	@DataProvider(name="DBAuthInfo")
	//通过数据库查询，获得用户名和密码
	public Object[][] getAuthInfoByDB(){
		String sqlString="SELECT username,password from ofUser;";
		
		return new Object[][]{{}};
	}
	@DataProvider(name = "ExlAuthInfo")
	public Object[][] getAuthInfoByExl(){
		return new Object[][]{{}};
	}
	
}
