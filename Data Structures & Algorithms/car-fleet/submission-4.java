class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 0) return 0;
        if(position.length == 1) return 1;
        int[] sortedPos = Arrays.stream(position)
                         .boxed()
                         .sorted(Comparator.reverseOrder())
                         .mapToInt(Integer::intValue)
                         .toArray();

        
        int startPos = sortedPos[0];
        double minHours = (double)(target - sortedPos[0]) / speed[IntStream.range(0, position.length)
                     .filter(i -> position[i] == startPos)
                     .findFirst()
                     .orElse(-1)];
        int totalFleets = 1;

        for(int i = 1; i < sortedPos.length; i++) {
            int currI = sortedPos[i];
            double hours = (double)(target - sortedPos[i]) / speed[IntStream.range(0, position.length)
                     .filter(j -> position[j] == currI)
                     .findFirst()
                     .orElse(-1)];
            
            if(hours > minHours) {
                totalFleets++;
                minHours = hours;
            }
        }
        return totalFleets;
    }
}