package pixar.toystory.domain;

public class Person {
    private final String name;
    private final int age;
    private String nickname;

    public Person(final String name, final int age, String nickname){
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
}
