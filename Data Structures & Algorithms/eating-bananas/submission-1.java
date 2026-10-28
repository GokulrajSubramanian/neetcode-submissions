class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = piles[0];
        for(int pile : piles){
            if(pile>maxPiles){
                maxPiles=pile;
            }
        }
        int left=1;
        int right = maxPiles;
        int minReturn=maxPiles;
        while(left<=right){
            int midSpeed= left+(right-left)/2;
            long hoursNeeded=0;
            for(int pile :piles){
                hoursNeeded += pile/midSpeed;
                int remaining = pile%midSpeed;
                if(remaining>0){
                    hoursNeeded++;
                }
                
            }
            if(hoursNeeded>h){
                left=midSpeed+1;
            }else{
                minReturn = midSpeed;
                right=midSpeed-1;
            }
        }
        return minReturn;
    }
}
