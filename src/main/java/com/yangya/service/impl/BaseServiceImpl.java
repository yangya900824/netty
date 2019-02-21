package com.yangya.service.impl;

import org.springframework.stereotype.Service;

import com.yangya.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {
    @Override
    public void test() {
        System.out.println("调用service服务");
    }
}