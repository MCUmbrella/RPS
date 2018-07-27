//Chinese version: 1.8
package rps;
import java.util.Scanner;
import java.util.Random;
public class RPS_CN 
{
	
	public static void main(String[] args) 
	{
		System.out.println("(C) 2018 Umbrella Studio. 石头剪刀布模拟器 V1.8");
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		long pw=0L;
		long cw=0L;
		long t=0L;
		long d=0L;
		System.out.print("输入你的名字:___________\b\b\b\b\b\b\b\b\b\b");
		String name=in.nextLine();
		if(name.equals("")){System.out.println("[!] 没有检测到名字。正在退出...");System.exit(-1);}
		
		while(true)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println(" _______________________ ");
			System.out.println("|       石头剪刀布        |");
			System.out.println(" ----------------------- ");
			System.out.println("欢迎, "+name+".");
			System.out.println("1-开始游戏 2-统计数据");
			System.out.print("3-退出          [_]\b\b");
			int a=in.nextInt();
			if(a==1) 
			{
				while(true)
				{
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					System.out.println("请输入 石头:1, 剪刀:2, 布:3,");
					System.out.print("["+pw+":"+cw+"]"+"      退出&统计:4. [_]\b\b");
					int p=in.nextInt();
					
					if(p==1||p==2||p==3) 
					{
						if(p==1) {System.out.println("-你选择了石头。");}
						if(p==2) {System.out.println("-你选择了剪刀。");}
						if(p==3) {System.out.println("-你选择了布。");}
						
						int c=r.nextInt(3);
						if(c==0) {System.out.println("-电脑选择了石头。");}
						if(c==1) {System.out.println("-电脑选择了剪刀。");}
						if(c==2) {System.out.println("-电脑选择了布。");}
						
						if(p==1&&c==0) {System.out.println(name+" 和电脑平局。");d++;}
						if(p==2&&c==1) {System.out.println(name+" 和电脑平局。");d++;}
						if(p==3&&c==2) {System.out.println(name+" 和电脑平局。");d++;}
						if(p==2&&c==0) {System.out.println("电脑胜利。");cw++;}
						if(p==1&&c==1) {System.out.println(name+" 胜利。");pw++;}
						if(p==1&&c==2) {System.out.println("电脑胜利。");cw++;}
						if(p==2&&c==2) {System.out.println(name+" 胜利。");pw++;}
						if(p==3&&c==0) {System.out.println(name+" 胜利。");pw++;}
						if(p==3&&c==1) {System.out.println("电脑胜利。");cw++;}
						t++;
						
					}else if(p==4) {System.out.println(name+" 胜利 "+pw+" 回合。");System.out.println("电脑胜利 "+cw+" 回合。");System.out.println("平局 "+d+" 回合。");System.out.println("-正在退出...");break;}else {System.out.println("[!] 错误的数字。正在退出...");System.out.println(name+" 胜利 "+pw+" 回合。");System.out.println("电脑胜利 "+cw+" 回合");System.exit(-1);}
				}
			}else if(a==2) 
			{
				System.out.println("=-=-=-统计信息=-=-=-");
				System.out.println(name+" 胜利 "+pw+" 回合。");
				System.out.println("电脑胜利 "+cw+" 回合。");
				System.out.println("平局 "+d+" 回合。");
				System.out.println("总回合数: "+t);
				if(t!=0)
				{
				float w=(float)(pw*100/t);
				System.out.println("胜率: "+w+" %");
				}
			}else if(a==3) 
			{
				System.out.println("Bye!");System.exit(0);
			}
			
		}
	}
	
}
