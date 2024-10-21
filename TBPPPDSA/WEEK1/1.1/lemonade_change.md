```java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        for(int j=0;j<bills.length;j++){
            if(bills[j]==5){
                a++;
            }
            else if(bills[j]==10){
                if(a>0) {
                    a--;
                    b++;
                    }
                else return false;
            }else {
                if(a>0&&b>0){
                a--;
                b--;
                }else if(a>2){
                    a-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
```