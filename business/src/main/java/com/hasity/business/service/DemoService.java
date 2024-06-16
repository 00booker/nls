package com.hasity.business.service;

import com.hasity.business.domain.Demo;
import com.hasity.business.domain.DemoExample;
import com.hasity.business.mapper.DemoMapper;
import com.hasity.business.mapper.cust.DemoMapperCust;
import com.hasity.business.req.DemoQueryReq;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;


    @Resource
    private DemoMapperCust demoMapperCust;

    public int count() {
        return demoMapperCust.count();
    }

    public List<Demo> query(DemoQueryReq demoQueryReq) {
        String mobile = demoQueryReq.getMobile();
        DemoExample demoExample = new DemoExample();
        demoExample.setOrderByClause("id asc");
        DemoExample.Criteria criteria = demoExample.createCriteria();
        // if (StrUtil.isBlank(mobile)) {
        //     throw new BusinessException(BusinessExceptionEnum.DEMO_MOBILE_NOT_NULL);
        // }
        List<Demo> demoList = demoMapper.selectByExample(demoExample);
        return demoList;
    }
}
