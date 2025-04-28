package algorithm.leetcode.easy;

public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuffer arr=new StringBuffer();

        arr.append(command.replace("()","o").replace("(al)","al"));


        return arr.toString();
    }
}
