import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Permutations 
{   
  static ArrayList<String> result = new ArrayList();
  
  public static List<String> singlePermutations(String s) 
  {
    result.clear();
    
    permutation(s, "");
    
    result.removeIf(n -> (n.length() != s.length()));
    
    Set<String> no_duplicates = new HashSet<String>(result);
    result.clear();
    result.addAll(no_duplicates);
    return result;
  }
  
  public static void permutation(String str, String ans) 
   {
 
        if (str.length() == 0) {
            result.add(ans);
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                        str.substring(i + 1);
 
            permutation(ros, ans + ch);
        }
    }
}
