package com.pringboot.word.common.controller;


import com.pringboot.word.common.utils.WordUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @GetMapping("export")
    public void export(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> params = new HashMap<>();
        params.put("title","广州小蛮腰");
        params.put("name","高楼大厦");
        WordUtil.exportWord("word/export.docx","D:/test","aaa.docx",params,request,response);
    }
}
