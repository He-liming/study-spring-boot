package com.xiaoming.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    // 跳转到登录页面，这里我们已经使用了WebMvcConfigurer中得视图解析器进行映射
    /*@RequestMapping({"/login", "/"})
    public String index() {
        return "login";
    }*/

    /**
     * 校验登录用户
     *
     * @param username
     * @param password
     * @param httpSession
     * @param map
     * @return
     */
    @PostMapping("/user/login")
    public String checkUser(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession, Map<String, Object> map) {
        if (!StringUtils.isEmpty(username) && "xm".equals(password)) {
            // 用户名密码校验成功，我们将用户名添加到session中,用来判断用户是否登录
            httpSession.setAttribute("loginUser", username);
            // 校验成功则跳转到系统主页面，为了防止表单重复提交，我们进行重定向，在视图解析器里面配置映射
            return "redirect:/main.html";
        } else {
            // 反之则返回登录页面，并提示错误信息
            map.put("msg", "用户名或密码错误！");
            return "login";
        }
    }
}
