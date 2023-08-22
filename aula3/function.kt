//criando funções fora de main 
fun main() 
{
    darBoasVindas()
}
fun darBoasVindas()
{
    println("Opa, tudo ok?")
}
--------------------------------------------

//como usar variaveis na função - denominar antes 
fun main() 
{
    darBoasVindas("vitoria")
}

//criando funções fora de main 
fun darBoasVindas(pessoa: String)
{
    println("Opa, $pessoa! tudo ok?")
}

-----------------------------------------------------

fun main() 
{
    //dando valor as variaveis 
    darBoasVindas("vitoria", 24)
    darBoasVindas("fafa", 32) //posso executar mais de uma vez a mesma função com diferentes variáveis 
}

//criando funções fora de main com diferentes parametros e variaveis 
fun darBoasVindas(pessoa: String, idade : Int)
{
    println("Opa, $pessoa! tudo ok? idade = $idade")
}

---------------------------------------------------------------------------
    
// função com retorno de variavel 
fun main() 
{
    //printar funções = usar ${}
    println("area do circulo: ${areaDoCirculo(3.5)} m²")
}

fun areaDoCirculo(raio: Double) : Double
{
    //começando com letras maiusculas - biblioteca 
    val result = Math.PI * (raio * raio)
    return result
}

------------------------------------------------------------------------------
//função com 3 variaveis 
fun main() 
{
    println("area do trapezio: ${areaDoTrapezio(3f, 2f, 5f)} m²")
}

fun areaDoTrapezio(BM : Float, bm : Float, h : Float) : Float
{
    return ((BM + bm) * h) / 2
}


-----------------------------------------------------------------------------
//importação de coleção direto do kotlin
import kotlin.random.Random

fun main() 
{ 
    //printando 5x ramdon frases
    for(i in 0..4)
    {
      println(escolherFrase())  
    }
    //ou so printar uma frase
    println(escolherFrase())
}

//função que aleatoriamente escolhe uma frase e nao tem parametro 
fun escolherFrase() : String
{
    //random from kotlin 
    val opt = Random.nextInt(0,5)
    var frase = ""
    when(opt)
    {
        0 -> frase = "youll be back"
        1 -> frase = "guns and ships"
        2 -> frase = "take a break"
        3 -> frase = "the ballad of yorktown"
        4 -> frase = "schuyler sisters"
        else -> frase = ""
    }
    return frase
}

-------------------------------------------------------------------------------------------------------

import kotlin.random.Random

var idade : Int = 0 //declaração e inicialização de variavel global que pode ser usada por todas funções

fun main() 
{
    //dando valor as variaveis 
    darBoasVindas("vitoria", 24)
    darBoasVindas("fafa", 32)
    darBoasVindas("fe",35 )
    
    //printar funções com comentário = usar ${}
}


fun darBoasVindas(pessoa: String, idade2 : Int)
{
    idade = idade2 //setting idade to idade2
    println("Opa, $pessoa! tudo ok? idade = $idade")
    aniver()//printing function aniver 
}

fun aniver()
{
    idade++ //incrementing idade 
    println("parabens nova idade: $idade")
}


