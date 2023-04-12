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

public class Position {
	
	private String positionName;
	private Engineer[] arrayOfEngineers = new Engineer[6];
	private String minRequireEdLevel;
	private int minRequiredEdLevelID;
	private int numEngs = 0;
	
	public Position(String positionName, String minRequireEdLevel) {
		this.positionName = positionName;
		this.minRequireEdLevel = minRequireEdLevel;
		
		if (this.minRequireEdLevel == "BS") {
			this.minRequiredEdLevelID = 1;
		}
		if (this.minRequireEdLevel == "MS") {
			this.minRequiredEdLevelID = 2;
		}
		if (this.minRequireEdLevel == "PHD") {
			this.minRequiredEdLevelID = 3;
		}
	}
	
	public String getPositionName() {
		return positionName;
	}
	
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	public Engineer[] getArrayOfEngineers() {
		return arrayOfEngineers;
	}

	public void setArrayOfEngineers(Engineer[] arrayOfEngineers) {
		this.arrayOfEngineers = arrayOfEngineers;
	}

	public String getMinRequireEdLevel() {
		return minRequireEdLevel;
	}

	public void setMinRequireEdLevel(String minRequireEdLevel) {
		this.minRequireEdLevel = minRequireEdLevel;
	}

	public boolean hireEngineer(Engineer engineer) {
		if (numEngs < 6) {
			if (this.minRequiredEdLevelID <= engineer.getEducationlevelID()) {
				arrayOfEngineers[numEngs] = engineer;
				numEngs++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
}
