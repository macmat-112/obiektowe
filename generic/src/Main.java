public class Main
{
    public <T> boolean isEqual(T a, T b)
    {
        return a.equals(b);
    }

    public static <T> void swap(T[] tab, int i, int j)
    {
        if(i > 0 && j > 0 && i < tab.length && j < tab.length)
        {
            T tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
        }
        else System.out.println("Error");
    }

    public static <T extends Comparable<T>> T minValue(T[] tab)
    {
        if(tab.length == 0) return null;
        T min = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(min.compareTo(tab[i]) > 0) min = tab[i];
        }
        return min;
    }

    public static Animal findMax(Pair<? extends Animal> pair)
    {
        if(pair.getFirst().compareTo(pair.getSecond()) < 0) return pair.getSecond();
        else return pair.getFirst();
    }

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.setName("Cat");
        animal.setAge(20);
        dog.setName("Dog");
        dog.setAge(30);
        Pair<Animal> pair = new Pair<>();
        pair.setFirst(animal);
        pair.setSecond(dog);
        System.out.println(findMax(pair));
    }
}