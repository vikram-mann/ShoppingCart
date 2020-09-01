package com.app.shopping.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image {
	
	@Id
	private Integer img_id;
    private String img_name;
    private Integer img_size;
    private String img_type;
    private String img_url;
	public Integer getImg_id() {
		return img_id;
	}
	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}
	public String getImg_name() {
		return img_name;
	}
	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}
	public Integer getImg_size() {
		return img_size;
	}
	public void setImg_size(Integer img_size) {
		this.img_size = img_size;
	}
	public String getImg_type() {
		return img_type;
	}
	public void setImg_type(String img_type) {
		this.img_type = img_type;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
    
    

}
