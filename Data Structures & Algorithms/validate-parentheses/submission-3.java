class Solution {
    public boolean isValid(String s) {

        List<String> arrList = Arrays.asList(")", "}", "]");
        HashMap<String, String> set = new HashMap<>();
        set.put(")", "(");
        set.put("}", "{");
        set.put("]", "[");

        String[] strArr = s.split("");
        Stack<String> stk = new Stack<>();

        for(String par : strArr) {
            if(arrList.contains(par)) {
                // System.out.println("stack ---- " + stk.isEmpty() + " ----- " + stk.peek() + " ------ " + set.get(par));

                if(!stk.isEmpty() && stk.pop().equals(set.get(par))) {
                    continue;
                }else return false;
            } else stk.push(par);
        }
        if(stk.isEmpty())
            return true;
        else return false;
    }
}
