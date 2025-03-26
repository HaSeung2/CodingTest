class Solution {
    public int solution(int[][] sizes) {
        int minNum;

        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                minNum = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = minNum;
            }
        }
        
        int garo = sizes[0][0];
        int sero = sizes[0][1];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < sizes.length; j++){
                if(garo < sizes[j][0]){
                    garo = sizes[j][0];
                }
                if(sero < sizes[j][1]){
                    sero = sizes[j][1];
                    System.out.println(sero);
                }
            }
        }

        return garo * sero;
    }
}