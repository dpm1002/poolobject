package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author David Perez Moreno
 * @author Miguel Alonso Alonso
 *
 */



public class ReusablePoolTest {

	
	
	private ReusablePool pool;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool=null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 * 
	 * Obtenemos una instancia y comprobamos que no es nula y que sea del tipo
	 * ReusablePool.
	 * 
	 */
	@Test
	public void testGetInstance() {
		
		ReusablePool pool=ReusablePool.getInstance();
		
		assertNotNull("Objeto nulo",pool);
		
		assertTrue(pool instanceof ReusablePool);
	}

	/**
	 * 
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 * 
	 * Creamos un Reusable pool donde luego obtendremos el reusable con el
	 * acquireReusable() y comprobaremos que no es nulo.
	 * 
	 * @throws NotFreeInstanceException 
	 * 
	 */
	@Test
	public void testAcquireReusable() throws NotFreeInstanceException {
		ReusablePool pool= new ReusablePool(1);
		
		Reusable r1 = null;
			
		r1=pool.acquireReusable();
			
		assertNotNull(r1);
			
		
	}

	/**
	 * 
	 * Test para la cobertura del codigo de la clase NotFreeInstanceException.
	 * 
	 * El segundo pool.acquireReusable(); no realiza cobertura pero es porque salta
	 * la excepcion del primero al adquirir dos Reusables cuando solo
	 * hemos declarado uno en el constructor.
	 * 
	 * */

	@Test
	public void testAcquireReusableFail() {
		
		
		ReusablePool pool = new ReusablePool(1); 
	    
	    try {
	        pool.acquireReusable(); 
	        //En el siguiente se lanzara la excepion y se va al catch.
	        pool.acquireReusable();
	        
	    } catch (NotFreeInstanceException e) {
	        // La prueba es exitosa si se captura NotFreeInstanceException.
	    	e.printStackTrace();
	    }
		
		
	}
	
	
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 * 
	 * En este test comprobaremos el adquirir un reusable y luego comprobar, tanto que
	 * se obtiene su hash, tanto como de la liberacion de este reusable y que se
	 * realice correctamente. 
	 * 
	 * @throws DuplicatedInstanceException 
	 * @throws NotFreeInstanceException 
	 */
	@Test
	public void testReleaseReusable() throws DuplicatedInstanceException, NotFreeInstanceException {
		ReusablePool pool = new ReusablePool(1);
			
		Reusable r1 = null;
				
		r1=pool.acquireReusable();
				
		String hash=r1.util();
				
		pool.releaseReusable(r1);
		
		assertNotNull(r1);
				
		
	}
	
	
	

}