package com.greelee.springbootdemo.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author: gl
 * @Email: 110.com
 * @version: 1.0
 * @Date: 2019/3/16
 * @describe:
 */
@Data
@Builder
public class Test {
    private Integer id;
    private String name;
}
