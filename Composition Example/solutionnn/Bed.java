package compExercise;

public class Bed {
	
	//Style, pillows, height,  sheets, quilt.
	private String style;
	private int pillows;
	private int height;
	private int sheets;
	private int quilts;
	
	public Bed(String style, int pillows, int height
			, int sheets, int quilts) {
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilts = quilts;
	}
	public void make(){
		System.out.println("Bed -> Making");
	}
	

}
