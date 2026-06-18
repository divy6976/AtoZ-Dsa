class Solution {
    public double angleClock(int hour, int minutes) {

        double angle = 0.5 * Math.abs(60 * hour - 11 * minutes);
        double ans=Math.min(360 - angle,angle);

        return ans;
        
    }
}