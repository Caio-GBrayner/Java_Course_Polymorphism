package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return valuePerHour * hours *1.10;
	}
/*	public  void addWorker(Employee worker) {
		workers.add(worker);
	}*/
	
	

}
