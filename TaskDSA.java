public class assigncookies {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int l=0;
            int r=0;
            while(l < g.length && r < s.length){
                if(g[l]<=s[r]){
                    l++;
                }

                r++;
            }
            return l;
        }
    }

    class balckWhiteBalls{
        class Solution {
            public long minimumSteps(String s) {
                long swap = 0;
                long black = 0;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)=='1')
                        black++;
                    else
                        swap += (long) black;
                }
                return swap;
            }
        }
        }
    class Longest common prefix{
        class Solution {
            public String longestCommonPrefix(String[] v) {
                StringBuilder ans = new StringBuilder();
                Arrays.sort(v);
                String first = v[0];
                String last = v[v.length-1];
                for (int i=0; i<Math.min(first.length(), last.length()); i++) {
                    if (first.charAt(i) != last.charAt(i)) {
                        return ans.toString();
                    }
                    ans.append(first.charAt(i));
                }
                return ans.toString();
            }
        }
    }


