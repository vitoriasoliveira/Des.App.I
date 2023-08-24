//criando classe para geração de obj 
data class Desenhos(
    //atributos da classe 
    var desenho : String, 
    var classificacao : Int, 
    var genero : String
) 

//criando lista/array vazio 
var listaDesenhos : MutableList<Desenhos> = mutableListOf()

//criando metodo/fun cadastrar desenhos
fun cadastra(
    des : String, 
    classif : Int, 
    gen : String) 
{
    //criando obj com valores passados por parametro 
	 var novoDesenho = Desenhos(desenho = des, classificacao = classif, genero = gen)
     //adicionando novo obj na lista de desenhos 
     listaDesenhos.add(novoDesenho)
     println("Cadastro realizado :)")
}

//funcao listar registros
fun lista()
{
    println("***LISTA DE DESENHOS***")
    listaDesenhos.forEach()
    {
        println("${it.desenho} \t\t ${it.classificacao} \t\t ${it.genero}")
    }
}


fun main() 
{
    cadastra(
        des = "moana",
    	classif = 10,
    	gen = "animation"
    )
    
   
    cadastra(
        des = "powerpuff girls",
    	classif = 12,
    	gen = "aventura"
    )
    
    cadastra(
        des = "spongeBob",
    	classif = 8,
    	gen = "animation"
    )
    
    lista()
}

    
