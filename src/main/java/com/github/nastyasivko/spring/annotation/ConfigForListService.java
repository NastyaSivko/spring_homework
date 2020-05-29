package com.github.nastyasivko.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigForListService {
    List<DefaultService> defaultServiceList;

     ConfigForListService() {
    }

    @Autowired
    public ConfigForListService(List<DefaultService> defaultServiceList) {
        this.defaultServiceList = defaultServiceList;
    }

    public void getList() {
        for (int i = 0; i < defaultServiceList.size(); i++) {
            System.out.println((i+1) + ". " + defaultServiceList.get(i));
        }
    }
}
