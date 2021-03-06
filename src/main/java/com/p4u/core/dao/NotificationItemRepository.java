package com.p4u.core.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.p4u.core.model.NotificationItem;
import com.p4u.core.model.UserItemId;

public interface NotificationItemRepository extends CrudRepository<NotificationItem, UserItemId>{
	
	public List<NotificationItem> findByUserId(Long userId);

}
