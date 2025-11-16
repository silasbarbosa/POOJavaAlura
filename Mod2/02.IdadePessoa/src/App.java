public class App {
    public static void main(String[] args) throws Exception {
    
        AgePerson person1 = new AgePerson();
        person1.setName("Carowl");
        person1.setAge(22);

        AgePerson person2 = new AgePerson();
        person2.setName("Camila");
        person2.setAge(12);

        System.out.println(person1.getName() + " tem " + person1.getAge() + " anos.");
        person1.verificationAge();
        System.out.println(person2.getName() + " tem " + person2.getAge() + " anos.");
        person2.verificationAge();



    }
}
