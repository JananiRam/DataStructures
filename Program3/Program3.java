import java.util.TreeSet;
import java.util.Random;
/**
 * Created by admin03 on 25/5/16.
 */
public class Program3 {
    Random random_number=new Random();
    TreeSet<Integer> sampleTreeSet=new TreeSet<Integer>();
    TreeSet<Integer>  createTreeSet() {
        int r;
        for (int i = 0; i < 100; i++)
        {

            do {
                r=Math.abs(random_number.nextInt(100));

            }while(sampleTreeSet.contains(r));
            sampleTreeSet.add(r);

        }
        return sampleTreeSet;
    }
    public int getLowerNumber(int number)
    {
        return sampleTreeSet.lower(number);
    }
    public int getHigherNumber(int number)
    {
        return sampleTreeSet.higher(number);
    }

}
