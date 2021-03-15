package LeetCode;

class P1629_Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int slowestTimeIndex = 0;
        for(int i = 1; i < releaseTimes.length; i++){
            if(slowestTimeIndex == 0){
                if(releaseTimes[slowestTimeIndex] == releaseTimes[i]-releaseTimes[i-1]) {
                    if(keysPressed.charAt(slowestTimeIndex) < keysPressed.charAt(i))
                        slowestTimeIndex = i;
                } else if(releaseTimes[slowestTimeIndex] < releaseTimes[i]-releaseTimes[i-1]) {
                    slowestTimeIndex = i;
                }
            } else {
                if (releaseTimes[slowestTimeIndex] - releaseTimes[slowestTimeIndex - 1] == releaseTimes[i] - releaseTimes[i - 1]){
                    if(keysPressed.charAt(slowestTimeIndex) < keysPressed.charAt(i))
                        slowestTimeIndex = i;
                }
                else if (releaseTimes[slowestTimeIndex] - releaseTimes[slowestTimeIndex - 1] < releaseTimes[i] - releaseTimes[i - 1])
                    slowestTimeIndex = i;
            }
        }
        return keysPressed.charAt(slowestTimeIndex);
    }
}
