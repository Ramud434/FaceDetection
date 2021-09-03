package com.ram;

public class PalindromeExample {

	public static void main(String[] args) {
		int num= 131;
		int r=0;
		 int sum = 0;
		int temp=num;
		while(num>0);
		{
		r=num%10;
		sum = (sum*10)+r;
		num=num/10;
		}
		if(temp==sum){
		System.out.println("Palindrome  Number");
		}else{ 
		System.out.println("not Palindrome Number");

	}

}
}