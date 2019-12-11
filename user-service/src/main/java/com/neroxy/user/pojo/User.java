package com.neroxy.user.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {

    //主键
    @Id
    //开启主键id回填
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private String sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;
}
