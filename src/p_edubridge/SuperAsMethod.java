package p_edubridge;
class Animal
{
    public void AnimalSound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal
{
    @Override
    public void AnimalSound() {
        super.AnimalSound();
        System.out.println("dogs barks");
    }
}




public class SuperAsMethod
{
    public static void main(String[] args)
    {
        Animal an = new Dog();
        an.AnimalSound();

    }
}
