package com.zktx.testgit.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Author： cxy
 * @Date： 2022/5/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    Integer id;

    String name;

    String sex;
}
