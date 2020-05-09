import java.util.*;
class Table 
{
  synchronized void printTable(int n)
{
    
    int i;
   for(i=1;i<=5;i++)

   {System.out.println(n*i);
    try {
          Thread.sleep(400);
          }
      catch(Exception e)
         
           {System.out.println(e);}
}
}
}
class MThread extends Thread
{
    Table t;
 MThread(Table t)
{
    this.t=t;
}
public void run()
{
  t.printTable(5);
}
}

class MThread1 extends Thread
{
     Table t;
   MThread1(Table t)
     {
          this.t=t;
      }

public void run()
{
   t.printTable(100);
}
}

class Synchronization1
{
    public static void main(String args[])
      {
         Table obj=new Table();
          MThread t1=new MThread(obj);
          MThread1 t2=new MThread1(obj);
           t1.start();
           t2.start();
       }
}


















