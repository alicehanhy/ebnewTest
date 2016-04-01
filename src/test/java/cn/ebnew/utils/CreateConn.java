package cn.ebnew.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CreateConn {
	private String host;
	private int port;
	Socket so;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	// 创建socket连接
	public Socket createConnection() {
		if (this.so == null) {
			try {
				this.so = new Socket(getHost(), getPort());
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return so;
	}
	/*
	 * 创建write流 从内存向硬盘存数据 - O 从硬盘向内存存数据 - I
	 */

	// 创建read流

}
