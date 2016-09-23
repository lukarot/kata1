package kata1v1;

import java.util.Date;

public class Kata1v1 {
    public static void main(String[] args) {
    Person person=new Person("Alberto","Monzón",new Date(93,03,8));
        System.out.println(person.getName()+" "+person.getSurname()+" tiene "
                +person.getAge()+" años");
    }
}
