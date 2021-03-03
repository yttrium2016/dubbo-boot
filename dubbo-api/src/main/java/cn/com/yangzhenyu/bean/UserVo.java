package cn.com.yangzhenyu.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {
    private int id;
    private String name;
    private String address;
}
