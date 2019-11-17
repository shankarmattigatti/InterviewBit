public class Solution {
	
    public int evalRPN(ArrayList<String> A) {   
        Stack<Integer> stack = new Stack<>();
        for (String str : A) {
            if (Character.isDigit(str.charAt(0))) {
                int n = Integer.parseInt(str);
                stack.push(n);
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (str) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
