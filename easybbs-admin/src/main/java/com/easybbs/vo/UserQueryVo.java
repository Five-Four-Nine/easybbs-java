package com.easybbs.vo;

import com.easybbs.request.BasePageQuery;
import lombok.Data;

@Data
public class UserQueryVo extends BasePageQuery {
    private String nickNameFuzzy;

    private Integer sex;

    private Integer status;

    public UserQueryVo() {}
}
