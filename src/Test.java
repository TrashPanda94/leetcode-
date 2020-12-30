import org.junit.jupiter.api.Assertions;


public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        Solution  s = new Solution();
        Assertions.assertEquals(3,s.lengthOfLongestSubstring("pwwkew"));
    }

}
