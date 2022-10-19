public class test {
    public static void main(String[] args) {
        String a = "홍길동";
        String b = "박진석";
        // b > a
        
        String aa = "가";
        String bb = "각";
        // aa > bb

        String aaa = "엄준식";
        String bbb = "엄장식";
        // bbb > aaa

        int a_b = a.compareTo(b);
        int aa_bb = aa.compareTo(bb);
        int aaa_bbb = aaa.compareTo(bbb);

        System.out.printf("%d, %d, %d \n", a_b, aa_bb, aaa_bbb);
        // 6712  |  -1  |  347

        System.out.println("a_b: " + ((a_b > 0) ? 1 : (a_b < 0) ? -1 : 0));
        System.out.println("aa_bb: " + ((aa_bb > 0) ? 1 : (aa_bb < 0) ? -1 : 0));
        System.out.println("aaa_bbb: " + ((aaa_bbb > 0) ? 1 : (aaa_bbb < 0) ? -1 : 0));
    }
}