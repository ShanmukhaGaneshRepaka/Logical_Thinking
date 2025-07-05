package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class findDuplicetaeCharacter {
    static Character duplicate(String name)
    {
        Set<Character> set=new LinkedHashSet<>();
 int duplicateCharacter = 0;
        for(char c:name.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
            }
            else{
                duplicateCharacter++;
                if(duplicateCharacter==2)  return c;
            }

        }
    return null;
    }

    public static void main(String[] args) {
        System.out.println(duplicate("GanenshaG"));
    }
}
