package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.ChitiethoadonInterface;
import com.sunshine.model.Chitiethoadon;
import com.sunshine.modelDAO.ChitiethoadonDAO;
@Service
public class ChitiethoadonService implements ChitiethoadonInterface{
	@Autowired
	ChitiethoadonDAO dao;
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
	public int add(Chitiethoadon p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Chitiethoadon p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
