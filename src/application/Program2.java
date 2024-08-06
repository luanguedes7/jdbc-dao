package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("================== TEST 1: Department By Id ==================");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n================== TEST 2: Department Find All ==================");
		List<Department> list = departmentDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}

	}
	
	

}
