// import java.util.Stack;

class Demo{
    public static void main(String[] args) {
        String str = "()))((";
        int count = minimumAdd(str);
        System.out.println(count);
    }

    public static int minimumAdd(String str){
        int open = 0;
        int add = 0;

        for(char ch : str.toCharArray()){
            if(ch == '('){
                open++;
            }
            else{
                if(open == 0){
                    add++;
                }
                else{
                    open--;
                }
            }
        }
        return add + open;
    }
}