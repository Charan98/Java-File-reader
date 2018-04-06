import java.io.*;
import java.util.*;

class Readfile 
{
	
	public void readFile() throws FileNotFoundException
	{
		Scanner x;
		Scanner y;
		Scanner z;
		Scanner w;
		Scanner SC = new Scanner(System.in);
		int ch,id;
		boolean t;
		t=true;
		
		
		while(true)
		{
			System.out.println("Enter your option");
			System.out.println("1.Fee reciept 2.Due Report 3.FullReciept 4.Fine 5.Exit");
			ch = SC.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter ID of student:");
						id = SC.nextInt();
						int count = 0;
						x = new Scanner(new File("Data.txt"));
						while(true)
						{
							String ID = x.next();
							String Name = x.next();
							String Dept = x.next();
							String Fullfee = x.next();
							String Date1 = x.next();
							String Inst1 = x.next();
							String Date2 = x.next();
							String Inst2 = x.next();
							String Date3 = x.next();
							String Inst3 = x.next();
							String Date4 = x.next();
							String Inst4 = x.next();
							String Balence = x.next();
							String Fine = x.next();
							if(count==id)
							{
								System.out.printf("%s %s %s %s\n",ID,Name,Date2,Inst2);
								break;
							}
							else
								count++;
						}
						break;
				case 2:System.out.println("Enter ID of student to print Dues:");
						id = SC.nextInt();
						int count2 = 0;
						y = new Scanner(new File("Data.txt"));
						while(true)
						{
							String ID = y.next();
							String Name = y.next();
							String Dept = y.next();
							String Fullfee = y.next();
							String Date1 = y.next();
							String Inst1 = y.next();
							String Date2 = y.next();
							String Inst2 = y.next();
							String Date3 = y.next();
							String Inst3 = y.next();
							String Date4 = y.next();
							String Inst4 = y.next();
							String Balence = y.next();
							String Fine = y.next();
							if(count2==id)
							{
								System.out.printf("%s %s %s\n",ID,Name,Balence);
								break;
							}
							else
								count2++;
						}
						break;
				case 3:System.out.println("Enter ID of student to print full fee report:");
						id = SC.nextInt();
						int count3 = 0;
						z = new Scanner(new File("Data.txt"));
						while(true)
						{
							String ID = z.next();
							String Name = z.next();
							String Dept = z.next();
							String Fullfee = z.next();
							String Date1 = z.next();
							String Inst1 = z.next();
							String Date2 = z.next();
							String Inst2 = z.next();
							String Date3 = z.next();
							String Inst3 = z.next();
							String Date4 = z.next();
							String Inst4 = z.next();
							String Balence = z.next();
							String Fine = z.next();
							if(count3==id)
							{
								System.out.printf("%s %s %s %s %s %s",ID,Name,Dept,Fullfee,Date1,Inst1);
								System.out.printf(" %s %s %s %s %s %s %s %s\n",Date2,Inst2,Date3,Inst3,Date4,Inst4,Balence,Fine);
								break;
							}
							else
								count3++;
						}
						break;
				case 4:System.out.println("Enter id of student to print fine report:");
						id = SC.nextInt();
						int count4 = 0;
						w = new Scanner(new File("Data.txt"));
						while(true)
						{
							String ID = w.next();
							String Name = w.next();
							String Dept = w.next();
							String Fullfee = w.next();
							String Date1 = w.next();
							String Inst1 = w.next();
							String Date2 = w.next();
							String Inst2 = w.next();
							String Date3 = w.next();
							String Inst3 = w.next();
							String Date4 = w.next();
							String Inst4 = w.next();
							String Balence = w.next();
							String Fine = w.next();
							if(count4==id)
							{
								System.out.printf("%s %s %s\n",ID,Name,Fine);
								break;
							}
							else
								count4++;
						}
						break;
					case 5:System.exit(0);
						  
							break;
			}
		}
	}
}

public class Fee
{
	public static void main(String args[])
	{
		Readfile ob = new Readfile();
		try
		{
			ob.readFile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}
}
