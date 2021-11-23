package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.DiachiInterface;
import com.sunshine.model.Diachi;
import com.sunshine.modelDAO.DiachiDAO;

@Service
public class DiachiService implements DiachiInterface{
	@Autowired
	DiachiDAO dao;

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

	@Override
	public int add(Diachi p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Diachi p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
}
