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

package Company;

import Company.Position;
import Company.Company;
import java.security.*;
import java.util.Random;

public class Engineer {

	private String name;
	private String id;
	private String eductaionLevel;
	private int educationlevelID;
	
	public Engineer(String name, String id, String eductaionLevel) {
		this.name = name;
		this.id = id;
		this.eductaionLevel = eductaionLevel;
		
		if (this.eductaionLevel == "BS") {
			this.educationlevelID = 1;
		}
		if (this.eductaionLevel == "MS") {
			this.educationlevelID = 2;
		}
		if (this.eductaionLevel == "PHD") {
			this.educationlevelID = 3;
		}
	
	}
	
//	public void levelID() {
//		if (this.eductaionLevel == "BS") {
//			this.educationlevelID = 1;
//		}
//		if (this.eductaionLevel == "MS") {
//			this.educationlevelID = 2;
//		}
//		if (this.eductaionLevel == "PHD") {
//			this.educationlevelID = 3;
//		}	
//		
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEductaionLevel() {
		return eductaionLevel;
	}

	public void setEductaionLevel(String eductaionLevel) {
		this.eductaionLevel = eductaionLevel;
	}

	public int getEducationlevelID() {
		return educationlevelID;
	}

	public void setEducationlevelID(int educationlevelID) {
		this.educationlevelID = educationlevelID;
	}

	public void updateLevel() {
		if (this.eductaionLevel == "BS") {
			this.setEductaionLevel("MS") ;
		}
		
		if (this.eductaionLevel == "MS") {
			this.setEductaionLevel("PHD");
		}
		
	}
	
	public void updateLevel(String toLevel) {
		int newToLevel = 0;
		if (toLevel == "BS") {
			newToLevel = 1;
		}
		if (toLevel == "MS") {
			newToLevel = 2;
		}
		if (toLevel == "PHD") {
			newToLevel = 3;
		}
		
		if (newToLevel > this.educationlevelID) {
			this.setEductaionLevel(toLevel);
		}
		
	}

	
	public Position applyToAJobRandomly(Position[] givenarray) {
		
		SecureRandom randomPosition = new SecureRandom();
		
		Random generator = new Random();
		int randomIndex = generator.nextInt(givenarray.length);
		return givenarray[randomIndex];		
	}
		
}
