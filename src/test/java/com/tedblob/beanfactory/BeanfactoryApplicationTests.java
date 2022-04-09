package com.tedblob.beanfactory;

import com.tedblob.beanfactory.models.SampleBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootTest
class BeanfactoryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testBeanFactoryLazyInitialization() {
		Resource res = new ClassPathResource("config.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		SampleBean sampleBean = factory.getBean(SampleBean.class);
		sampleBean.getValue();
	}
}
