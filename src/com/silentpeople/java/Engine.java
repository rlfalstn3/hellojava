package com.silentpeople.java;

public class Engine {
	int rpm;
	int engineStatus;
	public String start_stopEngine(boolean engineStatus){
		if(engineStatus == true) {
			System.out.println("on");
//�����δ� ������ �õ��Ŵ� ���� ������ �ڵ��,.../
			this.engineStatus = 1;// Ȯ�� ����
			return "on";	
		}
		else {
			// �����δ� ������ ���� ���� ������ �ڵ��..
			return "off";
		}
		
	}
	public void rpmControl(int oilOut){
		this.rpm = oilOut *1000;
		System.out.println(rpm);
	}

		
}



