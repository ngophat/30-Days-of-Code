package Day14_Scope;

public class Difference {
	private int[] elements;
  	public int maximumDifference;
	
	public Difference(int[] elements){
        this.elements = elements;
    }

    public void computeDifference(){
    	maximumDifference = Math.abs(elements[0]-elements[1]);
        for(int i=0;i<elements.length-1;i++) {
        	for(int j=i+1;j<elements.length;j++) {
        		if(Math.abs(elements[i]-elements[j])>maximumDifference){
                    maximumDifference = Math.abs(elements[i]-elements[j]);
                }
        	}
        }    
    }
}
