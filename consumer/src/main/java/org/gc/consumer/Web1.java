package org.gc.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IService;

@RestController
public class Web1 {

    @DubboReference
    IService iService;

    @GetMapping(value = "/test")
    public String test() {
        return iService.test();
    }
}
