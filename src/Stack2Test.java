public class Stack2Test {
    public static void main(String[] args) {
        Stack2 <Integer>st=new Stack2();
        st.push(5);
        st.push(1);
        st.push(9);
        st.push(10);
        st.pop();

        for (int a:st)
        {
            System.out.println(a);
        }
    }
}
