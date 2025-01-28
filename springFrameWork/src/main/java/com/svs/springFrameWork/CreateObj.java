package com.svs.springFrameWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CreateObj {

	private int i;
	
	@Autowired
	@Qualifier("secObj")
	private Read objec;

	public int getI() {
		return i;
	}

	public void setI(int i) {
//		System.out.println("Setter Object variable ");
		this.i = i;
	}

	public CreateObj() {
		System.out.println("Created Object");
	}

	public void write() {
		System.out.println("Writing..");
		objec.startRead();
	}

	public Read getObjec() {
		return objec;
	}

	public void setObjec(Read objec) {
		this.objec = objec;
	}

}
