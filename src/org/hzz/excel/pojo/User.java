package org.hzz.excel.pojo;

public class User {
    private Integer Id;
    private String name;
    private String phone;

    public User(Integer id, String name, String phone) {
        Id = id;
        this.name = name;
        this.phone = phone;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
