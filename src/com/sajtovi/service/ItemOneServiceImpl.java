package com.sajtovi.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.sajtovi.dto.ItemOneDto;

public class ItemOneServiceImpl implements ItemOneService {
	
	private EntityManagerFactory entityManagerFactory = null;
	
	public ItemOneServiceImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public List<ItemOneDto> fetchText4() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<ItemOneDto> query = entityManager.createQuery(
		        "SELECT DISTINCT new com.sajtovi.dto.ItemOneDto(text_4) FROM cms_item_1",
		        ItemOneDto.class);
		//query.setParameter("text_4", query);
		List<ItemOneDto> items = query.getResultList();
		
		return items;
	}

}
