package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("================== TEST 1: Seller By Id ==================");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("\n================== TEST 2: Seller By Department ==================");
		Department department = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n================== TEST 3: Seller Find All ==================");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n================== TEST 4: Seller Insert ==================");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n================== TEST 5: Seller Update ==================");
		seller = sellerDao.findById(1);
		seller.setName("Matha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("\n================== TEST 6: Seller Delete ==================");
		sellerDao.deleteById(1);
		System.out.println("Delete complete");
		}
}


