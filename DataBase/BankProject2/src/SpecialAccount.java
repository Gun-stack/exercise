
public class SpecialAccount extends Account{

	 String grade = "N"; // 등급 - VIP, Gold, Silver, Normal

	    double interest = 0.01;

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        //입력을 받고 저장할 때 변경해서 저장해도 됨 >> 이자율까지 같이 결정
	        switch (grade) {
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
	            //this.grade = grade;
	        }
	    }

	    SpecialAccount() {}

	    public SpecialAccount(String id, String name, int balance, String grade){
	            super(id, name, balance);
	            setGrade(grade);
	            //this.grade = grade; // setGrade(grade)를 통해서 입력해줄 수 있음.
	            }

	    /*public void info(Account sacc){
	        String saGrade = ((SpecialAccount)sacc).grade;
	        if(saGrade.equals("V")) saGrade = "VIP";
	        else if(saGrade.equals("G")) saGrade = "GOLD";
	        else if(saGrade.equals("S")) saGrade = "SILVER";
	        else saGrade = "NORMAL";
	        System.out.println("계좌번호 : " + sacc.id + ", 이름 : " + sacc.name + ", 잔액 : " + sacc.balance + ", 등급 : " + saGrade);
	    }*/

	    /*public double moneys(Account sacc){
	        String sgrade = ((SpecialAccount) sacc).getGrade();
	        if(sgrade.equals("V")) return 1.04;
	        else if(sgrade.equals("G")) return 1.03;
	        else if(sgrade.equals("S")) return 1.02;
	        else return 1.01;
	    }*/

	    @Override
	    public void deposit ( int money) throws BankExecption{
	            super.deposit((int) (Math.round(money * (1 + interest))));
	    }
//	    @Override
//	    public String info () {
//	        return super.info() + " 등급 : " + grade;
//	    }
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return  "계좌번호 : " + id + " 이름 : " + name + " 잔액 : " + balance + " 등급 : " + grade;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
