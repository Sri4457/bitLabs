
import java.time.LocalTime;

public class VechilePojo {
	private String lisence_plate,model,company,type;
public VechilePojo() {
		// TODO Auto-generated constructor stub
	}

public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

private LocalTime m1,m2;
	private double miles;

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public LocalTime getM1() {
		return m1;
	}

	public void setM1(LocalTime m1) {
		this.m1 = m1;
	}

	public LocalTime getM2() {
		return m2;
	}

	public void setM2(LocalTime m2) {
		this.m2 = m2;
	}

	public String getLisence_plate() {
		return lisence_plate;
	}

	public void setLisence_plate(String lisence_plate) {
		this.lisence_plate = lisence_plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	

}
