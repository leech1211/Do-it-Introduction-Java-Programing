package chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() { }
    public Person(String pname)
    {
        name = pname;
    }
    public Person(String n, float h, float w)
    {
        name = n;
        height = h;
        weight = w;
    }
}
