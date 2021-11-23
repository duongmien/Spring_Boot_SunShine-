package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Sanpham;


public interface SanphamInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Sanpham p);
	public int edit(Sanpham p);
	public int delete(int id);
}
