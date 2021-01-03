package com.abc.cwb.main;


import com.abc.cwb.service.TestService;
import com.abc.cwb.util.SetMethodRequiredValid;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathMain {

  public static void main(String[] args) {
      System.out.println("begin");
      ApplicationContext bean = new ClassPathXmlApplicationContext("applicationContext.xml");
      TestService testService =  bean.getBean("testService", TestService.class);
      testService.print1();
      // SingletonA singletonA = bean.getBean("singletonA", SingletonA.class);
      // singletonA.print();

      SetMethodRequiredValid setMethodRequiredValid = bean.getBean("setMethodRequiredValid", SetMethodRequiredValid.class);
      System.out.println(setMethodRequiredValid.getWmasVar());

      // MyBeanCommonUtil myBeanCommonUtil = bean.getBean("myBeanCommonUtil", MyBeanCommonUtil.class);
      // myBeanCommonUtil.print();



      // MyBeanCommonUtil commonUtil = new MyBeanCommonUtil();
      // ((ClassPathXmlApplicationContext) bean).getBeanFactory().registerSingleton("commonUtil", commonUtil);
      //
      // bean.getBean("commonUtil", MyBeanCommonUtil.class).print1();

      // GenericApplicationContext context = new GenericApplicationContext();
      // new XmlBeanDefinitionReader(context).loadBeanDefinitions("applicationContext.xml");
      // context.refresh();
      // SingletonA singletonA1 = context.getBean("singletonA", SingletonA.class);
      // singletonA1.print();

  }
}

