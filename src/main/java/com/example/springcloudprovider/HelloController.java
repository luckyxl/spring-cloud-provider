package com.example.springcloudprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println(name);
        return "hello "+name+"，this is first messge";
    }

    @RequestMapping("/hello2")
    public User index2(@RequestParam String name) {
        System.out.println("hello2");
        User user = new User();
        user.setName(name);
        user.setPassword("123456");
        return user;
    }

    private class User{
        private String name;
        private String password;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
