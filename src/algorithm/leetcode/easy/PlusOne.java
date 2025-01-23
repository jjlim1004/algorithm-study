package algorithm.leetcode.easy;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());

        list.set(list.size()-1,list.get(list.size()-1)+1);

        for(int i = list.size()-1; i > 0 && list.get(i) == 10; i-- ){
            list.set(i,0);
            list.set(i-1, list.get(i-1)+1);
        }

        if(list.get(0) == 10){
            list.set(0,1);
            list.add(0);
        }

        return list.stream().mapToInt(i->i).toArray();

    }
}
