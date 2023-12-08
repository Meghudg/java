package com.loose2coupling;

public class Travel implements Itravel {
	// sending transport object into travel class
	private Transport transport;
	//constructor
	Travel(Transport transport) {
		this.transport = transport;
	}
	public void start() {
		transport.start();
	}
}	


