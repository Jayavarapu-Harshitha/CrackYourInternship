class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       String newStrs[]=new String[strs.length];
        List<List<String>> output=new ArrayList<>();
        Map<String,List> map=new HashMap<>();
        for(String str:strs)
        {
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String newStr=String.valueOf(ch);
            if(!map.containsKey(newStr))
            {
                List list=new ArrayList<>();
                list.add(str);
                map.put(newStr,list);
            }
            else
            {
                List list=map.get(newStr);
                list.add(str);
                map.put(newStr,list);
            }
            
        }
        for(List list:map.values())
            output.add(list);
    
        return output;
} 
}
