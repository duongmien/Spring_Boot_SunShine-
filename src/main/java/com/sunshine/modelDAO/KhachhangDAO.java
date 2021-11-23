package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.KhachhangInterface;
import com.sunshine.model.Khachhang;
@Repository
public class KhachhangDAO implements KhachhangInterface {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblkhachhang");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblkhachhang where idkh = ?",id);
		return list;
	}

	@Override
	public int add(Khachhang p) {
		String sql = "INSERT INTO `tblkhachhang` ( TenDangNhap, MatKhau,"
				+ " HoVaTen, SDT, GioiTinh, NgaySinh, Email) "
				+ "VALUES (?,?,?,?,?,?,?);";
		return template.update(sql, p.getTendangnhap(), p.getMatkhau(), p.getHovaten(), p.getSdt(), p.getGioitinh(), p.getNgaysinh(), p.getEmail());
	}

	@Override
	public int edit(Khachhang p) {
		String sql="UPDATE tblkhachhang SET TenDangNhap = ?,"
				+ " MatKhau = ?, HoVaTen = ?, SDT = ?, GioiTinh = ?,"
				+ " Email = ? WHERE tblkhachhang.IDKH = ?;";		
		return template.update(sql, p.getTendangnhap(), p.getMatkhau(), p.getHovaten(), p.getSdt(), p.getGioitinh(), p.getEmail(), p.getIdkh());
	}

	@Override
	public int delete(int id) {
		String sql="DELETE from tblkhachhang where idkh=?";
		return template.update(sql,id);
	}

}
