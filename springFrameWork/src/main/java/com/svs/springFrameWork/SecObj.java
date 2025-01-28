package com.svs.springFrameWork;

import org.springframework.stereotype.Component;

@Component
public class SecObj implements Read {

	public SecObj() {
		System.out.println("Second Object Created...!!");
	}

	public void startRead() {
		System.out.println("Reading in Second Object..!!!!");
	}

}
