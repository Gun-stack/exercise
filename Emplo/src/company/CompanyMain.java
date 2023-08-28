package company;

import emplo.*;
import emplo.Permanent;
import emplo.Sales;

public class CompanyMain {

	public static void main(String[] args) {
		Company com = new Company();
		Permanent emp1 = new Permanent(10101, "1길동", 3000000);
		Sales emp2 = new Sales(10201, "2길동", 100000, 3000000);
		PartTime emp3 = new PartTime(10301, "3길동", 200, 20000);
		// 참조타입 제각각 - > 부모 타입 으로 업캐스팅

		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);

		com.regBusinessTrip(emp2, 10); // Sales 출장 가능, 하루당 300,000원을 인센티브로 지급
		com.regBusinessTrip(emp3, 10); // PartTime 출장 가능, (출장 시간(1일24시간)*payPerTime)원을 인센티브로 지급

		com.allEmpInfo();
		System.out.println("총급여 : " + com.getTotalPay());
//		System.out.println(emp2.info());
	}
}
