package aca.blogbuilder;



public class BlogRunner {

	public static void main(String[] args) {
		Blog blog = new Blog.BlogBuilder().init().addHeader().addFooter().addRightPane().addLeftPane().
				addMidSection(2).construct();
		
		System.out.println(blog);
		
		

	}

}
