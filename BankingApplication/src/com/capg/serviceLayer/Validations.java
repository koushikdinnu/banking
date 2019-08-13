package com.capg.serviceLayer;

public class Validations {

	public Boolean validateName(String name) {
		String p="[A-Z][a-z]*";
		
		if(name.matches(p))
		{
			return true;
		}
		// TODO Auto-generated method stub
		else return false;
	}

	public boolean validateMobileNumber(String mobNum) {
		// TODO Auto-generated method stub
		String p="[9|8|7|6][0-9]{9}";
				if(mobNum.matches(p))
				{
					return true;
				}
		return false;
	}

	public boolean validatePin(int pin) {
		// TODO Auto-generated method stub
		int count = 0;
		 while(pin != 0)
		    {
		       
		        pin/= 10;
		        ++count;
		    }
		if(count==4)
		{
		return true;
		}
		else return false;
	}

}
