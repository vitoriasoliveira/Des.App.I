fun main() 
{
    //declarações de variáveis 
	val n1 : Int
    val n2 : Int
    val n3 : Int
    
    //atribuir valores
    n1 = 5
    n2 = 3
    n3 = 3
    
    //check bigger number 
    if (n1 > n2 && n1 > n3)
    {
        println("Numero 1 é maior")
    }
    if (n2 > n1 && n2 > n3)
    {
        println("Numero 2 é maior")
    }
    if (n3 > n1 && n3 > n1)
    {
        println("Numero 3 é maior")
    }
    
    //check same numbers 
    if (n1 == n2 || n1 == n3 || n2 == n3)
    {
        println("Hé numeros iguais")
    }
    
    //check lower number 
    if (n1 < n2 || n1 < n3)
    {
        println("Numero 1 é menor")
    }
    if (n2 < n1 || n2 < n3)
    {
        println("Numero 2 é menor")
    }
    if (n3 < n1 || n3 < n1)
    {
        println("Numero 3 é menor")
    }
   
}
    
