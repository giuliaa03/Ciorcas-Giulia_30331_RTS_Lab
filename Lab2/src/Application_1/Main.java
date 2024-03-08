package Application_1;

public class Main {
    private static final int nrOfThreads=10;
    private static final int processorLoad=1000000;
    public static void main(String[] args){
        Window win=new Window(nrOfThreads);
        for(int i =0; i<nrOfThreads; i++){
            new Fir(i,i+2,win,processorLoad).start();
        }
    }
}