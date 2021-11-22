
public class Moves {
	
	private int powerPoint; // powerpoint of the attack
	private String type; // type of the attack
	private String name; // name of the attack
	
// default constructor
 public Moves(int pw, String typ, String nm) {
          		 
	 powerPoint = pw;
	 type = typ;
	 name = nm;
	 }

// seter and getter the powerpoint
public int getPowerPoint() {
	return powerPoint;
}


public void setPowerPoint(int powerPoint) {
	this.powerPoint = powerPoint;
}

// setter and getter of type
public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}

// setter and getter of name
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
	
public String toString(){
	// builds the string to print the output
	String s = "";
     s = name ;
	
	
	return s;
}

	
	
	

}
