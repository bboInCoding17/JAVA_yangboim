package test;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    void setInfo(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;

    }

    void showInfo() {
        System.out.println("이름은 : " + name);
        System.out.println("아이디는 : " + id);
        System.out.println("비밀번호는 : " + pw);
        System.out.println("나이는 : " + age);
    }


    boolean isLogin(String id, String pw){
        if(this.id.equals(id) && this.pw.equals(pw)){
            System.out.println("로그인 가능");
            return true;
        }
        else{
            System.out.println("로그인 불가능");
            return false;
        }
    }
}




