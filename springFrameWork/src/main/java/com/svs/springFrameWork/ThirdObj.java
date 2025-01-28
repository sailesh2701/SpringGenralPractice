package com.svs.springFrameWork;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ThirdObj implements Read {

	public ThirdObj() {
		System.out.println("Third Object Created..!");
	}

	@Override
	public void startRead() {
		System.out.println("Reading in third object...");
	}

}
