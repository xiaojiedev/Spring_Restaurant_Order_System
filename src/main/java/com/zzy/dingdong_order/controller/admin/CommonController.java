package com.zzy.dingdong_order.controller.admin;

import com.zzy.dingdong_order.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传下载
 */
@RestController
@RequestMapping("admin/common")
@Api(tags = "文件上传下载接口", value = "文件上传下载接口")
public class CommonController {
    @Value("${zzy.path}")
    private String basePath;

    @ApiOperation("文件上传下载")
    @PostMapping("/upload")
    public Result<String> upload(@RequestBody MultipartFile file){
        //file是一个临时文件，需要转存到指定位置，否则本次请求完成后临时文件会删除
        //原始文件名
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        //使用UUID重新生成文件名，防止文件名称重复造成文件覆盖
        String fileName = UUID.randomUUID().toString() + suffix;
        //创建一个目录对象
        File dir = new File(basePath);
        //判断当前目录是否存在，不存在则创建
        if (!dir.exists()){
            dir.mkdirs();
        }
        try {
            //将临时文件转存到指定位置
            file.transferTo(new File(basePath + originalFilename));
        }catch (IOException e){
            e.printStackTrace();
        }
        return Result.success(fileName);
    }
}
