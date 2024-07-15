package com.aias.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class EncController {
    
    @PostMapping("/encrypt")
    public ResponseEntity<?> encrypt(@RequestBody Map<String, String> map) {
        Map<String, Object> res = new HashMap<>();
        res.put("output", JasyptUtils.encrypt(map.get("password"), map.get("input")));
        return ResponseEntity.ok(res);
    }
    
    @GetMapping("/decrypt")
    public ResponseEntity<?> decrypt(@RequestBody Map<String, String> map) {
        Map<String, Object> res = new HashMap<>();
        res.put("output", JasyptUtils.decrypt(map.get("password"), map.get("input")));
        return ResponseEntity.ok(res);
    }
    
}
