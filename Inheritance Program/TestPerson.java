public class TestPerson{
    public static void main(String[] args){
        Person p=new Person();
        p.setname("mentie");
        p.setage(25);
        p.sing();
        p.addPetname("dioan");
        System.out.println(p.searchPetNme("dioan"));

    }
}