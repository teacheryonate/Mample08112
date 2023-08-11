package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping({"", "/"})
	public ResponseEntity<?> main(){
		Map<String, Object> map = new HashMap<>();
		map.put("test", "444");
		
		return ResponseEntity.ok(map);
	}

}
