class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1) return Integer.parseInt(tokens[0]);
        Stack<Integer> stk = new Stack<>();
        int result = 0;
        boolean isStarted = false;

        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].matches("-?[0-9]+")) {
                stk.push(Integer.valueOf(tokens[i]));
            }
            else {
                System.out.println(i);
                
                    result = stk.pop();
                    isStarted = true;
                
                int second = stk.pop();
                switch(tokens[i]) {
                    
                    case "+" -> result = result + second;
                    case "-" -> result = second - result;
                    case "*" -> result = second * result;
                    case "/" -> result = second / result;
                    default -> System.out.println("worng expression");
                }
                stk.push(result);
            }
        }
        return result;
    }
}
