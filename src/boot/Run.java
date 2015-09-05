package boot;

import java.io.IOException;
import java.lang.management.ManagementPermission;

import workers.Designer;
import workers.Manager;
import workers.Programmer;
import workers.Worker;

public class Run {

	public static void main(String[] args) {

		int numOfWorkers = 0;
		int choice = 0;
		char iChar;
		char choiceChar;
		char nChar;
		
		
		System.out.println("How many workers?");
		try {
			iChar = (char) System.in.read();
			numOfWorkers=Character.getNumericValue(iChar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Worker[] workers=new Worker[numOfWorkers];
		
		for (int i=0; i<workers.length; i++){
			System.out.println("Enter 1 for Programmer,"
					+ "2 for Designer"
					+ "and 3 for Manager");
			
			try {
				nChar=(char) System.in.read();
				nChar=(char) System.in.read();
				choiceChar = (char) System.in.read();
				choice=Character.getNumericValue(choiceChar);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			if (choice==1)
				workers[i]=new Programmer();
			else if (choice==2)
					workers[i]=new Designer();
			else
					workers[i]=new Manager();
			
		}
		
		for (Worker w : workers){
			w.work();
		}
			
	
		
	
	}
}
