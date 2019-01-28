/*
 * RPS.c
 * 
 * Copyright 2019 MCUmbrella <mcumbrella@qq.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define random(x)(rand()%x) //import java.util.Random; Random random=new Random();

int main(int argc, char **argv)
{
	printf("%d %d %s\n",argc,**argv,*argv);
	printf("\n[i] (C) 2018 Umbrella Studio. Rock-Paper-Scissors Simulator C1.0\n");
	long pw=0L;
	long cw=0L;
	long t=0L;
	long d=0L;
	int a;
	int p;
	int c;
	printf("Enter your name:\n> ");
	char name[64]; scanf("%s",name); //String name=in.nextLine();
	printf("[D] name=%s\n",name);
	menu:
	printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nRock-Paper-Scissors Simulator\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nWelcome, %s.\n1-Play\n2-Statistics\n3-Exit\n> ",name);
	scanf("%d",&a);//int a=in.nextInt();

	if(a==1)
	{
		for(;;)
		{
			printf("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nPlease input rock:1, scissors:2, paper:3,\n[%ld:%ld]      Exit & Statistics:4.\n> ",pw,cw);
			scanf("%d",&p); //int p=in.nextInt();
			if(p==1||p==2||p==3)
			{
				if(p==1) {printf("-You have chosen the rock.\n");}
				if(p==2) {printf("-You have chosen scissors.\n");}
				if(p==3) {printf("-You have chosen the paper.\n");}
				c=random(3);
				if(c==0) {printf("-Computer chose the rock.\n");}
				if(c==1) {printf("-Computer chose scissors.\n");}
				if(c==2) {printf("-Computer chose the paper.\n");}
				
				if(p==1&&c==0) {printf("[i] %s and computer draw.\n",name);d++;}
				if(p==2&&c==1) {printf("[i] %s and computer draw.\n",name);d++;}
				if(p==3&&c==2) {printf("[i] %s and computer draw.\n",name);d++;}
				
				if(p==2&&c==0) {printf("[i] Computer wins.\n");cw++;}
				if(p==1&&c==2) {printf("[i] Computer wins.\n");cw++;}
				if(p==3&&c==1) {printf("[i] Computer wins.\n");cw++;}
				
				if(p==1&&c==1) {printf("[i] %s wins.\n",name);pw++;}
				if(p==2&&c==2) {printf("[i] %s wins.\n",name);pw++;}
				if(p==3&&c==0) {printf("[i] %s wins.\n",name);pw++;}
				t++;
			}else if(p==4)
			{
				printf("[i] %s won %ld times.\n",name,pw);
				printf("[i] Computer won %ld times.\n",cw);
				printf("[i] Draw %ld times.\n",d);
				printf("[i] Exiting...\n");
				goto menu;//break?
			}else
			{
				printf("[!] Incorrect input number.\n");
			}
			
		}
	}else if(a==2) 
	{
		printf("-=-=-=-Statistics=-=-=-\n");
		printf("%s won %ld times.\n",name,pw);
		printf("Computer won %ld times.\n",cw);
		printf("Draw %ld times.\n",d);
		printf("Total rounds: %ld\n",t);
		if(t!=0)
		{
			short w=pw*100/t;
			printf("Win rate: %d %%\n",w);
		}
		goto menu;
	}else if(a==3) 
	{
		printf("[i] Bye!\n");return 0;
	}else{printf("[!] Incorrect input number.\n");goto menu;}
	
	return 0;
}

