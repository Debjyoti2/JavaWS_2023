package com.pwb.synchronized_keyword;

class PrintTableExample {

    public void printTable(int n){
        synchronized (this){
            for(int i=1;i<=10;i++){
                System.out.println(n  + " * " + i + " = " + n*i);
            }
        }

    }

}
class ThreadClass1 extends Thread{

    PrintTableExample pt;
    ThreadClass1(PrintTableExample pt){
        this.pt =pt;
    }

    @Override
    public void run(){
     pt.printTable(5);
    }
}

class ThreadClass2 extends Thread{
    PrintTableExample pt;
    ThreadClass2(PrintTableExample pt){
        this.pt=pt;
    }

    @Override
    public void run(){
       pt.printTable(7);
    }

}

class Runner{
    public static void main(String[] args) {

        PrintTableExample pt =new PrintTableExample();

        ThreadClass1 th1 = new ThreadClass1(pt);
        ThreadClass2 th2 = new ThreadClass2(pt);

        th1.start();
        th2.start();


    }
}


