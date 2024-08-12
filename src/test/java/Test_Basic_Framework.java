import org.junit.jupiter.api.*;

public class Test_Basic_Framework {


    @Test
    public void Test_Penjumlahan(){
        System.out.println("Test Case 1 : Penjumlahan Positive Number");
        Assertions.assertEquals(15,5+10);
        System.out.println("Test Case 2: Penjumlahan Negative Number");
        Assertions.assertEquals(-10,-3 +-7);
        System.out.println("Test Case 3: Penjumlahan Positive dan Negative Number");
        Assertions.assertEquals(3,8 + -5);
        System.out.println("Test Case 4: Penjumlahan Negative dan Positive Number");
        Assertions.assertEquals(-2, -5 + 3);
        System.out.println("Test Case 5: Penjumlahan dengan Zero Number ");
        Assertions.assertEquals(12, 0 + 12);
        System.out.println("Test Case 6: Penjumlahan dengan Large Number");
        Assertions.assertEquals(3000000,1000000 + 2000000);


    }
}
