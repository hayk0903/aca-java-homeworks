package aca.blogbuilder;

public class Section {
	private String sectionName;
	
	
	public Section(){}
	
	public Section(String sectionName) {
		this.sectionName = sectionName;
	}
	

	@Override
	public String toString() {
		return "Section [sectionName=" + sectionName + "]";
	}
	
	
}
