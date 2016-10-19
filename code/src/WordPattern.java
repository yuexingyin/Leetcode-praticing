import java.util.HashMap;
import java.util.Map;

/**
 * Created by YuexingYin on 10/13/16.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if(pattern.length() != word.length)
            return false;
        Map map = new HashMap();
        for(Integer i=0; i<word.length; i++)
            if(map.put(word[i],i) != map.put(pattern.charAt(i),i))
                return false;
        return true;
    }
}
