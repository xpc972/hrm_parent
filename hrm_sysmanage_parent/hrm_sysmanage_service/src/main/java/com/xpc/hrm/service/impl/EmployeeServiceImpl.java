package com.xpc.hrm.service.impl;

import com.xpc.hrm.domain.Employee;
import com.xpc.hrm.mapper.EmployeeMapper;
import com.xpc.hrm.service.IEmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xpc
 * @since 2019-09-02
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
