/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package informeEmpleado;


import static informeEmpleado.TipoEmpleado.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlexJ
 */
public class EmpleadoBrTest {
    
    public EmpleadoBrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of calcularSalarioNeto method, of class EmpleadoBr.
     */
    @Test
    public void testCalcularSalarioNeto1() {
        System.out.println("prueba de Salario Neto 1");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 1640;
        
        double resultado = brut.calcularSalarioNeto(2000);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto2() {
        System.out.println("prueba de Salario Neto 2");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 1230;
        
        double resultado = brut.calcularSalarioNeto(1500);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto3() {
        System.out.println("prueba de Salario Neto 3");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = (float) 1259.9916;
        
        double resultado = brut.calcularSalarioNeto((float) 1499.99);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto4() {
        System.out.println("prueba de Salario Neto 4");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 1050;
        
        double resultado = brut.calcularSalarioNeto(1250);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto5() {
        System.out.println("prueba de Salario Neto 5");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 840;
        
        double resultado = brut.calcularSalarioNeto(1000);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto6() {
        System.out.println("prueba de Salario Neto 6");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = (float) 999.99;
        
        double resultado = brut.calcularSalarioNeto((float) 999.99);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto7() {
        System.out.println("prueba de Salario Neto 7");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 500;
        
        double resultado = brut.calcularSalarioNeto(500);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalcularSalarioNeto8() {
        System.out.println("prueba de Salario Neto 8");
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 0;
        
        double resultado = brut.calcularSalarioNeto(0);
        assertEquals(esperado, resultado, 0.0);
    }
    //peligro
    
    
    @Test(expected = BRException.class)
    public void testCalcularSalarioNeto9() {
        System.out.println("Prueba de salario 9");
        
        
        EmpleadoBr neto = new EmpleadoBr();
        
        
        float resultado = neto.calcularSalarioNeto(-1f);
        float esperado = 487497444444444444444.04444f;
        
       
        assertEquals("hola", resultado, 0.0);
    }
    

    /**
     * Test of calculaSalarioBruto method, of class EmpleadoBr.
     */
    @Test
    public void testCalculaSalarioBruto1() {
        System.out.println("prueba de Salario Bruto 1");
        
        
        EmpleadoBr brut = new EmpleadoBr();
        
        float esperado = 1360;
        
        double resultado = brut.calculaSalarioBruto(vendedor, 2000, 8);
        assertEquals(esperado, resultado, 0.0);
    }
    
    
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCalculaSalarioBruto2() {
        
        System.out.println("prueba de Salario Bruto 11");
 
        EmpleadoBr brut = new EmpleadoBr();
        double resultado = brut.calculaSalarioBrutoNull(null, 1500, 8);
        
    }

   


    

    

    
    
}
