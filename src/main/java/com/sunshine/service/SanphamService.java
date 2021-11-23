package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.SanphamInterface;
import com.sunshine.model.Sanpham;
import com.sunshine.modelDAO.SanphamDAO;
@Service
public class SanphamService implements SanphamInterface{
	@Autowired
	SanphamDAO dao;
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
	public int add(Sanpham p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Sanpham p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
