package com.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	@GetMapping("/main/main")
	public String main() {
		log.info("Main controller");
		return "main/main";
	}

	@GetMapping("board/example1")
    public String edit() {
        return "board/example1";
    }
}