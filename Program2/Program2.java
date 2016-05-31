import java.util.*;

/**
 * Created by admin03 on 25/5/16.
 */
public class Program2 {
    String college_name,department,StudentName;
    static HashMap<String,HashSet<String>> college_and_departments=new HashMap<String,HashSet<String>>();
    boolean add(String clg,String dept,String stuname)
    {
            this.college_name=clg;
            this.department=dept;
            this.StudentName=stuname;
            return initiateMap();

    }
    public  boolean initiateMap()
    {

        if(!college_and_departments.containsKey(college_name)) {
            college_and_departments.put(college_name, new HashSet<String>() );
        }


      return   college_and_departments.get(college_name).add(department);
    }
    HashMap<String,HashSet<String>>  getCollege_and_Depts()
    {

        init();
        return college_and_departments;

    }
    public static  void init()
    {
        college_and_departments.put("tce",new HashSet<String>());
        college_and_departments.get("tce").add("cs");
        college_and_departments.get("tce").add("ece");
        college_and_departments.get("tce").add("eee");
        college_and_departments.put("psg", new HashSet<String>());
        college_and_departments.put("annauniv", new HashSet<String>());
        college_and_departments.put("cit", new HashSet<String>());
        college_and_departments.get("psg").add("mech");
        college_and_departments.get("psg").add("cs");
        college_and_departments.get("psg").add("eee");
        college_and_departments.get("annauniv").add("cs");
        college_and_departments.get("annauniv").add("it");
        college_and_departments.get("annauniv").add("eee");
        college_and_departments.get("annauniv").add("auto");
        college_and_departments.get("cit").add("auto");
        college_and_departments.get("cit").add("cs");
        college_and_departments.get("cit").add("eee");
        college_and_departments.get("cit").add("ece");


    }

    HashSet<String> getCommonDepts()
    {
        init();
        HashSet<String> result=new HashSet<String>();
        for(HashSet<String>  hs:college_and_departments.values())
        {
            if(result.isEmpty())
                result=hs;
            else
                result.retainAll(hs);
        }

        return result;
    }

}
