package entities;

public class Student {
	
	public double note1;
	public double note2;
	public double note3;
	public double finalGrade;
	public String statuString;
	public String missingPoint;
	
	public void notesGrade() {
		
		this.finalGrade = note1 + note2 + note3;		
		this.statuString = (this.finalGrade >= 60.00) ? "PASS"  : "FAILED";		
		this.missingPoint = (this.statuString == "FAILED") ? "\nMISSING " + (60.00 - this.finalGrade) + " POINTS" : "" ;
			
		}	
	
	public String toString() {
		notesGrade();
		return "Final Grade = "
				+ String.format("%.2f", this.finalGrade)
				+ "\nStatus = "
				+ this.statuString
				+ String.format("%.2f",this.missingPoint); 	
	}

}
