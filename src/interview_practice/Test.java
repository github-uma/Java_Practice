package interview_practice;

public class Test
{
    public static void main(String[] args)
    {
        Temp obj = Temp.create(20);
        obj.myMethod();
    }
}
class OrderCheck
{
    private OrderCheck(int data)
    {
        System.out.printf(" Constructor called ");
    }
    protected static OrderCheck create(int data)
    {
    	OrderCheck obj = new OrderCheck(data);
        return obj;
    }
    public void myMethod()
    {
        System.out.printf(" Method called ");
    }
}