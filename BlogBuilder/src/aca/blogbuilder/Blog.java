package aca.blogbuilder;

import java.util.ArrayList;
import java.util.List;


public class Blog {
	private Section header;
	private Section footer;
	private Section leftPane;
	private Section rightPane;
	private List<Section> midSection;
	
	public Blog(){};

	private void setHeader(Section header) {
		this.header = header;
	}

	public void setFooter(Section footer) {
		this.footer = footer;
	}

	public void setLeftPane(Section leftPane) {
		this.leftPane = leftPane;
	}

	public void setRightPane(Section rightPane) {
		this.rightPane = rightPane;
	}

	public void setMidSection(List<Section> midSection) {
		this.midSection = midSection;
	}

	public Section getHeader() {
		return header;
	}

	public Section getFooter() {
		return footer;
	}

	public Section getLeftPane() {
		return leftPane;
	}

	public Section getRightPane() {
		return rightPane;
	}

	public List<Section> getMidSection() {
		return midSection;
	}

	@Override
	public String toString() {
		return "Blog [header=" + header + ", footer=" + footer + ", leftPane=" + leftPane + ", rightPane=" + rightPane
				+ ", midSection=" + midSection + "]";
	}
	
	static interface Builder {
		
		Builder init();
		Builder addHeader();
		Builder addFooter();
		Builder addLeftPane();
		Builder addRightPane();
		Builder addMidSection(int num);
		Blog construct();

	}
	
	public static class BlogBuilder implements Builder {
		private Blog blog;

		@Override
		public BlogBuilder init() {
			blog = new Blog();
			return this;
			
		}

		@Override
		public Builder addHeader() {
			this.blog.setHeader(new Section("Header"));
			return this;
		}

		@Override
		public Builder addFooter() {
			this.blog.setFooter(new Section("Footer"));
			return this;
			
		}

		@Override
		public Builder addLeftPane() {
			this.blog.setLeftPane(new Section("Left pane"));
			return this;
			
		}

		@Override
		public Builder addRightPane() {
			this.blog.setRightPane(new Section("Right pane"));
			return this;
			
		}

		@Override
		public Builder addMidSection(int num) {
			List<Section> midSection = new ArrayList<>();
			for(int i = 1; i <= num; i++){
				Section section = new Section("Middle section: " + i);
				midSection.add(section);
			}
			this.blog.setMidSection(midSection);
			return this;
			
		}

		@Override
		public Blog construct() {
			if(blog.getHeader() == null || blog.getFooter() == null || blog.getLeftPane() == null ||
					blog.getRightPane() == null || blog.getMidSection() == null) {
				//throw new RuntimeException("The blog does not contain all sections");
			}
			return this.blog;
		}

		

	}
	
	public static class BlogeDirector{
		public static Blog buildBlog(BlogBuilder builder){
			return builder.init().addHeader().addFooter().addLeftPane().
					addRightPane().addMidSection(1).construct();
			
		}
	}
	
}
