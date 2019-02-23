package chap02;
//임포트하는 GenericXmlApplicationContext클래스는 XML파일로부터 설정 정보를 읽어와 빈 객체를 생성하고 관리하는 기능 제공
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//GenericXmlApplicationContext객체를 생성할 때 앞서 작성한 applicationContext.xml파일의 경로를
		//생성자 파라미터로 전달하는데, 이 경우 GenericXmlApplicationContext는 applicationContext.xml에 정의한
		//<bean>설정 정보를 읽어와 내부적으로 Greeter 객체를 생성하고 초기화한다.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//getBean()메서드는 GenericXmlApplicationContext가 XML파일을 읽어와 생성한 빈 객체를 검색할 때 사용.
		//getBean()메서드의 첫 번째 파라미터는 <bean>태그의 id속성으로 지정한 이름이며, 두번쨰 파라미터는 검색할 빈 객체의 타입임.
		//앞서 작성한 XML파일을 보면 아래 코드와 같이 이름이 greeter이고 타입이 Greeter인 빈을 설정했으므로
		//getBean()메서드는 applicationContext.xml에 설정한 bean태그를 통해 생성되는 Greeter 객체를 리턴함.
		Greeter g = ctx.getBean("greeter", Greeter.class);
		//위에서 구한 Greeter객체의 greet()메서드 실행.
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
