package com.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	@GetMapping("main")
	public String main() {
		log.info("Main controller");
		return "main";
	}

	@GetMapping("board/newBoard")
    public String writeBoard(){
        return "board/newBoard";
    }

	@GetMapping("member/memberEdit")
    public String memberEdit(){
        return "member/memberEdit";
    }

	@GetMapping("member/myBoard")
    public String myBoard(){
        return "member/myBoard";
    }

	@GetMapping("board/example3")
    public String example3(){
        return "board/example3";
    }

	@GetMapping("board/example2")
    public String example2(){
        return "board/example2";
    }

	@GetMapping("board/example1")
    public String board() {
        return "board/example1";
    }

	@GetMapping("member/edit3")
    public String edit3(){
        return "member/edit3";
    }

	@GetMapping("member/edit2")
    public String edit2(){
        return "member/edit2";
    }
}