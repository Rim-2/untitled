class Person {
    String name;
    int age;
    boolean hasJob;
    String job;

    public void sayHello() {
        System.out.println("안녕하세요." + name + "입니다. 저의 나이는" + age + "세 입니다.");
    }

    public void sayJob() {
        if (hasJob) {
            System.out.println("저는 무직입니다.");
        } else {
            System.out.println("제 직업은 " + job + "입니다.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.hasJob = true;
        person.job = "개발자";

        person.sayHello();
        person.sayJob();
    }
}