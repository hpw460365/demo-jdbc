package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    private JdbcTemplate template;

    /**
     * add
     */
    @GetMapping
    public List<Map<String, Object>> add(){
        String sql = "select * from user";
        List<Map<String, Object>> list_maps = template.queryForList(sql);
        return list_maps;
    }

}
