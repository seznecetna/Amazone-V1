package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.demos.icommerce.amazon.Livre;
import fr.demos.icommerce.amazon.Panier;
import fr.demos.icommerce.amazon.PanierException;

public class PanierTest {

	private Panier pa;
	private Livre l;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		pa = new Panier();
		l = new Livre(12.99, 5, "ok", "abvcd", "titre", "auteur", "editeur", "genre");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = fr.demos.icommerce.amazon.PanierException.class)
	public void test() throws PanierException {
		int i;

		i = 0;
		for (i = 0; i <= 6; i++) {
			pa.ajouterArticle(l);
		}
	}

}
