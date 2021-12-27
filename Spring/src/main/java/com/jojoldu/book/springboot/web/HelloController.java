package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 일반 컨트롤러를 JSON을 반환하는 컨트롤러로 변경
// 각 메소드마다 선언했던 @ResponseBody를 한번에 사용할 수 있게 해준 데코
@RestController
public class HelloController {

//    HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다. -urls.py = GetMapping
    @GetMapping("/hello")
    public String hello() {
        return "hello_world";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}


