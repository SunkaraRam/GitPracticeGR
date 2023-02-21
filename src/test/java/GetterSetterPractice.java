
public class GetterSetterPractice {
	
	
	private String name;
	private int sno;
	private float salary;

	public void setSalary(int s) {
		
		if (s<0) {
			s=-s;
		}
		
		this.salary=s;
	}
	
	public int getSalary() {
		
		return (int) this.salary;
	}
	
	public static void main(String[] args) {
		
		GetterSetterPractice gt = new GetterSetterPractice();
		
		gt.setSalary(-900);
		
		int salary = gt.getSalary();
		
		System.out.println(salary);
	}
	
	
	
	
	
}
