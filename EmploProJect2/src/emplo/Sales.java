package emplo;

public class Sales extends Permanent implements BusinessTrip{
	int bonus;

	public Sales() {
	}

	public Sales(int id, String name, int salary, int bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int getPay() {
		return super.getPay() + getBonus();
	}
	
	@Override
	public void reBusinessTrip(int n) {
		// TODO Auto-generated method stub
		 setBonus(getBonus()+300000*n); // 인센티브에 출장 비용을 더해 저장
	        /*
	        강사님 코드
	        incentive += day*300000;
	         */
	}
	
	
	
	
	
//	@Override
//	public String info() {
//		return super.info() + "급여 : "+getPay();
//	}
//****다형성 	

}
