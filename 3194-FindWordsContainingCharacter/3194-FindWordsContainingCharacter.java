// Last updated: 13/08/2026, 09:22:30
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }
}