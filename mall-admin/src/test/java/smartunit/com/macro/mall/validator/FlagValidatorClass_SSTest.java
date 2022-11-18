/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.macro.mall.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.macro.mall.validator.FlagValidator;
import com.macro.mall.validator.FlagValidatorClass;
import javax.validation.ConstraintValidatorContext;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FlagValidatorClass_SSTest extends FlagValidatorClass_SSTest_scaffolding {
// allCoveredLines:[10, 14, 15, 19, 20, 22, 24, 25, 26, 27, 30]

  @Test(timeout = 4000)
  public void test_initialize_0()  throws Throwable  {
      //caseID:ab9afa09f947972605505ca99f3cc902
      //CoveredLines: [10, 14, 15]
      //Input_0_FlagValidator: {}
      
      FlagValidatorClass flagValidatorClass0 = new FlagValidatorClass();
      //mock flagValidator0
      FlagValidator flagValidator0 = mock(FlagValidator.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: initialize
      flagValidatorClass0.initialize(flagValidator0);
  }

  @Test(timeout = 4000)
  public void test_isValid_1()  throws Throwable  {
      //caseID:8d1bd1a7b348c91ffc692166d0e326c1
      //CoveredLines: [10, 19, 20, 22]
      //Input_0_Integer: null
      //Input_1_ConstraintValidatorContext: {}
      //Assert: assertTrue(method_result);
      
      FlagValidatorClass flagValidatorClass0 = new FlagValidatorClass();
      //mock constraintValidatorContext0
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: isValid
      boolean boolean0 = flagValidatorClass0.isValid((Integer) null, constraintValidatorContext0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isValid_2()  throws Throwable  {
      //caseID:da84b2f09df167665590661040f77ee6
      //CoveredLines: [10, 19, 20, 24, 25, 30]
      //Input_0_Integer: (-1432583002)
      //Input_1_ConstraintValidatorContext: {}
      //Assert: assertFalse(method_result);
      
      FlagValidatorClass flagValidatorClass0 = new FlagValidatorClass();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1";
      
      PrivateAccess.setVariable((Class<?>) FlagValidatorClass.class, flagValidatorClass0, "values", (Object) stringArray0);
      Integer integer0 = new Integer((-1432583002));
      //mock constraintValidatorContext0
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: isValid
      boolean boolean0 = flagValidatorClass0.isValid(integer0, constraintValidatorContext0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isValid_3()  throws Throwable  {
      //caseID:7d4a3b10e1c73feb25b3d72c0cb7b9f9
      //CoveredLines: [10, 19, 20, 24, 25, 26, 27, 30]
      //Input_0_Integer: 0
      //Input_1_ConstraintValidatorContext: {}
      //Assert: assertTrue(method_result);
      
      FlagValidatorClass flagValidatorClass0 = new FlagValidatorClass();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "1";
      stringArray0[1] = "com.macro.mall.validator.FlagValidatorClass";
      stringArray0[2] = ".andThen(";
      stringArray0[3] = "XvccUDKj15B@";
      stringArray0[4] = "0";
      
      PrivateAccess.setVariable((Class<?>) FlagValidatorClass.class, flagValidatorClass0, "values", (Object) stringArray0);
      Integer integer0 = new Integer(0);
      //mock constraintValidatorContext0
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: isValid
      boolean boolean0 = flagValidatorClass0.isValid(integer0, constraintValidatorContext0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_isValid_4()  throws Throwable  {
      //caseID:7e5643b3c532782e56e9f8affa744769
      //CoveredLines: [10, 19, 20, 24, 25, 26, 27, 30]
      //Input_0_Integer: 0
      //Input_1_ConstraintValidatorContext: {}
      //Assert: assertTrue(method_result);
      
      FlagValidatorClass flagValidatorClass0 = new FlagValidatorClass();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "0";
      
      PrivateAccess.setVariable((Class<?>) FlagValidatorClass.class, flagValidatorClass0, "values", (Object) stringArray0);
      Integer integer0 = new Integer(0);
      //mock constraintValidatorContext0
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: isValid
      boolean boolean0 = flagValidatorClass0.isValid(integer0, constraintValidatorContext0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }
}
