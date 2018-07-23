
public class cleark extends nonTeachingstaff{

		public String dept;

		public String getName() {
			return dept;
		}

		public void setName(String name) {
			this.dept = dept;
		}

		public cleark(String dept) {
			super();
			this.dept = dept;
		}
		
		public cleark() {
			dept = " ";
		}
		
		public void Department(){
			System.out.println("My Department is DCST");
		}
		
		public void qualification(){
			System.out.println("My Qualification is 12th");
		}
		
		public void calculateSalary(){
			System.out.println("Salary for non- teching staff");
		}
		
}

