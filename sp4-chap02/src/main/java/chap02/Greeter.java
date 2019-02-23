package chap02;

public class Greeter {
	private String format;
	
	//String의 문자열 포맷을 이용해 새로운 문자열 생성
	public String greet(String guest) {
		return String.format(format, guest);
	}
	//greet()에서 사용할 문자열 포맷 설정
	public void setFormat(String format) {
		this.format=format;
	}
}
