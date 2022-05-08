class Solution {
    public int calculate(String s) {
        Stack<Integer> stck = new Stack<Integer>();
        char op = '+';
        int res=0, num=0, len = s.length();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
                if(Character.isDigit(c)){
                    num*=10;
                    num+=c-'0';
                }
                if((!Character.isDigit(c) && c!=' ')||i==len-1){
                    if(op == '+'){
                        stck.push(num);
                    }else if(op == '-'){
                        stck.push(-num);
                    }else if(op == '*'){
                        stck.push(stck.pop()*num);
                    }else if(op == '/'){
                        stck.push(stck.pop()/num);
                    }
                    num = 0;
                    op = c;
                }
        }
        while(!stck.isEmpty()){
            res+=stck.pop();
        }
        return res;
    }
}
