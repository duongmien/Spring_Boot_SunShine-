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

import com.sunshine.model.Chitiethoadon;
import com.sunshine.service.ChitiethoadonService;


@RestController
@RequestMapping("/chitiethoadon")
public class ChitiethoadonController {
	@Autowired
	private ChitiethoadonService service;
	
	
	@GetMapping("/list")
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}
	@GetMapping("/list/{id}")
	public List<Map<String, Object>> listId(@PathVariable int id, Model model) {

		return service.listId(id);
	}

	@PostMapping("/add")
	public String save(@RequestBody Chitiethoadon p, Model model) {
		int id = service.add(p);
		if (id == 0) {
			return "Them that bai!!!";
		}
		return "Them thanh cong!!!";
	}

}
