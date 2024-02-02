class Thread implements Runnable {
    Thread t;
    Thread M(){             //from here it will parallelly execute Thread M at same time
        t=new Thread("demo thread");
        System.out.println("thread details",t);
        t.start();
       
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("child thread",t);
                thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(i);
        }
    }
}
public class multithread{
    public static void main(String args[]){
        new Thread ();
            try{
                for(int i=5;i<1;i--){
                    System.out.println("Main Thread");
                    thread.sleep(1000);
                }
            }
            catch(Interpted Exception){
                System.out.println("at end "+ i);
            }
     } 
}


//output will be 2 execution of first for loop and 1 execultion of second for loop