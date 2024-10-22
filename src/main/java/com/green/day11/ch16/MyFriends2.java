package com.green.day11.ch16;

public class MyFriends2 {

    public static void main(String[] args) {


    }
}

//생성자를 통해 멤버필드 초기화 가능하게 작성
class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

//이름, 전화, 전공값을 초기화할 수 있는 생성자 작성
class UnivFriend2 extends Friend {
    private String major;

    public UnivFriend2(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

}

class CompFriend2 extends Friend {
   private String department;

   public CompFriend2(String name, String phone, String department) {
       super(name, phone);
       this.department = department;
   }

    public String getDepartment() {
        return department;
    }
}
