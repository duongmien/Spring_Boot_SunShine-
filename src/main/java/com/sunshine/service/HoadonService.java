package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.HoadonInterface;
import com.sunshine.model.Hoadon;
import com.sunshine.modelDAO.HoadonDAO;
@Service
public class HoadonService implements HoadonInterface{
	@Autowired
	HoadonDAO dao;

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
	public int add(Hoadon p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Hoadon p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<Map<String, Object>> listNewest() {
		// TODO Auto-generated method stub
		return dao.listNewest();
	}
}
