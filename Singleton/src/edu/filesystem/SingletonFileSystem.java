package edu.filesystem;

public class SingletonFileSystem {
	private static String folder;
	private static String file;
	private static SingletonFileSystem  instance = new SingletonFileSystem();
	
	private SingletonFileSystem(){};
	
	public static SingletonFileSystem getInstance(String folder, String file){
		instance.folder = folder;
		instance.file = file;
		return instance;
	}
	
	public void showPath(){
		System.out.println(instance.folder + "\\" + instance.file);
	}
}
