package chpa7;


class Unit{
	int x;
	int y;
	
	void move(int x, int y) {
		this .x = x;
		this .y = y;
	}	

	void stop() {
		System.out.printf("(%d,%d)",x,y);
}
}

class Marine extends Unit { 

	void stimPack() {
}
}

class Tank extends Unit {  

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit{ // 수송선 }

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}


public class Ex7_17 {
	public static void main(String[] args) {
		Marine mar1 = new Marine();
		mar1.move(3, 2);
		mar1.stop();
		mar1.stimPack();
		
		Tank ta1 = new Tank();
		ta1.move(2, 7);
		ta1.stop();
		ta1.changeMode();
		
		Dropship dropship = new Dropship();
		dropship.load();
		dropship.move(2, 0);
		dropship.stop();
	}
}
