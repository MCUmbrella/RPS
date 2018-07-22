package rps;
//import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class RPS 
{
	
	public static void main(String[] args) 
	{
		System.out.println("(C) 2018 Umbrella Studio. Rock-Paper-Scissors Simulator");
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		int pw=0;
		int cw=0;
		System.out.print("Enter your name:___________\b\b\b\b\b\b\b\b\b\b");
		String name=in.nextLine();
		if(name.equals("")){System.out.println("[!] No name detected. Exiting...");System.exit(-1);}
		System.out.println("Welcome, "+name+".");
		while(true)
		{
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Please input rock:1, scissors:2, paper:3,");
			System.out.print("             Exit & Statistics:4. [_]\b\b");
			int p=in.nextInt();
			if(p==4) {System.out.println(name+" won "+pw+" times.");System.out.println("Computer won "+cw+" times.");System.out.println("-Exiting...");System.exit(0);}
			if(p==1||p==2||p==3) 
			{
				if(p==1) {System.out.println("-You have chosen the rock, please wait for the computer to choose...");}
				if(p==2) {System.out.println("-You have chosen scissors, please wait for the computer to choose...");}
				if(p==3) {System.out.println("-You have chosen the paper, please wait for the computer to choose...");}
				
				int c=r.nextInt(3);
				if(c==0) {System.out.println("-Computer chose the rock.");}
				if(c==1) {System.out.println("-Computer chose scissors.");}
				if(c==2) {System.out.println("-Computer chose the paper.");}
				
				if(p==1&&c==0) {System.out.println(name+" and computer draw.");}
				if(p==2&&c==1) {System.out.println(name+" and computer draw.");}
				if(p==3&&c==2) {System.out.println(name+" and computer draw.");}
				if(p==2&&c==0) {System.out.println("Computer wins.");cw++;}
				if(p==1&&c==1) {System.out.println(name+" wins.");pw++;}
				if(p==1&&c==2) {System.out.println("Computer wins.");cw++;}
				if(p==2&&c==2) {System.out.println(name+" wins.");pw++;}
				if(p==3&&c==0) {System.out.println(name+" wins.");pw++;}
				if(p==3&&c==1) {System.out.println("Computer wins.");cw++;}
				
			}else {System.out.println("[!] Incorrect input number. Exiting...");System.out.println(name+" won "+pw+" times.");System.out.println("Computer won "+cw+" times.");System.exit(-1);}
		}
	}
	
}
