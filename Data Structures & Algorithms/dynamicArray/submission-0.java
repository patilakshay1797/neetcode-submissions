class DynamicArray {

    private Integer[] arr;
    public DynamicArray(int capacity) {
        arr = new Integer[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == arr.length) {
            resize();
        }
        arr[getSize()] = n;
    }

    public int popback() {
        int indexOfLastEle = getSize() - 1;
        int ele = arr[indexOfLastEle];
        arr[indexOfLastEle] = null;
        return ele;
    }

    private void resize() {
        Integer[] copyArr = new Integer[2 * arr.length];
        for(int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        arr = copyArr;
    }

    public int getSize() {
        int noCount = 0;
        for(Integer num : arr) {
            if(num != null) {
                noCount++;
            }
        }
        return noCount;
    }

    public int getCapacity() {
        return arr.length;
    }
}
