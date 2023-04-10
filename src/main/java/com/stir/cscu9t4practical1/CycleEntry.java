package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
	
	private String terrain;
	private String tempo;
	
	public CycleEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String te, String tm) {
	super( n, d, m, y, h, min, s, dist); 
	this.terrain=te;
	this.tempo=tm;
	}
	
	public String getterrain() {
		return terrain;
	}
	
    public void setTerrain(String te) {
		this.tempo= te; 
        } 

    public String getTempo () {
    	 return tempo;
    } 
    public void setTempo(String tm) {
    	this.tempo= tm;
    	
    } 
  
    public String getEntry () {
			   String result = getName()+" ran " + getDistance() + " km in "
			             +getHour()+":"+getMin()+":"+ getSec() + " on "
			             +getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getterrain()+":"+getTempo()+"\n";
			   return result;
			  } 
		
	
}
