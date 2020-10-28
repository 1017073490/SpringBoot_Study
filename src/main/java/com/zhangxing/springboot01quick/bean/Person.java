package com.zhangxing.springboot01quick.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhangxing
 * Description: ymal语法测试
 * 将配置文件中配置的属性值，映射到这个组件中
 *
 * ConfigurationProperties: 告诉Springboot将本类中的所有属性和配置文件中的相关配置进行绑定
 * 此外，只有这个组件是容器的组件，才能使用容器提供的ConfigurationProperties功能。
 * 不过，这个是默认从全局配置文件中获取值；
 * 想要指定配置文件使用@PropertySource注解.
 * 而
 * 2020/10/27 19:50
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
/*
* 如果专门编写一个JavaBean与配置文件进行映射，我们直接使用@ConfigurationProperties
* 如果只是在业务逻辑中需要获取一下配置文件中的某项值，就使用@Value
* */
//@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
    @Value("${random.value}")
    private String lastName;
    @Value("#{10*20}")
    //@Email
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
