
public abstract class teachingstaff extends staff {
	private Integer id;
	
	public Integer getNoofEmploye() {
		return id;
	}

	public void setNoofEmploye(Integer noofEmploye) {
		this.id = id;
	}

	public teachingstaff() {
		id = 0;
	}
	
	public teachingstaff(Integer id) {
		this.id = id;
	}
	

	
}
