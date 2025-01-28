package com.svs.springFrameWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.svs.springFrameWork.config.Config;


public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		CreateObj obj1=context.getBean(CreateObj.class);
		System.out.println(obj1.getI());
		obj1.write();
//		
//		
//		SecObj obj = context.getBean("sobj", SecObj.class);
//		obj.startRead();


//		ApplicationContext context = new ClassPathXmlApplicationContext("BeanCreate.xml"); // creatingContainer
//		CreateObj obj = (CreateObj) context.getBean("createObj");
//		obj.i = 28;
//		System.out.println(obj.i);
//		obj.write();

//		SecObj obj1=(SecObj) context.getBean("sob");
	}
}
