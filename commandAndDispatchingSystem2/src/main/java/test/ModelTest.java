package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.bean.ModelEntity;
import com.lovo.service.IModelService;

public class ModelTest {

	// 启动spring
	ClassPathXmlApplicationContext app = null;
	IModelService modelService = null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		modelService = (IModelService) app.getBean("modelService");
	}
	
	@Test
	public void addModel() {
		ModelEntity model = new ModelEntity();
		model.setModelName("倒塌模板");
		model.setType("倒塌");
		model.setLevel("1");
		model.setPerNum(5);
		model.setCarNum(5);
		model.setPerOfHos(5);
		model.setCarOfHos(5);
		model.setCreatPerson("王五");
		modelService.addModel(model);
	}
	
	@Test
	public void findModelAll() {
		System.out.println(modelService.findModelAll());
	}
	
	@Test
	public void findModelByName() {
		System.out.println(modelService.findModelByName("灾"));
	}
	
	@Test
	public void delModel() {
		modelService.delModel(1);
	}
	
	@Test
	public void updateModel() {
		modelService.updateModel("111", "11", 10, 11, 11, 11, 1);
	}
	
	@Test
	public void findModelById() {
		System.out.println(modelService.findModelById(1));
	}
	
	@Test
	public void findModelByLevelAndType() {
		System.out.println(modelService.findModelByLevelAndType("1", "水灾2"));
	}
}
