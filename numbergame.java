package game;
import java.util.*;
public class numbergame {

			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				Random rd = new Random();
				System.out.println("Hiiiiiiii Friend !!Game is Waiting for you!");
				int r = 1;
				int win = 0;
				while(true)
				{
					System.out.println("            WELCOME            ");
					System.out.println("Come on!!Let us Enter into the Game"+r+" : ");
					int chances = 10;
					System.out.println("There will be 10 chances to guess the number. You should guess the number from 1 to 100 ");
					System.out.println("Guess correct number to win the game");
					System.out.println("All The Best Friend!!!");
					int i = 1;
					int min = 1;
					int max = 100;
					int target = rd.nextInt(max-min+1)+min;
					for(i=1;i<=10;i++)
					{
						System.out.println();
						System.out.println("Chance "+i+" Enter the number you Guessed");
						int num = sc.nextInt();
						System.out.println();
						if(num>target) System.out.println("The guessing number is too high!");
						else if(num<target) System.out.println("The guessing number  is too low");
						else
						{
							System.out.println("Hurrayy!!You Guessed the number and won the game "+r+" just by "+i+" chances...");
							win++;
							break;
						}
						chances--;
						if(chances>0) System.out.println(chances+" chances! are waiting for you! Try it!");
					}
					System.out.println();
					if(chances == 0) 
					{
						System.out.println("You have lost :( but don't give up try once more..");
						System.out.println("All the best");
						System.out.println();
					}
					System.out.println("Overall rounds played : "+r);
					System.out.println("Overall rounds won : "+win);
					System.out.println();
					System.out.println("Don't lose your hope!!!");
					System.out.println("Do you want to play again: Yes or No");
					sc.nextLine();
					String s = sc.nextLine().toLowerCase();
					if(s.equals("no")) 
					{
						System.out.println();
						System.out.println("Aplause for spending your good time !!!!");
						System.out.println();
						System.out.println("Have a Great day Friend:>");
						break;
					}
					r++;
				}
			}
		
	}

