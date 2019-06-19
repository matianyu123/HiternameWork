package com.hqyj.action;

import java.io.File;

public class PictureAction {
	private File picture;
	private String pictureFileName;
	private String pictureContentType;
	
	private String picUrl;
	public String add(){
		File file = new File("F:\\picfile");//路径是tomcat中配置的绝对路径
		if(!file.exists()){
			file.mkdir();
		}
		
		//生成图片的名字，要求唯一
		String newFileName= System.currentTimeMillis() + pictureFileName.substring(pictureFileName.lastIndexOf("."));
		
		//将上传图片复制到file对应的路径下，名字是pictureFileName
		picture.renameTo(new File(file,newFileName));
		//根据tomcat的虚拟路径访问图片，传给前台
		picUrl="/pic/"+newFileName;
		return "showPic";
	}

	public File getPicture() {
		return picture;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	public String getPictureFileName() {
		return pictureFileName;
	}

	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	public String getPictureContentType() {
		return pictureContentType;
	}

	public void setPictureContentType(String pictureContentType) {
		this.pictureContentType = pictureContentType;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
}
