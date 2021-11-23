package com.sunshine.interfaces;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Thongbao;

public interface ThongbaoInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listId(int id);
	public int add(Thongbao p);
	public int edit(Thongbao p);
	public int delete(int id);
}
