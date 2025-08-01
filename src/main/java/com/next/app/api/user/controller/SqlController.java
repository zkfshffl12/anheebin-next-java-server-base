package com.next.app.api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/sql")
public class SqlController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<Map<String, Object>> getAllUsers() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.queryForList(sql);
    }
} 