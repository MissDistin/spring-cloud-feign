package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author tinko
 * @Description //TODO
 * @Date 2019/4/23 16:13
 **/
@FeignClient(value = "tinko-1",fallback = UserFeignImpl.class)
public interface UserFeign {

    @RequestMapping("/user")
    String user(@RequestParam("name") String name);
}
