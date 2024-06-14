package com.hasity.business.service;

import com.hasity.business.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public int count() {
        return demoMapper.count();
    }
}
