// Last updated: 13/08/2026, 09:21:06
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int ss=toSeconds(startTime);
        int e=toSeconds(endTime);
        return e-ss;
    }
    private int toSeconds(String time){
        String[] t=time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        return h*3600+m*60+s;
    }
}