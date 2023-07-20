import java.util.*;
public class LargestNumber {
    static void larger(Vector<String> arr, int n)
    {
            Collections.sort(arr, new Comparator<String>()
            {
                @Override public int compare(String s1, String s2)
                {
                    String str1=s1+s2;
                    String str2=s2+s1;
                    return str1.compareTo(str2)>0? -1: 1;
                }
            });
            Iterator i = arr.iterator();
            while (i.hasNext())
                System.out.print(i.next());
        }
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            Vector<String> arr;
            arr = new Vector<>();
            for (int i=0;i<n;i++) {
                arr.add(scanner.next());
            }
            larger(arr,n);
        }
    }