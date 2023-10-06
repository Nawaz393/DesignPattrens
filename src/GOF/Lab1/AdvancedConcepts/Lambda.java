package GOF.Lab1.AdvancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {
    public void traverseList(){
        List<Integer> list=new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));
        list.forEach((item)->{
            System.out.println(item);
        });
    }
    public void lambdaAsArgumant(Arthematic lambada,int a,int b){
        System.out.println(lambada.operation(a,b));
    }

}
