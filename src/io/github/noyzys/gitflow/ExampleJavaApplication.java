package io.github.noyzys.gitflow;

/**
 * @author: noyzys on 20:40, 17.02.2021
 **/
class ExampleJavaApplication
{
    public static void main(String[] args)
    {
        final ExampleUser user = new ExampleUser("Darek", 20, true);
        final String userName = "Artur";
        if (user.getName().equals(userName))
        {
            System.out.println("User, to: " + user.getName());
        }

        System.out.println("User, to Darek i ma " + user.getAge() + " lat.");
    }
}
