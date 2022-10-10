/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoy.mathutil.core;

import com.khoy.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //@Test là 1 đánh dấu - annotation để báo với JVM
    //biết rằng hàm này là hàm main() và chạy code trong hàm này
    //nếu thiếu @Test 

    @Test
    //TEST CASE 1: n = 0; expected = 1
    //TEST CASE 2: n = 1; expected = 1
    //TEST CASE 3: n = 2; expected = 2
    //TEST CASE 4: n = 3; expected = 6
    public void testFactorialGivenRightArgumentReturnWell() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));

    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell2() {

        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }
    
    //bắt exception thì sao?
    //Test case #6: n = -5, -5! expected: hy vọng thấy ngoại lệ ném ra
    //nếu ngoại lệ xuất hiện khi tính -5!, nghĩa là hàm chạy đúng như thiết kế
    //do ngoại lệ ko phải là value kiểu long để so sánh nên cách viết khác 1 tí:
    //khi chạy -5!, EXPECTED = IllegalArgumentException
    //nghĩa là có sự xuất hiện của 1 object thuộc class IllegalArgEx
    @Test(expected = IllegalArgumentException.class)//bắt lớp con
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }

//    @Test
//    public void testGreen() {
//        Assert.assertEquals(10, 10);
//    }
}
