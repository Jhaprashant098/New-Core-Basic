package Core.sorting;

public class Marksheet implements Comparable<Marksheet>  {
	private String rollNo;
	private String Fname;
	private String Lname;
	private int phy;
	private int Che;
	private int mat;
	
public Marksheet() {
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return Che;
	}
	public void setChe(int che) {
		Che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public int compareTo(Marksheet m) {
		
		return this.rollNo.compareTo(m.rollNo);
	}
	public String toString() {
		return rollNo+" , "+ Fname+ " , "+ Lname+","+phy+","+Che+","+mat;
	}
	
	} 
	

