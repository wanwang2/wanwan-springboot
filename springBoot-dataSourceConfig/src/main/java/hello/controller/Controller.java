package hello.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.bean.TestBean;

@RestController
public class Controller {
	@Autowired
	TestBean bean;

	String name;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public List test() {
		System.out.println("jdbcTemplate:" + this.jdbcTemplate);
		List b = jdbcTemplate.queryForList("select count(*) from b_user where username = 'liubei'");
		System.out.println("b:" + b);
		return b;
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String post() {
		return "post";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "get";
	}
}
