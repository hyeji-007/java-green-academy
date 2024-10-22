package com.green.practice.day11.ch16;

public class MyFriends {

    public static void main(String[] args) {

    }
}

//private 멤버필드 값 넣는 방법 2가지
//1. 생성자
//2. 메소드 (setter)

class UnivFriend {
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}

class CompFriend {
    private String name;
    private String department;
    private String phone;

    public CompFriend(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }

}
