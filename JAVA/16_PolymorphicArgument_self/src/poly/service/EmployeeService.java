package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;

/*
 * Singletone Pattern
 * 하나의 클래스로부터 하나의 객체만 생성하도록 하는 패턴
 * 1. 클래스 안에서 일단 객체 하나는 생성
 *    private static 객체를 생성한다.
 * 2. 다른 곳에서(다른 클래스)는 객체 생성을 하지 못하도록 막아둔다
 *    private 생성자(){}
 * 3. 만들어놓은 하나의 객체를 어디서든지 가져다 쓸수 있도록 public한 메소드를 만들어둔다.
 * ---------------------------------------------------------------------------
 * 
 * 1. Service 클래스는 Employee(부모)[ ], Employee 을 hasing.
 * 2. 부모타입의 배열객체를 가지게되면 배열에 담긴 여러개의 자식객체들을 관리할수 있따....
 *    단일한 기능으로 ...즉, 부모클래스의 기능이다.
 * 3. Polymorphic Argument
 */
public class EmployeeService {
	
	static private EmployeeService service = new EmployeeService();//1
	private EmployeeService() {}//2
	public static EmployeeService getInstance() { //3
		return service;
	}
	
	
	//0.
	public void printInfo(Employee e){
		System.out.println(e);
	}
	
	//1. 모든 Employee[ ]안에 들어있는 객체 정보들을 출력
	public void printAllInfo(Employee[ ] ea){
		for(int i=0; i<ea.length; i++){
			System.out.println(ea[i]);
		}
	}
	
	//2.테스트 클래스에서 넘겨받은 empId의 값과 일치하는 객체를 리턴하는 기능
	public Employee findByEmpId(Employee[ ] ea, String empId){
		Employee emp = null;
		
		for(int i=0; i<ea.length; i++){
			if(ea[i].getEmpId().equals(empId)){
				emp=ea[i];
				break;
			}
		}
		return emp;
	}
	
	//3. 테스트 클래스에서 넘겨받은  addr값과 일치하는 Employee 타입의 객체를 리턴받음
	//같은 주소를 가진 사람의 count를 함께 알아낸다.
	/*public Employee[ ] findByAddress(Employee[ ] ea, String addr){
		Employee[ ] emp = new Employee[ea.length];
		int count = 0;
		
		for(int i=0; i<ea.length;i++){
			if(ea[i].getAddr().equals(addr)){ //2,3
				emp[ count ] = ea[i];
				count++;
			}
		}		
		return emp;
	}*/
	//test에서 continue를 사용하는 방법....count사용 하지 않고
	public Employee[ ] findByAddress(Employee[ ] ea, String addr){
		Employee[ ] emp = new Employee[ea.length];
		for(int i=0; i<emp.length; i++){
			if(ea[i].getAddr().equals(addr)){
				emp[i] = ea[i];
			}
		}
		return emp;
	}
	
	//4. 특정한 Employee의 연봉을 리턴하는 기능...Engineer일때는 보너스 까지 생각
	public int getAnnualSalary(Employee e){
		int annualSalary = 0;
		
		annualSalary = e.getSalary()*12;
		
		if(e instanceof Engineer){
			Engineer eg = (Engineer)e;
			annualSalary =eg.getSalary()*12+eg.getBonus();
		}
		return annualSalary;
	}
	
	//5. 연간 총 인건비의 총액을 리턴하는 기능
	public int getTotalCost(Employee[ ] ea){
		int totalCost = 0;
		for(int i=0; i<ea.length; i++){
			totalCost += getAnnualSalary(ea[i]);
		}
		return totalCost;
		
	}
	
}





































