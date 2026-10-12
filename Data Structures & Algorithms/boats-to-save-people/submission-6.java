class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int max = Arrays.stream(people).max().getAsInt();
        int[] pax = new int[max+1];

        for(int p: people){
            pax[p]++;
        }

        int idx = 0, i=0;
        while(i<pax.length){
            while(pax[i] != 0){
                people[idx++] = i;
                pax[i]--;
            }
            i++;
        }
        
        int l = 0, r = people.length-1, res = 0;
        while(l<=r){
            int remain = limit - people[r];
            res += 1;
            if(l<=r && remain >= people[l]){
                l++;
            }
            r--;
        }

        return res;

    }
}