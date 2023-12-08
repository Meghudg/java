package com.loosecoupling;

public class ChoiceOfPrize implements Test {
	private Test t;
	ChoiceOfPrize(Test t) {
		this.t = t;
	}
	public void prize() {
		t.prize();
	}

}
