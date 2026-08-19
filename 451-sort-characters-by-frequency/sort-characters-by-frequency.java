class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        String ans="";
        int count=0;
        for(count=s.length();count>0;count--){
            for(int i=0;i<128;i++){
                if(freq[i]==count){
                    for(int j=0;j<count;j++){
                        ans+=(char)i;
                    }
                }
            }
        }
        return ans;
        
    }
}