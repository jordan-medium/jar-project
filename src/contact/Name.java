package contact;

public class Name{
    private String fname,lname;

    public Name(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }

    public String getFirstName(){
        return this.fname;
    }
    public String getLastName(){
        return this.lname;
    }
    public void changeLastName(String newName){
        this.lname = newName;

    }

    public String toString(){
        return String.format("fname={%s};lname={%s}",this.fname,this.lname);
    }
      
    public static void main(String[] args) {
        
        Name name = new Name("Jordan","Williams");
        System.out.println(name);

    }
}