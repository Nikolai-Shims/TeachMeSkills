package Example;

import com.sun.security.ntlm.Client;

public class User < T, D > {
    private T name;
    private D age;

    User(T name, D age) {
        this.name = name;
        this.age = age;
    }

    public D getAge() {
        return age;
    }

    public void setAge(D age) {
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getinformation () {
        System.out.println(getName());
        return getName();
    }

}
