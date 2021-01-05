package com.ry.bill.sys.common;

import com.ry.bill.sys.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: zzy
 * @Date: $ $
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiverUser {
    private User user;
    private List<String> roles;
    private List<String> permissions;
}
