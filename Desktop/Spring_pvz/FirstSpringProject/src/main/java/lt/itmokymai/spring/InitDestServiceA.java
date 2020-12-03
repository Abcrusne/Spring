package lt.itmokymai.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class InitDestServiceA implements BeanPostProcessor, DestructionAwareBeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("BeforeInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("AfterInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		System.out.println("Pre destruction : " + beanName);

	}

	@Override
	public boolean requiresDestruction(Object bean) {
		// TODO Auto-generated method stub
		return false;
	}
}