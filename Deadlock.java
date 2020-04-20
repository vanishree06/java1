class Deadlock
{
static object ol1=new object();
static object ol2=new object();
static class Thread1 extends Thread
{
public void run()
{
synchronized(ol2)
{
System.out.println("Thread2 locked object2");
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thread2 waiting for object1");
synchronized(ol1)
{
System.out.println("No Deadlock");
}
}
}
}
public static void main(String[] args)
{
Thread1 t1=new Thread1();
Thread t2=new Thread2();
t1.start();
t2.start();
}
}