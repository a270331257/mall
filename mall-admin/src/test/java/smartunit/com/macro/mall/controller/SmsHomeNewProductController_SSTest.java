/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.controller.SmsHomeNewProductController;
import com.macro.mall.model.SmsHomeNewProduct;
import com.macro.mall.service.SmsHomeNewProductService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SmsHomeNewProductController_SSTest extends SmsHomeNewProductController_SSTest_scaffolding {
// allCoveredLines:[22, 30, 31, 32, 34, 41, 42, 43, 45, 52, 53, 54, 56, 63, 64, 65, 67, 77, 78]

  @Test(timeout = 4000)
  public void test_create_0()  throws Throwable  {
      //caseID:af7b88bd3d6c676b38758e234b7de105
      //CoveredLines: [22, 30, 31, 32]
      //Input_0_List<SmsHomeNewProduct>: linkedList0
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(28).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      LinkedList<SmsHomeNewProduct> linkedList0 = new LinkedList<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(linkedList0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_create_1()  throws Throwable  {
      //caseID:b40002c6c0125093292afcfdc781fe58
      //CoveredLines: [22, 30, 31, 34]
      //Input_0_List<SmsHomeNewProduct>: stack0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).create(ArgumentMatchers.<com.macro.mall.model.SmsHomeNewProduct>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<SmsHomeNewProduct> stack0 = new Stack<SmsHomeNewProduct>();
      
      //Call method: create
      CommonResult commonResult0 = smsHomeNewProductController0.create(stack0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_2()  throws Throwable  {
      //caseID:8e8d7f16e1ca03139ea284b820bd6c42
      //CoveredLines: [22, 52, 53, 54]
      //Input_0_List<Long>: arrayList0
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(smsHomeNewProductService0).delete(ArgumentMatchers.<java.lang.Long>anyList());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(arrayList0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_delete_3()  throws Throwable  {
      //caseID:592aeb69c9a83baaa1ae2afec4c9b2da
      //CoveredLines: [22, 52, 53, 56]
      //Input_0_List<Long>: stack0
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Stack<Long> stack0 = new Stack<Long>();
      
      //Call method: delete
      CommonResult commonResult0 = smsHomeNewProductController0.delete(stack0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:23997450546e05a9de2331195279281c
      //CoveredLines: [22, 77, 78]
      //Input_0_String: 1.0
      //Input_1_Integer: 1
      //Input_2_Integer: 1
      //Input_3_Integer: 1
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      Vector<SmsHomeNewProduct> vector0 = new Vector<SmsHomeNewProduct>();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(vector0).when(smsHomeNewProductService0).list(anyString() , anyInt() , anyInt() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Integer integer0 = new Integer(1);
      
      //Call method: list
      CommonResult<CommonPage<SmsHomeNewProduct>> commonResult0 = smsHomeNewProductController0.list("1.0", integer0, integer0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_5()  throws Throwable  {
      //caseID:a75f39998e9a6b9f7c5014009d2c5caa
      //CoveredLines: [22, 63, 64, 67]
      //Input_0_List<Long>: arrayList0
      //Input_1_Integer: (-27)
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-27)).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      ArrayList<Long> arrayList0 = new ArrayList<Long>();
      Integer integer0 = new Integer((-27));
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(arrayList0, integer0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateRecommendStatus_6()  throws Throwable  {
      //caseID:c6d4720144287b79268b3da780b9a5b8
      //CoveredLines: [22, 63, 64, 65]
      //Input_0_List<Long>: linkedList0
      //Input_1_Integer: (-1)
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1373).when(smsHomeNewProductService0).updateRecommendStatus(ArgumentMatchers.<java.lang.Long>anyList() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Integer integer0 = new Integer((-1));
      
      //Call method: updateRecommendStatus
      CommonResult commonResult0 = smsHomeNewProductController0.updateRecommendStatus(linkedList0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateSort_7()  throws Throwable  {
      //caseID:9247c48cf9d60eeea0f1967c352acb5e
      //CoveredLines: [22, 41, 42, 43]
      //Input_0_Long: 40
      //Input_1_Integer: 40
      //Assert: assertEquals(200L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(40).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long(40);
      Integer integer0 = new Integer(40);
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals(200L, commonResult0.getCode());
  }

  @Test(timeout = 4000)
  public void test_updateSort_8()  throws Throwable  {
      //caseID:ac351f12f8c147824ba56fab11ab4efd
      //CoveredLines: [22, 41, 42, 45]
      //Input_0_Long: (-1)
      //Input_1_Integer: (-1)
      //Assert: assertEquals(500L, method_result.getCode());
      
      SmsHomeNewProductController smsHomeNewProductController0 = new SmsHomeNewProductController();
      //mock smsHomeNewProductService0
      SmsHomeNewProductService smsHomeNewProductService0 = mock(SmsHomeNewProductService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(smsHomeNewProductService0).updateSort(anyLong() , anyInt());
      
      PrivateAccess.setVariable((Class<?>) SmsHomeNewProductController.class, smsHomeNewProductController0, "homeNewProductService", (Object) smsHomeNewProductService0);
      Long long0 = new Long((-1));
      Integer integer0 = new Integer((-1));
      
      //Call method: updateSort
      CommonResult commonResult0 = smsHomeNewProductController0.updateSort(long0, integer0);
      
      //Test Result Assert
      assertEquals(500L, commonResult0.getCode());
  }
}
