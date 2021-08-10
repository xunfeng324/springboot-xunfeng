package com.xunfeng.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@ApiModel("用户实体类")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {

    @ApiModelProperty("用户名")
    private String uname;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("地址")
    private String addr;

}
