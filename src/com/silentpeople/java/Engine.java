package com.silentpeople.java;

public class Engine {
	int rpm;
	int engineStatus;
	public String start_stopEngine(boolean engineStatus){
		if(engineStatus == true) {
			System.out.println("on");
//실제로는 엔진을 시동거는 아주 복잡한 코드들,.../
			this.engineStatus = 1;// 확인 가능
			return "on";	
		}
		else {
			// 실제로는 엔진을 끄는 아주 복잡한 코드들..
			return "off";
		}
		
	}
	public void rpmControl(int oilOut){
		this.rpm = oilOut *1000;
		System.out.println(rpm);
	}

		
}



