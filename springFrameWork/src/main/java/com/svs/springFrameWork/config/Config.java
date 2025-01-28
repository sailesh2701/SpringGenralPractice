package com.svs.springFrameWork.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.svs.springFrameWork.CreateObj;
import com.svs.springFrameWork.Read;
import com.svs.springFrameWork.SecObj;
import com.svs.springFrameWork.ThirdObj;

@Configuration
@ComponentScan("com.svs")
public class Config {

//	
//	@Bean
////	@Scope("prototype") // default it is singleton
//	/** Both second and third objects implements Read **/
//	// We can use @Qualifier for first preference or we can use @Primary to that
//	// particular bean if we use both it will take @Qualifier because we are
//	// manually saying there
//	public CreateObj cobj(Read r) {// @Qualifier("tobj")
//		CreateObj obj = new CreateObj();
//		obj.setI(27);
//		obj.setObjec(r);
//		return obj;
//	}
//
//	@Bean
//	@Primary
////	@Scope("prototype") //default it is singleton
//	public SecObj sobj() {
//		return new SecObj();
//	}
//
//	@Bean
////	@Scope("prototype") //default it is singleton
//	public ThirdObj tobj() {
//		return new ThirdObj();
//	}

}
