import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculadoraTest {

    //Iniciamos una variable tipo entero y la inicializamos en cero
    int suma = 0;

    @Given("que tengo una calculadora")
    public void que_tengo_una_calculadora() {
        System.out.println("Encendiendo calculadora...");

    }
    @When("sumo {int} y {int}")
    public void sumo_y(Integer int1, Integer int2) {
        System.out.println("Realizando suma...");

        //Creando la suma de dos variables
        suma = int1 + int2;

    }
    @Then("el resultado es {int}")
    public void el_resultado_es(Integer int1) {
        System.out.println("Mostrando resultado...");
        if (suma == int1){
            System.out.println("La suma es :" + suma);
        }else{
            System.out.println("Error se esperaba el resultado.." + int1);
        }

    }
}
