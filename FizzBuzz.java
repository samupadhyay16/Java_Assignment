package ques;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=20;num++) {
			if(num%3==0 && num%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(num%3==0){
				System.out.println("Fizz");
			}
			else if(num%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(num);
			}
		}
		

	}

}
