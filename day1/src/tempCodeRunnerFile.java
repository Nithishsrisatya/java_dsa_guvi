import java.util.*;
public class tempCodeRunnerFile {
    static List<Integer> arr;
    public tempCodeRunnerFile() {
        arr = new ArrayList<>();
    }
    public void offer(int val){
        arr.add(val);
        heapifyUp(arr.size() - 1);
    }
    public int peek(){
        return arr.get(0);
    }
    public int poll(){
        int result = peek();
        swap(0,arr.size() - 1);
        arr.removeLast();
        heapifyDown(0);
        return result;
    }
    public void heapifyDown(int nodeIndex){
        int left = 2 * nodeIndex +1;
        int right = 2 * nodeIndex +2;
        int smallest = nodeIndex;
        if(left < arr.size() && arr.get(left) < arr.get(smallest)){
            smallest = left;     
        }
        if(right < arr.size() && arr.get(right) < arr.get(smallest)){
            smallest = right;
        }
        if(smallest != nodeIndex){
            swap(nodeIndex, smallest);
            heapifyDown(smallest);
        }
    }
    private void swap(int i, int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public void heapifyUp(int nodeIndex){
        int parentIndex = (nodeIndex - 1)/2;
        if(arr.get(nodeIndex) < arr.get(parentIndex)){
            swap(nodeIndex, parentIndex);
            heapifyUp(parentIndex);
        }
    }
    public void buildHeap(List<Integer> newArr){
        arr = newArr;
        for(int i = (arr.size() / 2) - 1; i >= 0; i--){
            heapifyDown(i);
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        tempCodeRunnerFile minHeap = new tempCodeRunnerFile();
        int n = obj.nextInt();
        for(int i = 0; i < n; i++){
            String operation = obj.next();
            if(operation.equals("insert")){
                int value = obj.nextInt();
                minHeap.offer(value);
            } else if(operation.equals("extractMin")){
                System.out.println(minHeap.poll());
            } else if(operation.equals("heapify")){
                int k = obj.nextInt();
                List<Integer> newArr = new ArrayList<>();
                for(int j = 0; j < k; j++){
                    newArr.add(obj.nextInt());
                }
                minHeap.buildHeap(newArr);
            }
        }
        obj.close();
    }
}
