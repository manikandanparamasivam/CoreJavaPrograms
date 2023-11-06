public class Electrician{
    public void TestDevice(Device d ){
        d.doSomthing();
        if(d instanceof Tv){
            Tv t=(Tv)d;
            t.switchChannel();

        }

    }
}