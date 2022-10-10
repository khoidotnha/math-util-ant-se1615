/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoy.mathutil.main;

import com.khoy.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Kĩ thuật 1 - dùng mắt luận kết quả - manual test
        //Gọi hàm với giá trị đầu vào chuẩn bị sẵn ở test case
        //in ra kết quả, dùng mắt kết luận đúng sai giữa EXPECTED vs ACTUAL
        //in ra kết quả xử lí của hàm theo
        // - sout()
        // - log file (môn Java Web)
        // - popup kết quả xử lí( Window Form/Desktop app, output ra trang web
        
        //kĩ thuật manual test dùng sout() -> CHÍNH LÀ CÁCH TA LÀM UNIT TESTING
        //TEST CASE #1: input n = 0; expected == 0; thực tế là
        long expectedValue = 1;//hy vọng hàm trả về 1
        long actualValue = MathUtil.getFactorial(0);
        System.out.println("TEST 0! expected = " + expectedValue + 
                                               " | actual = " + actualValue);
        
        //TEST CASE #2: input n = 1; hy vọng hàm trả về 1
        expectedValue = 1;
        actualValue = MathUtil.getFactorial(1);
        System.out.println("TEST 1! expected = " + expectedValue + 
                                               " | actual = " + actualValue);
        
        //TEST CASE #3: input n = 5; hy vọng hàm trả về 120
        expectedValue = 120;
        actualValue = MathUtil.getFactorial(5);
        System.out.println("TEST 5! expected = " + expectedValue + 
                                               " | actual = " + actualValue);
        
        //TEST CASE #4: input n = -5; hy vọng bị chửi!! 
        //n must be between 0..20
        System.out.println("See the Illegal Argument Exception if n = -5");
        MathUtil.getFactorial(-5);
        
        //VIỆC KẾT LUẬN HÀM ĐÚNG/SAI THÌ MẮT TA PHẢI DUYỆT QUA TỪNG CẶP
        //EXPECTED = ACTUAL HAY KO?? VÀ DUYỆT HẾT MỚI DÁM KẾT LUẬN
        //HƠI MẤT SỨC, DỄ SAI SÓT NẾU CÓ NHIỀU CASE TEST KHÁC NHAU
        //NẾU MÁY LÀM GIÙM LUÔN PHẦN MẤT SỨC NÀY -> TEST AUTOMATION
        //MÁY QUÉT QUA HẾT CÁC CẶP EXPECTED VÀ ACTUAL VÀ CHỐT DEAL!
        //CÂU: ĐÚNG, SAI!!
        //NHỜ TRÒ NÀY -> TỰ ĐỘNG HÓA DC VIỆC KIỂM SOÁT CHẤT LƯỢNG CODE
        //THẰNG DEV NÀO MÀ SỬA CODE, ÔNG CHỈ QUÉT 1 LƯỢT -> KẾT LUẬN LUÔN
        //LỖI CỦA CI - CONTINOUS INTEGRATION - TÍCH HỢP LIÊN TỤC
    }
    
}

//để test 1 hàm hay 1 method hay 1 class có những pp/cách thức cụ thể sau
//1. TEST DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
// - TRÂU BÒ DÙNG SỨC - MANUAL TEST; BẮT TRUYỀN THỐNG

//2. DÙNG MẮT XEM 2 MÃ MÀU XANH ĐỎ LÀ ĐỦ
// - XANH: HÀM ĐÚNG; ĐỎ: HÀM SAI( so sánh EXPECTED vs ACTUAL)
// - TEST AUTOMATION: KĨ THUẬT HIỆN ĐẠI HƠN, ĐỠ DÙNG SỨC ĐỂ LUẬN KẾT QUẢ
// 