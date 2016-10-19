/**
 * Created by YuexingYin on 10/13/16.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(int i=0; i<s.length(); i++){
            res ^= s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            res ^= t.charAt(i);
        }
        return res;
    }
}
