class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("tum bin lagta nhi: ");

        sb.append("hum kya kre");        // append at last
        System.out.println("After append: " + sb);

        sb.insert(0, "ye dil");    // insert at beginning
        System.out.println("After insert: " + sb);

        sb.reverse();                     // reverse whole string
        System.out.println("After reverse: " + sb);
    }
}