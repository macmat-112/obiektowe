public record Person(String firstName, String lastName, int age, Address address)
{
    public Person(String firstName, String lastName, int age, Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Math.max(age, 0);
        this.address = address;
    }
}
