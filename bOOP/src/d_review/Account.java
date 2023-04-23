package d_review;

public class Account {			// 세터 만든다 = 값을 변경할 수 있다
	private String numAccount;	// 세터? 생성자? 
	private String name;
	private long amount;
	
	public Account() {		//습관적으로 만들자!
		
	}
	
	public Account(String numAccount, String name){
		this.numAccount = numAccount;
		this.name = name;
	}
	
	public Account(String numAccount, String name, long amount){
		this(numAccount, name);		// 이 두 개는 위의 것이 처리할 거고 
		this.amount = amount;		// 나는 이것만 처리할 거야
	}
	
	// 금액을 증가하는 함수
	public void addAmount(long money) {
		amount += money;
	}
	
	// 금액을 감소하는 함수
	public void subAmount(long money) {
		amount -= money;
	}

	
	// 정보 출력
	public void output() {
		System.out.println(name + "님 계좌 번호는 " + numAccount + "를 지정합니다." );
		System.out.println(name + "님 계좌에 " + amount + "원을 입금합니다.");
		System.out.println(name + "계좌 정보를 출력합니다.");
		System.out.println("");
	}
}
