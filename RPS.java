package rps;
import java.util.Scanner;
import java.util.Random;
public class RPS 
{
	
	private static Scanner in;

	public static void main(String[] args) 
	{
		System.out.println(args);
		System.out.println("\n[i] (C) 2018 Umbrella Studio. Rock-Paper-Scissors Simulator V1.9");
		in = new Scanner(System.in);
		Random r=new Random();
		long pw=0L;
		long cw=0L;
		long t=0L;
		long d=0L;
		System.out.print("Enter your name:\n> ");
		String name=in.nextLine();
		if(name.equals(""))
		{
			System.out.println("[!] No name detected. Use defaule name \"Player\"? (y/n)");
			String ask=in.nextLine();
			if(ask.equals("y")||ask.equals("Y")){name="Player";}else{System.out.println("[i] Exiting...");System.exit(-1);}
		}
		
		while(true)
		{
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nRock-Paper-Scissors Simulator\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Welcome, "+name+".");
			System.out.print("1-Play\n2-Statistics\n3-Exit\n> ");
			int a=in.nextInt();
			if(a==1) 
			{
				while(true)
				{
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("Please input rock:1, scissors:2, paper:3,");
					System.out.print("["+pw+":"+cw+"]"+"      Exit & Statistics:4.\n> ");
					int p=in.nextInt();
					
					if(p==1||p==2||p==3) 
					{
						if(p==1) {System.out.println("-You have chosen the rock.");}
						if(p==2) {System.out.println("-You have chosen scissors.");}
						if(p==3) {System.out.println("-You have chosen the paper.");}
						
						int c=r.nextInt(3);
						if(c==0) {System.out.println("-Computer chose the rock.");}
						if(c==1) {System.out.println("-Computer chose scissors.");}
						if(c==2) {System.out.println("-Computer chose the paper.");}
						
						if(p==1&&c==0) {System.out.println("[i] "+name+" and computer draw.");d++;}
						if(p==2&&c==1) {System.out.println("[i] "+name+" and computer draw.");d++;}
						if(p==3&&c==2) {System.out.println("[i] "+name+" and computer draw.");d++;}
						if(p==2&&c==0) {System.out.println("[i] "+"Computer wins.");cw++;}
						if(p==1&&c==1) {System.out.println("[i] "+name+" wins.");pw++;}
						if(p==1&&c==2) {System.out.println("[i] "+"Computer wins.");cw++;}
						if(p==2&&c==2) {System.out.println("[i] "+name+" wins.");pw++;}
						if(p==3&&c==0) {System.out.println("[i] "+name+" wins.");pw++;}
						if(p==3&&c==1) {System.out.println("[i] "+"Computer wins.");cw++;}
						t++;
						
					}else if(p==4)
					{
						System.out.println("[i] "+name+" won "+pw+" times.");
						System.out.println("[i] Computer won "+cw+" times.");
						System.out.println("[i] Draw "+d+" times.");
						System.out.println("[i] Exiting...");
						break;
					}else
					{
						System.out.println("[!] Incorrect input number.");
					}
				}
			}else if(a==2) 
			{
				System.out.println("-=-=-=-Statistics=-=-=-");
				System.out.println(name+" won "+pw+" times.");
				System.out.println("Computer won "+cw+" times.");
				System.out.println("Draw "+d+" times.");
				System.out.println("Total rounds: "+t);
				if(t!=0)
				{
				//float w=(float)(pw*100/t);
				byte w=(byte)(pw*100/t);
				System.out.println("Win rate: "+w+" %");
				}
			}else if(a==3) 
			{
				System.out.println("[i] Bye!");System.exit(0);
			}else{System.out.println("[!] Incorrect input number.");}
			
		}
	}
	
}
