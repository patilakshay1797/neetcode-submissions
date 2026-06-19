class MinStack {

    ArrayList<Integer> list;
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        List<Integer> sorted = list.stream()
                                .sorted()
                                .toList();

        return sorted.get(0);
    }
}
