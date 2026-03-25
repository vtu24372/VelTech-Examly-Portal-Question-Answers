import java.util.*;

class PostFixAndPreFix{
    
    static int p(char c){
        if(c=='^') return 3;
        if(c=='*' || c=='/') return 2;
        if(c=='+' || c=='-') return 1;
        return -1;
    }

    static boolean isOp(char c){
        return Character.isLetterOrDigit(c);
    }

    static String fix(String s){
        String r = "";
        for(int i=0; i<s.length(); i++){
            r+=s.charAt(i);

            if(i<s.length()-1){
                char a = s.charAt(i) , b = s.charAt(i+1);
                if((a==')' && isOp(b)) || (isOp(a) && b=='('))
                    r +='*';
            }
        }
        return r;
    }

    static String postFix(String s){
        Stack<Character> st = new Stack<>();
        String r = "";

        for(char c : s.toCharArray()){
            if(isOp(c)) r+=c;

        else if(c=='(') st.push(c);

        else if(c==')'){
            while(st.peek()!='(') r+=st.pop();
            st.pop();
        }

        else{
            while(!st.isEmpty() && p(c)<=p(st.peek()))
                r+=st.pop();
            st.push(c);
        }
    }
    while(!st.isEmpty()) r+=st.pop();
    return r;
}

    static String Prefix(String s){
        StringBuilder sb = new StringBuilder(s).reverse();

        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '(') sb.setCharAt(i, ')');
           else if(sb.charAt(i) == ')') sb.setCharAt(i,'(');
        }
            return new StringBuilder(postFix(sb.toString())).reverse().toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replace(" ","");

        s=fix(s);

        System.out.print(postFix(s));
    }
}