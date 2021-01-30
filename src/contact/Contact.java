package contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Contact extends Person {
    private static int count = 0;
    private int entryNum;
    private Address address;
    private ArrayList<String> emailList;
    private ArrayList<Phone> phoneList;
    private String alias;
    private static ArrayList<String> aliasList = new ArrayList<String>();
    
    
    public Contact(String fname,String lname, String gender,long DOB){
        super(fname, lname, gender, DOB);
        count++;
        entryNum = count;
        this.emailList = new ArrayList<String>();
        this.phoneList = new ArrayList<Phone>();
    }
    public int getEntryNo(){
        return this.entryNum;
    }
    public int getAge(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int age = year - Integer.parseInt(Long.toString(DOB).substring(0, 4)) ;
        return age;
    }
    public void updateName(String name){
        this.name.changeLastName(name);
    }
    public void setAddress(String address){
        this.address = new Address(address);
    }
    public String[] getAddress(){
        return this.address.getAddress();
    }
    public String getAlias(){
        return this.alias;
    }
    public void setAlias(String name){
        if (!aliasList.contains(name)){
            this.alias =  name;
            this.aliasList.add(name);
        }
    }
    public String getName(){
        return name.getLastName()+","+name.getFirstName();
    }

    public void addEmail(String email){
        this.emailList.add(email);
    }
    public void deleteEmail(String email){
        this.emailList.remove(email);
    }
    public String[] getEmailList(){
        String[] temp = new String[emailList.size()];

        for (int i = 0; i < emailList.size(); i++) {
            temp[i] = emailList.get(i);
        }
        return temp;
    }
    public void addPhone(char type,long number){
        
        Phone phone = new Phone(number, type);
        if (phoneList.size() < 5){
            phoneList.add(phone);
        }

    }
    public void deletePhone(long number){
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getNumber()== number){
                phoneList.remove(i);
            }
        }
    }
    public String[] getPhoneList(){
        String[] temp = new String[phoneList.size()];
        for (int i = 0; i < phoneList.size(); i++) {

            temp[i] = phoneList.get(i).toString();
            
        }
        return temp;
    }
    
    public static void main(String[] args) {
        Contact contact = new Contact("John", "Brown", "male", 20110708);
        contact.addEmail("email@email.com");
        contact.addEmail("jordan@email.com");
        contact.addPhone('H', 8765245788l);
        contact.addPhone('H', 8766908731l);
        contact.setAddress("1 Any Street;Any Town;;;Jamaica");

        System.out.println("Age: " + contact.getAge());
        System.out.println("Name: " + contact.getName());        
        System.out.println("enty number: " + contact.getEntryNo());
        
        System.out.println("\nEmail list: ");
        System.out.println(Arrays.asList(contact.getEmailList()));
        System.out.println("\nAddress list: ");
        System.out.println(Arrays.asList(contact.getAddress()));
        System.out.println("\nPhone list: ");
        System.out.println(Arrays.asList(contact.getPhoneList()));
        
    }
}