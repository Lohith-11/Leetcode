class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0;
        int count=0;
        for(int i=0;i<players.length;i++){
            if(j==trainers.length){
                return count;
            }
            if(players[i]<=trainers[j]){
                count++;
                j++;
            }else{
                j++;
                i--;
            }
        }
        return count;
    }
}