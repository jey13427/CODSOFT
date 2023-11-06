package Grade_Calculator;
import java.util.Scanner;
public class Grade_calculator {

	public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number of Subjects: ");
				int num = sc.nextInt();
				int total = 0;
				System.out.println();
				System.out.println("Enter the marks out of 100 ");
				for(int i=1;i<=num;i++)
				{
					System.out.println("Enter marks for the Subject "+(i));
					total += sc.nextInt();
					System.out.println();
				}
				int per = total/num;
				String grade;
				if(per>=90 && per<=100) grade = "O -> (perfect)";
				else if(per>=80 && per<90) grade = "A+ -> (Excellent)";
				else if(per>=70 && per<80) grade = "A -> (Good)";
				else if(per>=60 && per<70) grade = "B+ -> (Average)";
				else if(per>=50 && per<60) grade = "B -> (Below Average)";
				else grade = "F -> Fail";
				System.out.println("Total Marks Out of "+(num*100)+" : "+total);
				System.out.println("Average Percentage(%)  : "+per+"%");
				System.out.println("Total Grade Obtained  : "+grade);
			}
		}
	


