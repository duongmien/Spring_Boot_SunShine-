package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Diachi;

public interface DiachiInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Diachi p);
	public int edit(Diachi p);
	public int delete(int id);
}
