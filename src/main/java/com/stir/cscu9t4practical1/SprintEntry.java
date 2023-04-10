package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

	private int repetitions;
	private int recovery;
	
	public SprintEntry (String n, int d, int m, int y, int h, int min, int s, float dist, int rp, int rc) {
	super( n, d, m, y, h, min, s, dist); 
	this.repetitions=rp;
	this.recovery=rc;
	}
	
	public int getrepetitions() {
		return repetitions;
		
	}
	public void setrepetitions(int rp) {
		this.repetitions= rp;
	}  
	
    public int getrecovery() {
		
		return recovery;
}
    public void setrecovery(int rc) {
	    this.recovery= rc;

}  

		 public String getEntry () {
			   String result = getName()+" ran " + getDistance() + " km in "
			             +getHour()+":"+getMin()+":"+ getSec() + " on "
			             +getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getrepetitions()+":"+getrecovery()+"\n";
			   return result;
			  } 
		
	
}

