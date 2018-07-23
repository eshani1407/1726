
public class hod extends teachingstaff{

		public String quali;

		public String getName() {
			return quali;
		}

		public void setName(String name) {
			this.quali = quali;
		}

		public hod(String quali) {
			super();
			this.quali = quali;
		}
		
		public hod() {
			quali = " ";
		}
		
		public void Department(){
			System.out.println("My Department is");
		}  
		
		public void qualification(){
			System.out.println("My Qualification is");
		}
		
		public void calculateSalary(){
			System.out.println("Salary for teching staff");
		}
		
}
