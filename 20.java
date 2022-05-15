import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// Using ASII table
class Solution20 {
    public boolean isValid(String s) {
        // make a dequ
        Deque<Integer> d = new ArrayDeque<>();
        // go through the s string
        for (int i = 0; i < s.length() ;i++ )
        {   
            // set variable c as the character at i
            char c = s.charAt(i);
            // int u equal the c value minus the zero to give a 
            int u = c - '0';
            // if c is those 
            if (c == '(' || c == '{' || c == '[')
            {
                // add to the end
                d.addLast(u);
            }
            else {
                if (!d.isEmpty() && Math.abs(d.peekLast()- u ) <= 2)
                {
                    d.pollLast(); // get the last value   
                }
                else 
                {
                    return false; // return false 
                }
            }
        }
        return d.isEmpty(); // d should be empty it should return true;
    }
}


// Method 2 
// Using hash map
class Solution20_2 {
    HashMap<Character, Character> map = new HashMap<Character, Character>(){{
        put(']','[');
        put('}','{');
        put(')','(');
    }};
    public boolean isValid(String s) {
        Deque<Character> d = new ArrayDeque<>();
        for (int i =0 ; i < s.length();i++)
        {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '('){ d.addLast(c);}
            else {
                if (!d.isEmpty() && d.peekLast() == map.get(c))
                {
                    d.pollLast();
                }
                else{
                    return false;
                }
            }
            
        }
        return d.isEmpty();
    }
    
    
     
}