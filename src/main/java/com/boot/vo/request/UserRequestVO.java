package com.boot.vo.request;


import javax.ws.rs.QueryParam;
import java.util.Date;

public class UserRequestVO {

    @QueryParam("name")
    private String name;

    @QueryParam("lastName")
    private String lastName;

    @QueryParam("birthDate")
    private Date birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
