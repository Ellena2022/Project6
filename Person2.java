public class Person2 {
    public static void main(String[] args) {
Person man= new Person(33, "Igor");
Person woman = new Person(22, "Ольга");
System.out.println(man.fullName+" кричит : ");
man.move(woman.fullName);
man.talk(woman.fullName);
    }
}
