package kr.co.softsoldesk.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.beans.TestBean6;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 일반적인 Annotation init와 destroy호출
		TestBean1 obj1=ctx.getBean("obj1", TestBean1.class);
		
		// JSR250의 Annotation으로 init와 destroy호출
		TestBean2 obj2=ctx.getBean("obj2", TestBean2.class);
		System.out.println("-------------------------------------------------------------------------------------");
		
		// Autowire.ByName을 이용한 주입
		TestBean3 obj3=ctx.getBean("obj3", TestBean3.class);
		System.out.println("obj3.data1 : "+obj3.getData1());
		System.out.println("obj3.data1 : "+obj3.getData2());
		System.out.println("-------------------------------------------------------------------------------------");

		// Qualifier
		TestBean4 obj4=ctx.getBean("obj4", TestBean4.class);
		System.out.println("obj4.data1 : "+obj4.getData1());
		System.out.println("obj4.data1 : "+obj4.getData2());
		System.out.println("-------------------------------------------------------------------------------------");
	
		// resource
		TestBean5 obj5=ctx.getBean("obj5", TestBean5.class);
		System.out.println("obj5.data1 : "+obj5.getData1());
		System.out.println("obj5.data1 : "+obj5.getData2());
		System.out.println("-------------------------------------------------------------------------------------");
		
		// resource name
		TestBean6 obj6=ctx.getBean("obj6", TestBean6.class);
		System.out.println("obj6.data1 : "+obj6.getData1());
		System.out.println("obj6.data1 : "+obj6.getData2());
		System.out.println("-------------------------------------------------------------------------------------");
		ctx.close();
		
	}

}
