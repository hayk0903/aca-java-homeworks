package edu.filesystem;

public class Runner {

	public static void main(String[] args) {
		
		SingletonFileSystem fileSystem1 = SingletonFileSystem.getInstance("C:", "file.doc");
		fileSystem1.showPath();
		
		EnumFileSystem fileSystem2 = EnumFileSystem.INSTANCE;
		fileSystem2.setPath("D:", "file.docx");
		fileSystem2.showPath();
	}

}
