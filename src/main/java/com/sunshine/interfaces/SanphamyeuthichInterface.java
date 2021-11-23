package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Sanphamyeuthich;

public interface SanphamyeuthichInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Sanphamyeuthich p);
	public int edit(Sanphamyeuthich p);
	public int delete(int idkh, int idsp);
}
