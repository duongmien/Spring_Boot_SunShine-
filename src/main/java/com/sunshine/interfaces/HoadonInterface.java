package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Hoadon;

public interface HoadonInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public List<Map<String, Object>>listNewest();
	public int add(Hoadon p);
	public int edit(Hoadon p);
	public int delete(int id);
}
