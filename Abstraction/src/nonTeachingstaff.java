
public abstract class nonTeachingstaff extends staff{

	private Integer noofEmploye;
	
	public Integer getNoofEmploye() {
		return noofEmploye;
	}

	public void setNoofEmploye(Integer noofEmploye) {
		this.noofEmploye = noofEmploye;
	}

	public nonTeachingstaff() {
		noofEmploye = 0;
	}
	
	public nonTeachingstaff(Integer noofEmploye) {
		this.noofEmploye = noofEmploye;
	}
	
}
