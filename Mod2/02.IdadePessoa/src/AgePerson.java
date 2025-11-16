public class AgePerson {
    private String name;
    private int age;

    /*get and setters*/
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

    /*Metodo */
    public void verificationAge(){
        if(this.getAge() > 18 ){
            System.out.println("User of legal age ");
        }
        else{
            System.out.println("User of illegal age");
        }
    }

}
