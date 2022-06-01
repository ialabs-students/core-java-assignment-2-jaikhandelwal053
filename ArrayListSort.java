import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<BigInteger> alist =  new ArrayList<BigInteger>();
        alist.add(new BigInteger("24"));
        alist.add(new BigInteger ("543534"));
        alist.add(new BigInteger ("545"));
        alist.add(new BigInteger ("2342"));
        alist.add(new BigInteger("9"));

        System.out.println("Before Sorting: "+ alist);
       arrayListSortDesc(alist);
        System.out.println("After Sorting: "+ alist);
    }
    public static ArrayList arrayListSortDesc(ArrayList alist){
        Collections.sort(alist, Collections.reverseOrder());
        return alist;
    }
}
