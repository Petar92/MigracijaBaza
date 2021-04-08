package com.sajtovi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "cms_item_1")
@IdClass(ItemId.class)
public class Item {
	
	@Id
	private Integer id;
	
	@Id
	private Integer cid;
	
	@Id
	private String language;
	
	private String text_4;
	

}
