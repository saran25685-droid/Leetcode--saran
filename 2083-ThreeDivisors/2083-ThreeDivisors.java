// Last updated: 13/08/2026, 09:23:00
class Solution {
    public boolean isThree(int n) {
       int a = 0; 
     for(int i =1;i<=n;i++){
        if(n % i == 0){
            a++;
        }
     }   if(a == 3){
        return true;
     }else{
        return false;
     }
    }
}