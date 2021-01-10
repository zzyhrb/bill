package com.ry.bill.sys.vo;

import com.ry.bill.sys.domain.Dept;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DeptVo extends Dept {

    private static final long serialVersionUID=1L;
    private Integer ids[];
    private Integer page;
    private Integer limit;
}
