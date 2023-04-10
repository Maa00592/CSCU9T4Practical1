package com.stir.cscu9t4practical1;

   public class SwimEntry extends Entry {

   private String where;

   public SwimEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String wr) {

   super( n, d, m, y, h, min, s, dist); 
     this.where=wr;
}

   public String getwhere() {
	
	 return where;	
}
   public void setwhere(String wr) {
     this.where= wr;
}

	 public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getwhere()+ "\n";
		   return result;
		  } 
	

}
