import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {



        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();

            //Write your code here
            Map<BigDecimal, LinkedList<String>> vMap = new TreeMap<>();
            for(int index=0;index<s.length;index++){
                if(null != s[index]) {
                    BigDecimal val = new BigDecimal(s[index]);
                    System.out.println(val);
                    if (null == vMap.get(val)) {
                        LinkedList<String> inputs = new LinkedList<>();
                        inputs.add(s[index]);
                        vMap.put(val, inputs);
                    } else {
                        vMap.get(val).add(s[index]);
                    }
                }

            }

            Map<BigDecimal,LinkedList<String>>  rMap=    vMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                    .collect(java.util.stream.Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldVal,newVal)->oldVal, LinkedHashMap::new));

            rMap.entrySet().stream()
                    .forEach((Map.Entry<BigDecimal,LinkedList<String>> entry )->{
                        entry.getValue().forEach(System.out::println);
                    });


            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }

}
