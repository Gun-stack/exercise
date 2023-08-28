package emplo;

public class PartTime extends Employee implements BusinessTrip {
	int time;
	int payPerTime;

	public PartTime() {
	}

	public PartTime(int id, String name, int time, int payPerTime) {
		super(id, name);
		this.time = time;
		this.payPerTime = payPerTime;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}

	public int getPay() {
		return getTime() * getPayPerTime();
	}

	@Override
	public String info() {
		return super.info() + "  급여 : " + getPay();
	}
	@Override
	public void reBusinessTrip(int n) {
		setTime(getTime()+(n*24));
		/*
        강사님 코드
        time += (day*24);
         */
		}

}
