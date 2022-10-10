/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoy.mathutil.core;

import com.khoy.mathutil.core.MathUtil;
import static com.khoy.mathutil.core.MathUtil.getFactorial;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import static ...... tên-class.tênhàm; thì sau này
//khi gọi hàm static bỏ luôn tên class chấm, hiểu ngầm tên class
//code gọi như hàm của c
//.* là đại diện cho tất cả các hàm static trong class

/**
 *
 * @author Admin
 */
//kĩ thuật DDT - data driven testing
//tránh nhầm với TDD - test driven development
//DDT: kĩ thuật tổ chức các test cases cho gọn gàng
//tách các câu lệnh kiểm thử và bộ data dùng để test riêng ra 2 nơi
//phiên bản test junit vừa học đang trộn data test và gọi hàm
//lẫn lộn với nhau, ko sai nhưng ko rõ ràng
//kĩ thuật đẩy data ra 1 chỗ khác, lát hồi nhồi ngược lại
//chỗ gọi hàm, kĩ thuật này gọi là DTT
//viết test case theo kiểu hướng về tách data cho dễ đọc, còn gọi là PARAMETERIZED TESTING
@RunWith(value = Parameterized.class)
public class MathUtilDTTest {

    //chuẩn bị data để nhồi vào hàm test
    //quy ước hàm chuẩn bị data phải là static - nằm ở 1 chỗ cố định
    //trong ram để object nào cũng thấy dc
    @Parameterized.Parameters
    public static Object[] initData() {
        int a[] = { 5,
                    10,
                    15,
                    20

        };
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 7720}
        };
    }
    
    @Parameterized.Parameter(value = 0)//map biến này vào cột 0
    public int n;
    @Parameterized.Parameter(value = 1)//map biến này vào cột 1
    public long expected;    //2 biến này sẽ map vào 2 cột tương ứng
    //của hàm initData
    //sau đó ta nhồi 2 biến này vào trong hàm
    //assertEquals() như cũ
    
    @Test //xài data từ 2 biến trên và chạy compare
    public void testFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, getFactorial(n));
    }
}

//kết luận chung cho xanh đỏ:
//xanh: khi tất cả các case, tình huống đều phải xanh
//đỏ: chỉ cần 1 th đỏ, tất cả là đỏ
//xanh: mệnh đề and, xanh khi tất cùng xanh
//đỏ: mệnh đề or, chỉ có 1 th đỏ, cả đám đỏ
