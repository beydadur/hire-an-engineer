// Please include your Pledge of Honor here.
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Beyda Dur, 75881>
********************************************************************************/

// Import the necessary classes.

import Company.Company;
import Company.Engineer;
import Company.Position;

public class TestCompany {

	public static void main(String[] args) {
		
		// define engineer objects
		Engineer m1 = new Engineer("John", "38899", "PHD");
		Engineer m2 = new Engineer("Mary", "03121", "PHD");
		Engineer m3 = new Engineer("Dennis", "06569", "PHD");
		Engineer m4 = new Engineer("Cate", "08953", "MS");
		Engineer m5 = new Engineer("Phoebe", "04956", "MS");
		Engineer m6 = new Engineer("Andrew", "93201", "BS");
		Engineer m7 = new Engineer("Carey", "05786", "PHD");
		
//		System.out.println("engineer variables: m1 " + m1.getName() + " m2 " +  m2 + 
//		" m3 " + m3 + " m4 " + m4 + " m5 " + m5 + " m6 " + m6);
		
		// update education levels for some engineers
		
//		m4.updateLevel();
		
		m1.updateLevel();
		m6.updateLevel("PHD");

//		System.out.println("updated engineer variables: m4 " + 
//		m4.getEductaionLevel() + " m6 " + m6.getEductaionLevel());

		// define company objects
		Company meta = new Company("Meta");
		Company telegram = new Company("Telegram");
		Company twitter = new Company("Twitter");

		// set positions for companies
		meta.openPosition("Graphic Designer", "BS");
		telegram.openPosition("Manager", "MS");
		twitter.openPosition("Research Engineer", "PHD");

		// hire engineers to given positions
		meta.hireEngineer("Graphic Designer", m1);
		meta.hireEngineer("Manager", m2);
		meta.hireEngineer("Graphic Designer", m3);
		meta.hireEngineer("Manager", m4);
		meta.hireEngineer("Graphic Designer", m5);

		telegram.hireEngineer("Manager", m2);
		telegram.hireEngineer("Manager", m4);
		telegram.hireEngineer("Manager", m6);

		twitter.hireEngineer("Research Engineer", m1);
		twitter.hireEngineer("Research Engineer", m2);
		twitter.hireEngineer("Research Engineer", m3);
		twitter.hireEngineer("Research Engineer", m4);
		twitter.hireEngineer("Research Engineer", m5);
		twitter.hireEngineer("Research Engineer", m6);
		twitter.hireEngineer("Research Engineer", m7);

		// print company info
		System.out.println(meta);
		System.out.println(telegram);
		System.out.println(twitter);
		
	////// IN-LAB TEST CODE ////////
		Company[] companies = new Company[3];
		companies[0] = meta;
		companies[1] = telegram;
		companies[2] = twitter;
		checkMultipleHirings(companies);
		telegram.openPosition("Software Engineer", "BS");
		telegram.openPosition("Data Scientist", "BS");
		telegram.openPosition("System Administrator", "BS");
//		m4.applyToAJobRandomly(telegram.getPositions());
		System.out.println("\n\n");
		System.out.println(telegram);
//
	}
	
//	private Company[] arrayOfCompany;
	
	public static void checkMultipleHirings (Company[] arrayOfCompany) {
		for (int i = 0; i < arrayOfCompany.length; i++) {
			for (int j = 0; j < arrayOfCompany[i].getArrayOfPositions().length ; j++) {
				for (int k = 0; k < arrayOfCompany[i].getArrayOfPositions()[j].getArrayOfEngineers().length ; k++) {
					arrayOfCompany[i].getArrayOfPositions()[j].getArrayOfEngineers()[k].getName();
					int engnum = 0;
					engnum++;
					if (engnum > 1) {
						System.out.println("Engineer " + arrayOfCompany[i].getArrayOfPositions()[j].getArrayOfEngineers()[k].getName()
								+ " is hired by multiple times." );
					}
						else {
							System.out.println("Engineer " + arrayOfCompany[i].getArrayOfPositions()[j].getArrayOfEngineers()[k].getName()
									+ " is not hired by multiple times." );
						}
				}
			}
		}
	}
}
