package algorithm.leetcode.easy;

public class RomanToInteger {

    public int romanToInt(String s) {
        String[] sa = s.split("");
        String before ="";
        int number = 0;

        for(int i = sa.length-1; i >= 0 ; i--){
            switch(sa[i]){
                case "I":
                    if("V".equals(before) || "X".equals(before)){
                        number = number-1;
                    }else{
                        number = number+1;
                    }
                    before =sa[i];
                    break;
                case "V":
                    number = number+5;
                    before =sa[i];
                    break;
                case "X":
                    if("L".equals(before) || "C".equals(before) ){
                        number = number-10;
                    }else{
                        number = number+10;
                    }
                    before =sa[i];
                    break;
                case "L":
                    number = number+50;
                    before =sa[i];
                    break;
                case "C":
                    if("D".equals(before) || "M".equals(before)){
                        number = number-100;
                    }else{
                        number = number+100;
                    }
                    before =sa[i];
                    break;
                case "D":
                    number = number+500;
                    before =sa[i];
                    break;
                case "M":
                    number = number+1000;
                    before =sa[i];
                    break;

            }
        }
        return number;
    }
}
