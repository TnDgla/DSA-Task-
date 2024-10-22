class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        int diff=27;
        for(char x:letters)
        {
            if(x!=target)
            {
                int a=x-target;
                if(a>0 && a<diff)
                {
                    diff=a;
                    ch=x;
                }
            }
        }
        return ch;
    }
}