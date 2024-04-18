package com.itwillbs.test_lsy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/BoardList")
	public String boardList() {
		return "board_list"; // 디스패치
//		return "redirect:/BoardList2"; // 리다이렉트
	}
}
