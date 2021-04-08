package com.sajtovi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sajtovi.dto.ItemOneDto;
import com.sajtovi.service.ItemOneService;
import com.sajtovi.service.ItemOneServiceImpl;

public class ApplicationLauncher{
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MigracijaBaza");
		ItemOneService service = new ItemOneServiceImpl(entityManagerFactory);
		List<ItemOneDto> items = new ArrayList<ItemOneDto>();
		items = service.fetchText4();
		
		for (ItemOneDto item : items) {
		    System.out.println("Item: " + item.getText4());
		}
	}
}