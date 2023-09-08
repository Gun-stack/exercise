package acc;

import java.io.Serializable;

import exc.BankExecption;

public class SpecialAccount extends Account implements Serializable {

	String grade = "N"; // 등급 - VIP, Gold, Silver, Normal

	double interest = 0.01;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		// 입력을 받고 저장할 때 변경해서 저장해도 됨 >> 이자율까지 같이 결정
		switch (""+grade.charAt(0)) {
		case "V":
		case "v":
			this.grade = "VIP";
			interest = 0.04;
			break;
		case "G":
		case "g":
			this.grade = "Gold";
			interest = 0.03;
			break;
		case "S":
		case "s":
			this.grade = "Silver";
			interest = 0.02;
			break;
		case "N":
		case "n":
			this.grade = "Normal";
			interest = 0.01;
			break;
		// this.grade = grade;
		}
	}

	SpecialAccount() {
	}

	public SpecialAccount(String id, String name, int balance, String grade) {
		super(id, name, balance);
		setGrade(grade);
	}


	@Override
	public void deposit(int money) throws BankExecption {
		super.deposit((int) (Math.round(money * (1 + interest))));
	}

	@Override
	public String toString() {
		return "계좌번호 : " + id + " 이름 : " + name + " 잔액 : " + balance + " 등급 : " + grade;
	}

}
