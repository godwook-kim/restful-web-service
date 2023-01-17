package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// SpringBoot 2.3 버전 부터는 Web Startes에 더이상 javax.validation.*는 기본으로 포함하지 않는다.

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value={"password"})
@NoArgsConstructor
@JsonFilter("UserInfo")
public class User {
    private Integer id;

    @Size(min=2 ,  message = "Name은 2글자 이상 입력해주세요.")
    private String name;
    @Past
    private Date joinDate;
    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;
}
