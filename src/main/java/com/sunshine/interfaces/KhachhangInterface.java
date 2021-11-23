package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Khachhang;


public interface KhachhangInterface {

	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Khachhang p);
	public int edit(Khachhang p);
	public int delete(int id);

}
