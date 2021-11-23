package com.sunshine.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.interfaces.SanphamyeuthichInterface;
import com.sunshine.model.Sanphamyeuthich;
import com.sunshine.modelDAO.SanphamyeuthichDAO;

@Service
public class SanphamyeuthichService implements SanphamyeuthichInterface{
	@Autowired
	SanphamyeuthichDAO dao;

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
	public int add(Sanphamyeuthich p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Sanphamyeuthich p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int idkh, int idsp) {
		// TODO Auto-generated method stub
		return dao.delete( idkh,  idsp);
	}
}
