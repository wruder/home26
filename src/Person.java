import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private UserType userType;

    public Person(String name, int age, UserType userType) {
        this.name = name;
        this.age = age;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userType=" + userType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && getUserType() == person.getUserType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getUserType());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}


