public class Code {
    private String myCode;
    private String part1;

    public Code(String code) {
        myCode = code;
        part1 = code;
    }
    public String getCode() {
        return part1;
    }
    public void hide(int p1, int p2) {
        for (int i = p1; i <= p2; i++) {
            part1 = part1.substring(0, i) + "*";
            if (part1.length()!=myCode.length()) {
                part1 = part1 + myCode.substring(i+1);
            }   

        }
    }
    public void recover(int p1, int p2) {
        if (!part1.substring(p1,p2+1).equals(myCode.substring(p1,p2+1)))
            part1 = part1.substring(0, p1) + myCode.substring(p1, p2+1) + part1.substring(p2+1);;
    }
}
