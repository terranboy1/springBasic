package chap02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter g1 = ctx.getBean("greeter",Greeter.class);
		Greeter g2 = ctx.getBean("greeter",Greeter.class);
		Greeter g3 = ctx.getBean("greeter1",Greeter.class);
		//오잉, true네? 같은 객체라고? (스프링은 기본적으로 한 개의 <bean>태그에 대해 한 개의 빈 객체 생성) - 싱글톤 범위를 갖는다라고 표현함.
		System.out.println("(g1==g2) = " + (g1==g2));
		//다른 bean태그니까 다른 객체. 프로토타입 범위
		System.out.println("(g2==g3) = " + (g2==g3));
		ctx.close();
	}

}
