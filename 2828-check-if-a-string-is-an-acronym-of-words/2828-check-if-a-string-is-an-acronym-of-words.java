class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        return checkAcro(words,s,0);
    }
    public boolean checkAcro(List<String>words,String s,int i){
        if(i==words.size()){
            return true;
        }
        if(words.get(i).charAt(0)!=s.charAt(i)){
            return false;
        }
        return checkAcro(words,s,i+1);
    }
    
}