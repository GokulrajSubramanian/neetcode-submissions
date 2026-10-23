class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int len = position.length;
        int[][] arr = new int[len][2];
        for(int i=0; i<len; i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr, (a,b)->Integer.compare(b[0],a[0]));
        double recentFleetTime=0;
        int numOfFleet=0;
        for(int i=0; i<len;i++){
            double currFleetTime = (double)(target-arr[i][0])/arr[i][1];
            if(currFleetTime>recentFleetTime){
                numOfFleet++;
                recentFleetTime=currFleetTime;
            }
        }
        return numOfFleet;
    }
}
