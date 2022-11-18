/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.portal.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.controller.OmsPortalOrderController;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import com.macro.mall.portal.service.OmsPortalOrderService;
import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OmsPortalOrderController_SSTest extends OmsPortalOrderController_SSTest_scaffolding {
// allCoveredLines:[26, 34, 35, 42, 43, 51, 52, 63, 64, 71, 72, 83, 84, 91, 92, 99, 100, 107, 108, 115, 116]

  @Test(timeout = 4000)
  public void test_cancelOrder_0()  throws Throwable  {
      //caseID:a4c2be5e1c087a4f327c3a51f4236cf5
      //CoveredLines: [26, 71, 72]
      //Input_0_Long: 1L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1L);
      
      //Call method: cancelOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_cancelTimeOutOrder_1()  throws Throwable  {
      //caseID:4053e0b64df5ddc5ac9eb9d23fe45478
      //CoveredLines: [26, 63, 64]
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      
      //Call method: cancelTimeOutOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelTimeOutOrder();
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_cancelUserOrder_2()  throws Throwable  {
      //caseID:f8155c8c8dfa0454ea6aa2cf97443777
      //CoveredLines: [26, 99, 100]
      //Input_0_Long: 249L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(249L);
      
      //Call method: cancelUserOrder
      CommonResult commonResult0 = omsPortalOrderController0.cancelUserOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_confirmReceiveOrder_3()  throws Throwable  {
      //caseID:c6db5d7c17e2997adecc397b1bf71910
      //CoveredLines: [26, 107, 108]
      //Input_0_Long: 1378L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1378L);
      
      //Call method: confirmReceiveOrder
      CommonResult commonResult0 = omsPortalOrderController0.confirmReceiveOrder(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_deleteOrder_4()  throws Throwable  {
      //caseID:89e666803d921e2c1026790df2d1bf46
      //CoveredLines: [26, 115, 116]
      //Input_0_Long: 1041L
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(1041L);
      
      //Call method: deleteOrder
      CommonResult commonResult0 = omsPortalOrderController0.deleteOrder(long0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_detail_5()  throws Throwable  {
      //caseID:979e430ffb5179231a073de39c0d0b84
      //CoveredLines: [26, 91, 92]
      //Input_0_Long: 0L
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(0L);
      
      //Call method: detail
      CommonResult<OmsOrderDetail> commonResult0 = omsPortalOrderController0.detail(long0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_generateConfirmOrder_6()  throws Throwable  {
      //caseID:2a039caf5860047e5aae2bc2b47c7696
      //CoveredLines: [26, 34, 35]
      //Input_0_List<Long>: arrayList0
      //Assert: assertEquals("\u64CD\u4F5C\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock confirmOrderResult0
      ConfirmOrderResult confirmOrderResult0 = mock(ConfirmOrderResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(confirmOrderResult0).when(omsPortalOrderService0).generateConfirmOrder(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      
      //Call method: generateConfirmOrder
      CommonResult<ConfirmOrderResult> commonResult0 = omsPortalOrderController0.generateConfirmOrder(arrayList0);
      
      //Test Result Assert
      assertEquals("\u64CD\u4F5C\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_generateOrder_7()  throws Throwable  {
      //caseID:343124a6f59f84b573cb135cdbb6f258
      //CoveredLines: [26, 42, 43]
      //Input_0_OrderParam: {}
      //Assert: assertEquals("\u4E0B\u5355\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      //mock orderParam0
      OrderParam orderParam0 = mock(OrderParam.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: generateOrder
      CommonResult commonResult0 = omsPortalOrderController0.generateOrder(orderParam0);
      
      //Test Result Assert
      assertEquals("\u4E0B\u5355\u6210\u529F", commonResult0.getMessage());
  }

  @Test(timeout = 4000)
  public void test_list_8()  throws Throwable  {
      //caseID:df177bdc5e95613f1bf8df73971fefe5
      //CoveredLines: [26, 83, 84]
      //Input_0_Integer: 1735
      //Input_1_Integer: 1735
      //Input_2_Integer: 1735
      //Assert: assertEquals(200L, method_result.getCode());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Integer integer0 = new Integer(1735);
      
      //Call method: list
      CommonResult<CommonPage<OmsOrderDetail>> commonResult0 = omsPortalOrderController0.list(integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_paySuccess_9()  throws Throwable  {
      //caseID:5f2fb1ace0c521dcf86361d93b671d3f
      //CoveredLines: [26, 51, 52]
      //Input_0_Long: 2034L
      //Input_1_Integer: 1
      //Assert: assertEquals("\u652F\u4ED8\u6210\u529F", method_result.getMessage());
      
      OmsPortalOrderController omsPortalOrderController0 = new OmsPortalOrderController();
      //mock omsPortalOrderService0
      OmsPortalOrderService omsPortalOrderService0 = mock(OmsPortalOrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) OmsPortalOrderController.class, omsPortalOrderController0, "portalOrderService", (Object) omsPortalOrderService0);
      Long long0 = new Long(2034L);
      Integer integer0 = new Integer(1);
      
      //Call method: paySuccess
      CommonResult commonResult0 = omsPortalOrderController0.paySuccess(long0, integer0);
      
      //Test Result Assert
      assertEquals("\u652F\u4ED8\u6210\u529F", commonResult0.getMessage());
  }
}
