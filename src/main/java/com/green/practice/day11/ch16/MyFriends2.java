package com.green.practice.day11.ch16;

public class MyFriends2 {

    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];

        //다형성: 다양한 형태가 될 수 있는 성질 >> 변수타입과 객체는 다른데 저장 o
        UnivFriend2 obj1 = new UnivFriend2("Lee", "Computer", "010-1111-1111");
        Friend f1 = obj1;
        Friend f2 = new UnivFriend2("SEO", "Electronics", "010-2222-2222");
        Friend[] arr3 = new Friend[10];
        arr3[0] = obj1;
        arr3[1] = f2;
        arr3[2] = new CompFriend2("Yoon", "R&D 1", "02-123-9999");
        arr3[3] = new CompFriend2("PARK", "R&D 2", "02-333-5555");
        arr3[0].showInfo();

        System.out.println();

        //반복문으로 arr3에 객체 주소값이 있는 친구들만 showInfo() 메소드 호출
        for(int i = 0; i < arr3.length; i++) {
            Friend item = arr3[i];
            if (item == null) {
                continue;
            }
            item.showInfo();
            System.out.println();
        }
        System.out.println();

        for (Friend item : arr3) {
            if (item == null) {
                continue;
            }
            item.showInfo();
            System.out.println();
        }
        System.out.println();



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

class UnivFriend2 extends Friend {
    private String major;

    public UnivFriend2(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

class CompFriend2 extends Friend {
    private String department;

    public CompFriend2(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}








