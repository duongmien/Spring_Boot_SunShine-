package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Chitiethoadon;


public interface ChitiethoadonInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Chitiethoadon p);
	public int edit(Chitiethoadon p);
	public int delete(int id);
}
