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
import Company.Engineer;

public class Company {
	
	private String nameCompany;
	private Position[] arrayOfPositions = new Position[5];
	private int numPositions = 0;
	
	public Company(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public Position[] getArrayOfPositions() {
		return arrayOfPositions;
	}

	public void setArrayOfPositions(Position[] arrayOfPositions) {
		this.arrayOfPositions = arrayOfPositions;
	}

	public void openPosition(String positionName, String minEducationLevel) {
		Position newPosition = new Position(positionName, minEducationLevel);
		if (numPositions < 5) {
			arrayOfPositions[numPositions] = newPosition;
			numPositions++;
		}
	}
	
	public boolean hireEngineer(String positionName, Engineer engineer) {
		for (int i = 0; i < arrayOfPositions.length; i++) {
//			if (arrayOfPositions[i].getPositionName() == positionName && arrayOfPositions[i] != null) {
			if (arrayOfPositions[i] != null) {
				if (arrayOfPositions[i].getPositionName() == positionName) {
				arrayOfPositions[i].hireEngineer(engineer);
				return true;
				}
			}
		}
		return false;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < arrayOfPositions.length; i++) {
			if (arrayOfPositions[i] != null) {
			str += "Position Name: " + arrayOfPositions[i].getPositionName() + "\n";
			for (int j = 0; j < arrayOfPositions[i].getArrayOfEngineers().length; j++) {
				if (arrayOfPositions[i].getArrayOfEngineers()[j] != null) {
				str += "Company Name: " + this.nameCompany + "\n";
				str += "Minimum Educational Level: " + arrayOfPositions[i].getMinRequireEdLevel() + "\n";
				str += "Hired Engineers: \n" + arrayOfPositions[i].getArrayOfEngineers()[j].getId();
				str += arrayOfPositions[i].getArrayOfEngineers()[j].getName() + "\n";

				}
			}
			}
		}

		return str;
	}
}
