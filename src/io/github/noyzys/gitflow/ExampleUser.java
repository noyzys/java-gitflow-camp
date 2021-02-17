package io.github.noyzys.gitflow;

/**
 * @author: noyzys on 20:48, 17.02.2021
 **/
class ExampleUser
{
    private final String name;
    private final int age;
    private final boolean live;

    public ExampleUser(final String name, final int age, final boolean live)
    {
        this.name = name;
        this.age = age;
        this.live = live;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isLive()
    {
        return live;
    }
}
