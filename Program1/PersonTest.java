import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin03 on 25/5/16.
 */
public class PersonTest {
    @Test
    public void add() throws Exception {

    }

    static Person p1,p2,p3;
    @Test
    public void getByAge_Group() throws Exception {
        init();
        HashMap<Integer,List<String>> testMap=p1.getByAge_Group();
        HashMap<Integer,List<String>> expected=new HashMap<Integer,List<String>>();
        expected.put(8,new ArrayList<String>());
        expected.put(9,new ArrayList<String>());
        expected.get(8).add("Janani");
        expected.get(8).add("Asritha");
        expected.get(9).add("Ram");


        assertEquals(expected,testMap);
    }



    @Test
    public void getAgeGroupSize() throws Exception {
        init();
        HashMap<Integer,Integer> testMap=p1.getAgeGroupSize();
        HashMap<Integer,Integer> expected=new HashMap<Integer,Integer>();
        expected.put(8,2);
        expected.put(9,1);
        assertEquals(expected,testMap);
    }

    public void init()
    {
        p1=new Person();
        p2=new Person();
        p3=new Person();
        assertTrue(p1.add("Janani",8));
        assertTrue(p1.add("Ram",9));
        assertTrue(p1.add("Asritha",8));
    }
    @org.junit.Test
    public void initiateMap() throws Exception {
        Person test_p1=new Person();

        assertTrue(test_p1.add("janani",78));

    }

    //public

}