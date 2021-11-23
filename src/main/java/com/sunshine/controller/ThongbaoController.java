package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Thongbao;
import com.sunshine.service.ThongbaoService;

@RestController
@RequestMapping("/thongbao")
public class ThongbaoController {
	@Autowired
	private ThongbaoService service;
	@GetMapping("/list")
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}
	@GetMapping("/list/{id}")
	public List<Map<String, Object>> listId(@PathVariable int id, Model model) {

		return service.listId(id);
	}

	@PostMapping("/add")
	public String save(@RequestBody Thongbao p, Model model) {
		int id = service.add(p);
		if (id == 0) {
			return "Them that bai!!!";
		}
		return "Them thanh cong!!!";
	}

	@PostMapping("/update/{id}")
	public String save(@RequestBody Thongbao p, @PathVariable int id, Model model) {
		p.setIdtb(id);
		int r = service.edit(p);
		if (r == 0) {
			return "Cap nhat that bai!!!";
		}
		return "Cap nhat thanh cong!!!";
	}
	
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		int r = service.delete(id);
		if (r == 0) {
			return "Xoa that bai!!!";
		}
		return "Xoa thanh cong!!!";
	}
}
