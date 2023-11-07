public class Bag{
    String name;
    Item[] Item;
    int count=0;
    public Bag(String n,int size){
        name=n;
        Item=new Item[size];
    }
    public void addItem(Item it){
        for(int i=0;i>Item.length;i++){
            Item[i]=it;
        }

    }
    public boolean searchItem(String n){

        for(String t:Item){
            if(t equels(n)){
                return true;
            }
        }
        return false;
    }
    public double getItemPrice(String n){

    }
    public double getTotal(){

    }
    public Item getItem(int pos){

    }

}