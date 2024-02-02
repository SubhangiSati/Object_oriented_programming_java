public class Multithreading extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
