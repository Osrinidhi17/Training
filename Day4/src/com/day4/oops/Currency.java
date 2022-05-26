package com.day4.oops;

public enum Currency {
    //obj creation
	PENNY(1),NICKLE(5),DIME(10),QUARTER(25);
	
	private int value;
	
	private Currency(int value) {
      this.value=value;
   }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	@Override 
	public String toString() {
		String result = null;
		switch(this) {
		case QUARTER:
			result = "4th Biggest coin : QUARTER :" +getValue();
			break;
		case DIME:
			result = "3th Biggest coin : DIME :" +getValue();
			break;
		case NICKLE:
			result = "2th Biggest coin : NICKLE :" +getValue();
			break;
		case PENNY:
			result = "Smallest Biggest coin : PENNY:" +getValue();
			break;
			
			default:
				break;
		}
		return result; 
	}
}
