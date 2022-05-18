package service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class Service1 implements IService{

    @Override
    public String test() {
        return "success";
    }
}
