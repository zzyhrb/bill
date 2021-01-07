package com.ry.bill.sys.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author zzy
 * @version 1.0.0
 * @ClassName Dept.java
 * @Description TODO
 * @createTime 2021年01月07日 10:32:00
 */
@Data
@TableName("sys_dept")
public class Dept {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer pid;
    private String title;
    private Integer open;
    private String remark;
    private String address;
    private Integer available;
    private Integer ordernum;
    private Date createtime;

}
