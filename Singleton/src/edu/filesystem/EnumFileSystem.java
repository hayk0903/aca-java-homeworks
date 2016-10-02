package edu.filesystem;

public enum EnumFileSystem {
	INSTANCE;
	
	private String folder;
	private String file;
	
	void setPath(String folder, String file){
		this.folder = folder;
		this.file = file;
	}
	
	public void showPath(){
		System.out.println(this.folder + "\\" + this.file);
	}
}
