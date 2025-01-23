//how to throw exception in java program
public class TestThrow
{
    static void validate(int age)
    {
        if(age < 18)
        throw new ArithmeticException("not valid");
        else
        System.out.println("welcome to vote on tecnolamror");

    }
    public static void main(String args[])
    {
        validate(20);
        System.out.println("reset of code..");
    }
}