package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Danhmuc;


public interface DanhmucInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Danhmuc p);
	public int edit(Danhmuc p);
	public int delete(int id);
}
