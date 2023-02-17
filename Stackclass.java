import java.util.*;
class Stackclass
{
    public static void main(String args[])
    {
    Stack<Integer>stack=new Stack<>();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.empty());
    System.out.println(stack.size());
    stack.pop();
    System.out.println(stack.size());
    System.out.println(stack.peek());
    stack.clear();
    System.out.println(stack.size());
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    stack.addAll(arr);
    System.out.println(stack.size());

    }
}