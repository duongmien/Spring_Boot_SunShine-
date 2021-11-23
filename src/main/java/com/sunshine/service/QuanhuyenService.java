package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.QuanhuyenInterface;
import com.sunshine.modelDAO.QuanhuyenDAO;

@Service
public class QuanhuyenService implements QuanhuyenInterface{
	@Autowired
	QuanhuyenDAO dao;
	@Override
	public List<Map<String, Object>> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		// TODO Auto-generated method stub
		return dao.listId(id);
	}

}
