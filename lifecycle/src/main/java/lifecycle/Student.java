package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,
InitializingBean,DisposableBean{

	final static Logger log = Logger.getLogger(Student.class);
	
	private int id;
	private String name;

	public Student(int id, String name) {
		log.info("Student(id="+id+",name="+name+")");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		log.info("setId(id="+id+")");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		log.info("setName(name="+name+")");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	/**
	 * 
	 */
	public void setBeanName(String arg0) {
		log.info("setBeanName(name="+arg0+")");
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		log.info("setBeanFactory(beanFactory="+arg0+")");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		log.info("setApplicationContext(applicationContext="+applicationContext+")");
	}
	
	/**
	 * 
	 */
	public void initMethod(){
		log.info("initMethod()");
	}
	
	public void destroyMethod(){
		log.info("destroyMethod()");
	}

	/**
	 * 
	 */
	@PostConstruct
	public void postContructMethod(){
		log.info("postContructMethod()");
	}

	@PreDestroy
	public void preDestroyMethod(){
		log.info("preDestroyMethod()");
	}

	
	/**
	 * 
	 */
	public void afterPropertiesSet() throws Exception {
		log.info("afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		log.info("destroy()");
	}
	
}

