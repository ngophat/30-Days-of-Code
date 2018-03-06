package Day12_Inheritance;

public class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);	
		this.testScores = testScores;
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
		char c='c';
		int iSum=0;
		for(int a:testScores) {
			iSum= iSum +a;
		}
		int iAverage = iSum/(testScores.length);
		if(iAverage<=100 && iAverage>=90) {
			c='O';
		}else if(iAverage>=80) {
			c='E';
		}else if(iAverage>=70) {
			c='A';
		}else if(iAverage>=55) {
			c='P';
		}else if(iAverage>=40) {
			c='D';
		}else {
			c='T';
		}
		return c;
	}
}
