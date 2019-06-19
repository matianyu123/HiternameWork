package com.hqyj.action;

import java.io.File;

public class PictureAction {
	private File picture;
	private String pictureFileName;
	private String pictureContentType;
	
	private String picUrl;
	public String add(){
		File file = new File("F:\\picfile");//·����tomcat�����õľ���·��
		if(!file.exists()){
			file.mkdir();
		}
		
		//����ͼƬ�����֣�Ҫ��Ψһ
		String newFileName= System.currentTimeMillis() + pictureFileName.substring(pictureFileName.lastIndexOf("."));
		
		//���ϴ�ͼƬ���Ƶ�file��Ӧ��·���£�������pictureFileName
		picture.renameTo(new File(file,newFileName));
		//����tomcat������·������ͼƬ������ǰ̨
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
