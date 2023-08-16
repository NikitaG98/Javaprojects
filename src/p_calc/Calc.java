package p_calc;

import java.util.Scanner;

public class Calc
{

    private int n1,n2;

    public void set(int num1, int num2)
    {
        n1=num1;
        n2=num2;
    }

    public int add()
    {
        int add;
        add =n1+n2;
        return add;
    }

    public int sub()
    {
        int sub;
        sub =n1-n2;
        return sub;
    }

}
