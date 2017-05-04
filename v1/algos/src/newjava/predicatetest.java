package newjava;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Legend on 02/05/17.
 */
public class predicatetest {

    public static void main(String[] args)
    {
        Apple apple1= new Apple("A1",20);
        Apple apple2= new Apple("A2",50);
        List<Apple> appleList = new ArrayList<Apple>();
        List<Apple> filteredAppleList = new ArrayList<Apple>();
        appleList.add(apple1);
        appleList.add(apple2);

        filteredAppleList=appleList.stream().filter(p->p.getAppleName().equalsIgnoreCase("A2")).filter(p->p.getAppleWeight()>40).collect(Collectors.toList());
        System.out.println(filteredAppleList.get(0).appleName);

    }
}


class Apple
{
    String  appleName;
    int appleWeight;

    Apple(String appleName,int appleWeight)
    {
        this.appleName=appleName;
        this.appleWeight=appleWeight;
    }

    String getAppleName()
    {
        return this.appleName;

    }

    int getAppleWeight()
    {
        return this.appleWeight;
    }

}

