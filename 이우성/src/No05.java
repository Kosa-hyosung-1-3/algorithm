public class No05 {
    public static void main(String[] args) {
        String input = "Hello World";
        char[] chars = input.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = (char) (chars[i] + ('A' - 'a'));
            }else if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] = (char) (chars[i] - ('A' - 'a'));
            }
        }
        System.out.println(chars);
    }
}