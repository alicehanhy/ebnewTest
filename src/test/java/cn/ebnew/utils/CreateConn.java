package cn.ebnew.utils;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

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

	public Socket createConnection(){
		if (this.so==null) {
			try {
				this.so=new Socket(getHost(),getPort());
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return so;
	}
	
}
