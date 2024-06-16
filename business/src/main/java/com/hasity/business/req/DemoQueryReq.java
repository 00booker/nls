package com.hasity.business.req;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DemoQueryReq {

    @NotBlank(message = "手机号不能为空")
    private String mobile;
}
