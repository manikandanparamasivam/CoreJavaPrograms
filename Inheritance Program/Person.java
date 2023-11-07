import java.util.*;
public class Person{
   private String name;
   private int age;
   public void setname(String name){
    this.name=name;
   }
   public String getname(){
    return name;
   }
   public void setage(int age){
    this.age=age;
   }
   public int getage(){
    return age;
   }
    private String[] petName=new String[20];
    int Count=0;

    public void sing(){
        String song="";
        for(int i=0;i<petName.length;i++){
            int n= (int)(20*Math.random());
            song=song+petName[n];
        }
        System.out.println(song);
    }
    public void addPetname(String n){
        if(Count<petName.length){
            petName[Count++]=n;
        }
        else{
            System.out.println("");
        }
    }
    public boolean searchPetNme(String n){
        for(String s:petName)
        {
            if(s.equals(n)){
                return true;
            }
        }
        return false;
    }
}