package lifecycle;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanPostProcessor implements BeanPostProcessor{

	final static Logger log = Logger.getLogger(StudentBeanPostProcessor.class);

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		log.info("postProcessAfterInitialization(Object="+arg0+", String="+arg1+")");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		log.info("postProcessBeforeInitialization(Object="+arg0+", String="+arg1+")");
		return arg0;
	}

}

