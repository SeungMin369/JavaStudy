package jdbc.model;

public class Employee {
	
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private int salary;
	private double commission_pct;
	private int manager_id;
	private int department_id;
	private String department_name;
	private int location_id;
	
	public Employee(int employee_id, String first_name, String last_name, String email,
			String phone_number, String hire_date, String job_id, int salary, 
			double commission_pct, int manager_id, int department_id, String department_name,
			int location_id) {
		
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.department_name = department_name;
		this.location_id = location_id;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\t%s\t%d\n",
				employee_id, first_name, last_name, email, phone_number, hire_date,
				job_id, salary, commission_pct, manager_id, department_id, department_name,
				location_id);
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public String getHire_date() {
		return hire_date;
	}
	
	public String getJob_id() {
		return job_id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getCommission_pct() {
		return commission_pct;
	}
	
	public int getManager_id() {
		return manager_id;
	}
	
	public int getDepartment_id() {
		return department_id;
	}
	
	public String getDepartment_name() {
		return department_name;
	}
	
	public int getLocation_id() {
		return location_id;
	}
}













