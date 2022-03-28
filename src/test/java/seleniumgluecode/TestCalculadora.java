package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class TestCalculadora {

        //Iniciamos una variable tipo entero y la inicializamos en cero
        int resultado = 0;

        @Given("que tengo una calculadora")
        public void que_tengo_una_calculadora() {
            System.out.println("Encendiendo calculadora...");

        }
        @When("sumo {int} y {int}")
        public void sumo_y(Integer int1, Integer int2) {
            System.out.println("Realizando suma...");

            //Creando la suma de dos variables
            resultado = int1 + int2;

        }
        @When("resto {int} y {int}")
        public void resto_y(Integer int1, Integer int2) {
            System.out.println("Restando...");
            //Creando dos variables para la resta
            resultado = int1 - int2;
        }
        @When("multiplico {int} y {int}")
        public void multiplico_y(Integer int1, Integer int2) {
            //Creando dos variables para la multiplicacion
            resultado = int1 * int2;
        }
        @When("divido {int} y {int}")
        public void divido_y(Integer int1, Integer int2) {
            //Creando dos variables para la division
            resultado = int1 / int2;
        }

        @Then("el resultado es {int}")
        public void el_resultado_es(Integer int1) {
            System.out.println("Mostrando resultado...");
            if (resultado == int1){
                System.out.println("Enhorabuena! El resultado es el esperado :" + resultado);
            }else{
                System.out.println("Error se esperaba el resultado.." + int1);
            }
            //Validar que sea igual el resultado con el int1 esto es lo que en realidad valida el testing
            Assert.assertEquals(resultado, int1);
            //Assert.assertEquals(resultado, int1);
        }
    }


