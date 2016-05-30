import java.io.PrintStream;
import java.util.HashMap;	
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Program1 {



}

class Person
{
	String name;
	int age;
	static HashMap<Integer,List<String>> age_and_names=new  HashMap<Integer,List<String>>();
	boolean add(String name,int age)
	{
		this.name=name;
		this.age=age;
		 return initiateMap();
	}
	boolean initiateMap()
	{

        if(age_and_names.containsKey(age))
        {
           // List list=age_and_names.get(age);
            return age_and_names.get(age).add(name);
            //age_and_names.put(age,list);
            //return true;
        }
        else
        {/*For new Entry*/

            age_and_names.put(age,new ArrayList<String>());

            return age_and_names.get(age).add(name);
        }
        //return false;


	}
    HashMap<Integer,List<String>> getByAge_Group()
    {
        return age_and_names;
        //HashMap<Integer,Integer> age_and_count=new  HashMap<Integer,Integer>();
    }
    HashMap<Integer,Integer>  getAgeGroupSize()
	{
        HashMap<Integer,Integer> age_and_count=new  HashMap<Integer,Integer>();
		for(Map.Entry<Integer,List<String>> entry:age_and_names.entrySet())
        {
            age_and_count.put(entry.getKey(),entry.getValue().size());
        }
        return age_and_count;
	}
	
}
