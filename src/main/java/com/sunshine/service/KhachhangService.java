package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.KhachhangInterface;
import com.sunshine.model.Khachhang;
import com.sunshine.modelDAO.KhachhangDAO;

@Service
public class KhachhangService implements KhachhangInterface {
	@Autowired
	KhachhangDAO dao;

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
	public int add(Khachhang p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Khachhang p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
}
