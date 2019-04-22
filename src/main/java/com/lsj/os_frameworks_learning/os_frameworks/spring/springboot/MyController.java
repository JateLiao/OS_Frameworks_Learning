package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: ${FILE_NAME}
 * @Company: com.lsj
 * @Package com.lsj.os_frameworks_learning.os_frameworks.spring.springboot
 * @Description: ${TODO}
 * @Author liao
 * @Createtine 2019/4/2222:25
 */
@Controller
//@EnableAutoConfiguration
public class MyController {
    @Value("${config.name}")
    private String name;

    @RequestMapping(path = {"/liaoshijie/me"})
    @ResponseBody
    public String me() {
        return "请叫我廖大爷:::" + this.getName();
    }
    
    
    /**
     * 获取字段值： name.
     *
     * @return 返回字段值： name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * 设置字段值： name.
     *
     * @param name 要设置的字段：name .
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
