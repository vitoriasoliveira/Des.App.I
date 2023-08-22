fun main() {
   val listaCarros : Array<String> = arrayOf(
       "carro 1",
       "carro 2",
       "carro 3",
       "carro 4",
       "carro 5",
       "carro 6"
   )
   //varrendo lista #1
   for(i in 0..5) //denominando o numero exato de iterações 
    {
        println(listaCarros[i])
    }
   
}
------------------------------------------------
  fun main() {
   val listaCarros : Array<String> = arrayOf(
       "carro 1",
       "carro 2",
       "carro 3",
       "carro 4",
       "carro 5",
       "carro 6"
   )
   //varrendo lista #1
   for(i in 0..(listaCarros.size - 1))//denominando as iterações pelo tamanho da lista 
    {
        println(listaCarros[i])
    }
   
}
--------------------------------------------------
   //varrendo lista #2
   for(i in listaCarros.indices)
    {
        println(listaCarros[i])
    }
    ---------------------------------------------------------
   //varrendo lista #3
  listaCarros.forEach{println (it)}

  --------------------------------------------------------
  //varrendo lista #4
   for(i in listaCarros)
   {
       println(i)
   }

  -------------------------------------------------------
  fun main() {
    //arrey imutavel 
   val listaCarros : Array<String> = arrayOf(
       "carro 1",
       "carro 2",
       "carro 3",
       "carro 4",
       "carro 5",
       "carro 6"
   )
   //criando lista mutavel para filtrar dados da outra lista
    var listaFiltro : MutableList<String> = mutableListOf()

    listaCarros.forEach()
    {
      //////if(it.toLowerCase().contains("ro")
   		if(it.contains("o"))
        {
            listaFiltro.add(it)
        }
   		
    }
	//mostrando dados da listra filtro
	listaFiltro.forEach{println(it)}

  ----------------------------------------------
    //criando lista global 

var listaCarros = mutableListOf(
       "carro 1",
       "carro 2",
       "carro 3",
       "carro 4",
       "carro 5",
       "loucra")

fun main() {
  
   //criando lista mutavel para filtrar dados da outra lista
    var listaFiltro : MutableList<String> = mutableListOf()

    listaCarros.forEach()
    {
   		if(it.contains("o"))
        {
            listaFiltro.add(it)
        }
   		
    }
	//mostrando dados da listra filtro
	listaFiltro.forEach{println(it)}
