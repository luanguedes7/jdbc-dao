package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {		
		DaoFactory daofactory = new DaoFactory();
		Department dep = daofactory.createDepartmentDao();
		
		System.out.println("================== TEST 1: Department By Id ==================");
		Department dep = department.findById(1);
		System.out.println(dep);
	}
	
	

}
