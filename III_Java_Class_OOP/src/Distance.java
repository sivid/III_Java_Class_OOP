public class Distance {
	int feet = 0;
	int inch = 0;
	Distance(int feet, int inch) throws OverInchException {
		this.feet = feet;
		this.inch = inch;
		if (inch >= 12){
			throw new OverInchException();
		}
	}
	Distance() {
	}
	public int getFeet() {
		return feet;
	}
	public int getInch() {
		return inch;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public void setInch (int inch) throws OverInchException{
		if (inch >= 12){
			throw new OverInchException();
		}
		this.inch = inch;
	}
	
}
