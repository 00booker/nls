package com.hasity.business.service;

import com.hasity.business.mapper.cust.DemoMapperCust;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Resource
    private DemoMapperCust demoMapper;

    public int count() {
        return demoMapper.count();
    }
}
