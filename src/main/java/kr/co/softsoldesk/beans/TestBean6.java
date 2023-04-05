package kr.co.softsoldesk.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean6 {
	// 변수의 이름과 동일한 이름의 Bean주입
	@Resource(name="data1") // Autowire + Qualifier
	private DataBean1 data100;
	
	@Resource(name="data2")
	private DataBean2 data200;
	
	public DataBean1 getData1() {
		return data100;
	}
	
	public DataBean2 getData2() {
		return data200;
	}
	
	
		
	
}

