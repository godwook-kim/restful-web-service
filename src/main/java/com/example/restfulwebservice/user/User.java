package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;
// SpringBoot 2.3 버전 부터는 Web Startes에 더이상 javax.validation.*는 기본으로 포함하지 않는다.

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer id;

    @Size(min=2 ,  message = "Name은 2글자 이상 입력해주세요.")
    private String name;
    @Past
    private Date joinDate;
}
