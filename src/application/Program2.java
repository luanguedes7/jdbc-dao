package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

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
		
		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: delete =======");
		departmentDao.deleteById(2);
		System.out.println("Delete completed");

	}
	
	

}
