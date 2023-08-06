package com.zzy.dingdong_order.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zzy.dingdong_order.common.result.Result;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/admin/employee")
@Slf4j
@Api(tags = "员工相关接口", value = "员工相关接口")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    /**
     * 员工登录
     */
    @PostMapping("/login")
    @ApiOperation("员工登录")
    public Result<EmployeeEntity> login(HttpServletRequest request, @RequestBody EmployeeEntity employeeEntity) {
        //1、将页面提交的密码password进行md5加密处理
        String password = employeeEntity.getPassword();
//        password = DigestUtils.md5DigestAsHex(password.getBytes());
        //2、根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<EmployeeEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(EmployeeEntity::getUsername, employeeEntity.getUsername());
        EmployeeEntity employee = employeeService.getOne(lambdaQueryWrapper);
        //3、如果没有查询到则返回登录失败结果
        if (employee == null) {
            return Result.error("查无此人！");
        }
        //4、密码对比，如果不一致则返回登录失败结果
        if (!employee.getPassword().equals(password)) {
            return Result.error("密码或用户名错误！");
        }
        //5、查看员工状态，如果状态已经禁用（0），则返回员工已禁用结果
        if (employee.getStatus() == 0) {
            return Result.error("账号已经禁用！");
        }
        //6、登录成功，将员工id存入Session并返回登录成功结果
        request.getSession().setAttribute("employee", employee.getId());
        return Result.success(employee);
    }

    /**
     * 员工退出
     * @param request
     * @return
     */
    @ApiOperation("员工退出")
    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request){
        //清理Session中保存的当前登录员工id
        request.getSession().removeAttribute("employee");
        return Result.success("退出成功！");
    }
}
