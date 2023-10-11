public class ArrayProgram11{



public static int[] findDuplicate(int[] arr1,int[] arr2)
{
    int[] singleArray=new int[arr1.length+arr2.length];
    for(int i=0;i<arr1.length;i++){
    if(arr1[i+1]!=arr1[i]){
        singleArray[i] = arr1[i];  
    }else{
        System.out.println("the duplicate value");
    }
    }

      int s=0;
    for(int j=arr1.length;j<singleArray.length;j++){
        if(singleArray[s]!=arr2[s]){
            singleArray[j]=arr2[s];
            s++;
        }else
        {
            System.out.println("this duplicate");
        }

    }
    return singleArray;

}

public static void main(String[] args){
    int[] arr1={1,2,3,2,4};
    int[] arr2={4,5,6,7};
    int[] result=findDuplicate(arr1,arr2);
    for(int x:result){
        System.out.println(x);
    }
}

}

/*{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5,1};
        int[] arr1={1,2,7,6};
        int[] arr3=singleArray(arr1,temp);
        int[] result=singleArray(arr3,arr2);
        System.out.println(result);
    }
    public static int[] singleArray(int[] arr1,int[] arr2)
    {
        int[] arr=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            if(i ==0){
                arr[i]=arr1[i];
            }else{ 
                  for(int j=0;j<=i;j++){
                    if(arr[j]!=arr1[i]){
                        if(j==i){
                            arr[j+1]=arr1[i];

                        }
                        else{
                        continue;}
                    }
                        else{
                            System.out.println("same number not store");
                            break;
                        }
                    
                  }
                
            }
        }
        
        }

    }*/