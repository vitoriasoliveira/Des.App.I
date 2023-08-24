var num = 0 //variavel global 

fun main() 
{
	println(num) // 0
    somaDez()
    	desenhaLinha(num)
        println(desenhaLinha2(num))
    println(num) // 10
    somaQuinze()
    	desenhaLinha(num)
        println(desenhaLinha2(num))
    println(num) // 25
    
    bhaskara(1.0, 4.0, 2.0) //usando parametros posicionais (na ordem) e usar . pq é double  
    bhaskara(b = 8.0, a = 2.0, c = 4.0) //usando parametros nomeados 
    bhaskara(c = 4.0, b = 10.0) //a tem valor padrão entao não precisa nomear 
    
}

fun somaDez()
{
    num+=10 //same as numero = numero + 10
}

fun somaQuinze()
{
    num+=15
}

fun desenhaLinha(x : Int)
{
    var linha = ""
    for (i in 0..x)
    {
        linha+="-"
    }
    println(linha) //vai printar numero de x +1 pq 0
}

fun desenhaLinha2(x : Int) : String
{
    var linha = ""
    for (i in 0..x)
    {
        linha+="="
    }
    return linha
}

fun bhaskara(
    a : Double = 1.0, //valor padrão para a, pode ser mudado na chamada, se nao for ele usa valor padrão 
    b : Double, 
    c : Double)
{
    val delta = (b * b) - (4 * a * c)
    val x1 = (- b - Math.sqrt(delta)) / 2 * a
    val x2 = (- b + Math.sqrt(delta)) / 2 * a
    println("x' = $x1")
    println("x'' = $x2")
}
