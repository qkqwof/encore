package thread.step5.test;

class Calculator{
	private int memory;

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+ " : " + this.memory);//객체 출력에 이름 가져오기
	}
	
	public int getMemory() {
		return memory;
	}
}


class UserA extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserA");
		this.calculator = calculator;
	}//calculator만들어주고 setter해주면 해징관계가 생성

	public void run() {//쓰레드가 작동하는 부분
		calculator.setMemory(100);
	}
}

class UserB extends Thread{
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserB");//쓰레드 이름 만든 것!!
		this.calculator = calculator;
	}//calculator만들어주고 setter해주면 해징관계가 생성
	
	public void run() {
		calculator.setMemory(50);
	}
}


public class SharedMemoryTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		UserA thread1 = new UserA();
		thread1.setCalculator(calculator);
		thread1.start();
		
		UserB thread2 = new UserB();
		thread2.setCalculator(calculator);
		thread2.start();

	}

}
