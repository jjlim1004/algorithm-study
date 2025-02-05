package algorithm.leetcode.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int inta = binaryToInt(a);
        int intb = binaryToInt(b);

        int intc = inta + intb;
        StringBuffer sbf = new StringBuffer("");

        for(int i = 2; intc / 2 > 0 ;){
            sbf.insert(0,intc % 2);
            intc = intc/2;
        }
        sbf.insert(0,intc);

        return sbf.toString();
    }

    public int binaryToInt(String s){
        int i = s.length()-1;
        int j = 1;
        int k = 0;

        while(i >= 0 ){
            k += Character.getNumericValue(s.charAt(i)) * j;
            i--;
            j *= 2;
        }
        System.out.println(k);
        return k;
    }

    public String addBinaryAnother(String a, String b) {
        int carry = 0;
        int i = a.length() -1;
        int j = b.length() -1;
        StringBuilder sb = new StringBuilder();

        while(i>=0 || j >=0 || carry > 0 ){
            if(i>=0){
                carry += a.charAt(i--) -'0';
            }

            if(j>=0){
                carry += b.charAt(j--) -'0';
            }

            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }

}
