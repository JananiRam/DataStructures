import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by admin03 on 25/5/16.
 */
public class Program2Test {


    static Program2 test=new Program2();

    static HashMap<String,HashSet<String>>  expected=new HashMap<String,HashSet<String>>();
    @Test
    public void getCommonDepts() throws Exception {
        init();
        HashSet<String> expectedSet=new HashSet<String>();
        expectedSet.add("cs");
        expectedSet.add("eee");
        Program2.init();
        HashSet<String> testSet= (HashSet<String>) test.getCommonDepts();
        assertEquals(expectedSet,testSet);
    }
    @Test
    public void getCollege_and_Depts() throws Exception {

        init();
        HashMap<String,HashSet<String>> actual=test.getCollege_and_Depts();
        assertEquals(expected,actual);
    }


    @Test
    public void add() throws Exception {
        init();
        assertTrue(test.add("tce","cs","Janani"));
        assertTrue(test.add("tce","ece","Anitha"));
        assertTrue(test.add("tce","eee","Kavishree"));
        assertTrue(test.add("psg","mech","Ravi"));
        assertTrue(test.add("psg","eee","Renuga"));
        assertTrue(test.add("psg","cs","Durga"));
        assertTrue(test.add("annauniv","cs","Parvathi"));
        assertTrue(test.add("annauniv","it","Janani Ram"));
        assertTrue(test.add("annauniv","auto","Ramachandran"));
        assertTrue(test.add("annauniv","eee","Chandran"));
        assertTrue(test.add("cit","auto","Valar"));
        assertTrue(test.add("cit","cs","Raj"));
        assertTrue(test.add("cit","ece","Brinda"));
        assertTrue(test.add("cit","eee","Raja"));

     assertEquals(expected,Program2.college_and_departments);
    }
    public void init()
    {
        expected.put("tce",new HashSet<String>());
        expected.get("tce").add("cs");
        expected.get("tce").add("ece");
        expected.get("tce").add("eee");
        expected.put("psg", new HashSet<String>());
        expected.put("annauniv", new HashSet<String>());
        expected.put("cit", new HashSet<String>());
        expected.get("psg").add("mech");
        expected.get("psg").add("cs");
        expected.get("psg").add("eee");
        expected.get("annauniv").add("cs");
        expected.get("annauniv").add("it");
        expected.get("annauniv").add("auto");
        expected.get("annauniv").add("eee");
        expected.get("cit").add("auto");
        expected.get("cit").add("cs");
        expected.get("cit").add("ece");
        expected.get("cit").add("eee");


    }

}