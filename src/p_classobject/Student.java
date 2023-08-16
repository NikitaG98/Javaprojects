package p_classobject;

public class Student
        /**array of object and student data with setter getter
         *
         */
{
    private int sem, rno;
    private String name,dept;
    private float per;

    public int getSem()
    {
        return sem;
    }

    public void setSem(int sem)
    {
        this.sem = sem;
    }


    public int getRno() {
        return rno;
    }

    public void setRno(int rno)
    {
        this.rno = rno;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public float getPer()
    {
        return per;
    }

    public void setPer(float per)
    {
        this.per = per;
    }

}
