package com.zktx.testgit.test;

<<<<<<<<< Temporary merge branch 1
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
=========
>>>>>>>>> Temporary merge branch 2

/**
 * @Author： cxy
 * @Date： 2022/5/4
 */
<<<<<<<<< Temporary merge branch 1
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    Integer age;
=========

public class Person {
    Integer id;
>>>>>>>>> Temporary merge branch 2

    String name;
}
