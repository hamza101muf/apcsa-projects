public class Test {
    public static void main(String[] args) {
        Code code = new Code("turtles are cool" + "I like people");
        code.hide(1, 3);
        System.out.println(code.getCode());
        code.recover(2,6);
        System.out.println(code.getCode());
    }
}
