package com.silentpeople.java;

import java.util.Scanner;

public class mainclass {
	
	public static void main(String [] args){
       
		while(true){
			System.out.println("Input Value");
		Scanner sc = new Scanner(System.in);
		String controlValue =sc.nextLine();// �õ���:�Ǽ���//0/1,0~100
        
		String [] values = controlValue.split(":");
		
		int sidongVal = Integer.parseInt(values[0]);
		int accelVal = Integer.parseInt(values[1]);
		
		Sidong sidong1 = new Sidong();//�ν��Ͻ� ����\!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sidong1.engineStartStop(sidongVal);
		}
		
	}
	
}


