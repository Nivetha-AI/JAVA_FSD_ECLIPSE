package com.hex.hibernew.com.hext.hibernew;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App

{
	SessionFactory fac;
	Session ses;
	Transaction tx;

	App() {
		fac = new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Book.class).buildSessionFactory();

		ses = fac.openSession();

	}

	void insertBook() {
		tx = ses.beginTransaction();

		Book b = new Book();
		// b.setBno(104);
		b.setName("C++");
		b.setPrice(5000.9);

		ses.save(b);
		tx.commit();
	}

	void RemoveByBNo() {
		int bn = 101;
		tx = ses.beginTransaction();
		Book b = ses.find(Book.class, bn);
		if (b != null) {
			ses.delete(b);
			tx.commit();

		} else {
			System.out.println("Not Found");
		}
	}

	void UpdateBkPriceByBNo() {
		// Get input from user using Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Book Number (Bno) to update: ");
		int bn = sc.nextInt();

		System.out.print("Enter new price for the book: ");
		double newPrice = sc.nextDouble();

		// Begin transaction
		tx = ses.beginTransaction();

		// Find the book by Bno
		Book b = ses.find(Book.class, bn);
		if (b != null) {
			// Update price if book is found
			b.setPrice(newPrice);
			ses.update(b);
			tx.commit();
			System.out.println("Book price updated successfully.");
		} else {
			System.out.println("Book with Bno " + bn + " not found.");
		}
	}

	void SearchAndDisplayBook() {
		// Get input from user using Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Book Number (Bno) to search: ");
		int bn = sc.nextInt();

		// Begin transaction
		tx = ses.beginTransaction();

		// Find the book by Bno
		Book b = ses.find(Book.class, bn);
		if (b != null) {
			// Display book details if found
			System.out.println("Book details: " + b);
		} else {
			System.out.println("Book with Bno " + bn + " not found.");
		}

		tx.commit();
	}

	void showAll() {

		tx = ses.beginTransaction();

		Query q = ses.createQuery("from Book ");
		List<Book> books = q.list();

		for (Book b : books) {
			System.out.println(b.toString());

		}

	}

	void showData() {
		tx = ses.beginTransaction();
		String hql = "from Book B where B.price>:p and B.Name=:nm";
		Query q = ses.createQuery(hql, Book.class);
		q.setParameter("p", 1000.0);
		q.setParameter("nm", "C++");
		List<Book> books = q.list();
		for (Book b : books) {
			System.out.println(b.toString());

		}
	}

	void updatebook() {
		tx = ses.beginTransaction();
		String hql = "Update Book B set B.Name=:nm where B.Bno=:bn";
		Query q = ses.createQuery(hql);
		q.setParameter("bn", 102);
		q.setParameter("nm", "Node");
		int a = -1;
		q.executeUpdate();
		if (a == -1) {
			System.out.println("update");
		} else {
			System.out.println("name updated");
		}
		tx.commit();

	}

	void removeHQL() {
		tx = ses.beginTransaction();

		String hql = "delete from Book B where B.Bno=:bn ";

		Query q = ses.createQuery(hql);

		q.setParameter("bn", 102);

		int a = -1;
		q.executeUpdate();
		if (a == -1) {
			System.out.println("Removed");
		} else {
			System.out.println("not  removed");
		}
		tx.commit();

	}

	public static void main(String[] args) {
		App app = new App();
		// app.insertBook();
		// app.RemoveByBNo();
		// app.UpdateBkPriceByBNo();
		// app.SearchAndDisplayBook();
		// app.showAll();
		// app.showData();
		//app.updatebook();
		app.removeHQL();
		System.out.println("Transaction completed successfully.");
	}

}
