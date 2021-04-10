package fr.mmlib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import fr.mmlib.dao.BorrowDAO;
import fr.mmlib.dao.CategoryDAO;
import fr.mmlib.dao.ItemDAO;
import fr.mmlib.dao.LibraryDAO;
import fr.mmlib.dao.UserDAO;
import fr.mmlib.entities.Book;
import fr.mmlib.entities.Borrow;
import fr.mmlib.entities.Category;
import fr.mmlib.entities.Game;
import fr.mmlib.entities.Library;
import fr.mmlib.entities.User;

@Component
public class DataInit implements ApplicationRunner {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private ItemDAO itemDAO;

	@Autowired
	private BorrowDAO borrowDAO;

	@Autowired
	private LibraryDAO libraryDAO;

	@Value("${application.mode}")
	private String appMode;


	@Override
	public void run(ApplicationArguments args) throws Exception {

		Library library = new Library();

		// Library Instance
		library.setLibraryName("My first library");
		libraryDAO.save(library);

		// Library Users
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();

		u1.setLastName("Smith");
		u1.setFirstName("Malo");
		u1.setAdmin(false);
		u1.setLibrary(library);

		u2.setLastName("Smith");
		u2.setFirstName("Mael");
		u2.setAdmin(false);
		u2.setLibrary(library);

		u3.setLastName("Smith");
		u3.setFirstName("Michael");
		u3.setAdmin(true);
		u3.setLibrary(library);

		userDAO.save(u1);
		userDAO.save(u2);
		userDAO.save(u3);

		//  Categories
		Category cat1 = new Category();
		Category cat2 = new Category();
		Category cat3 = new Category();

		cat1.setDescription("My first book category");
		cat2.setDescription("My second book category");
		cat3.setDescription("My first game category");

		categoryDAO.save(cat1);
		categoryDAO.save(cat2);
		categoryDAO.save(cat3);

		// Book Instances

		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();

		book1.setName("My first book");
		book1.setCategory(cat1);
		book1.setNbPages(250);
		book1.setDateAdded(new java.util.Date());

		book2.setName("My second book");
		book2.setCategory(cat2);
		book2.setNbPages(100);
		book2.setDateAdded(new java.util.Date());

		book3.setName("My third book");
		book3.setCategory(cat2);
		book3.setNbPages(223);
		book3.setDateAdded(new java.util.Date());

		itemDAO.save(book1);
		itemDAO.save(book2);
		itemDAO.save(book3);

		Game game = new Game();
		game.setName("My first game");
		game.setEvaluation(5);
		game.setDateAdded(new java.util.Date());
		game.setCategory(cat3);

		itemDAO.save(game);

		// Borrows

		Borrow borrow1 = new Borrow();
		Borrow borrow2 = new Borrow();

		borrow1.setItem(book1);
		borrow1.setUser(u3);
		borrow1.setStartingDate(new java.util.Date());

		borrow2.setItem(book2);
		borrow2.setUser(u2);
		borrow2.setStartingDate(new java.util.Date());

		borrowDAO.save(borrow1);
		borrowDAO.save(borrow2);

	}
}