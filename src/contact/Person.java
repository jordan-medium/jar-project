package contact;

public class Person{
    protected Name name;
    protected String gender;
    protected long DOB;

    public Person(String fname,String lname,String gender,long DOB){
        this.name = new Name(fname, lname);
        this.gender = gender;
        this.DOB = DOB;
    }
    public String getName(){
        return this.name.getFirstName() + " " + this.name.getLastName();
    }
    public String getGender(){
        return gender;
    }
    public void changeLastName(String newName){
        name.changeLastName(newName);
    }
    public long getDOB(){
        return this.DOB;
    }
    public static void main(String[] args) {
        Person person = new Person("John", "Brown", "Male",20110708l );
        System.out.println(person.getDOB());
        System.out.println(person.getName());
        System.out.println(person.getGender());
    }
}