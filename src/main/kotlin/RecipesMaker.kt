const val ingredientes = """
    1. Agua
    2. Leche
    3. Carne
    4. Vernuras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceite
"""

const val menu = """
    Selecciona la opcion deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir
"""


fun main() {
    println(":: Bienvenido a Recipes Maker")


    do{
        println(menu)
        val usuario: Int = readLine()?.toInt() ?: 3
        val ingrediente: ArrayList<String> = ArrayList()
        when(usuario){
            1 -> {
                println("Has elegido hacer una receta")
                println("Selecciona los ingredientes")
                println(ingredientes)
                val opcionElegida: Int = readLine()?.toInt() ?: 0
                when(opcionElegida){
                    0 -> break
                    1 -> ingrediente.add("Agua")
                    2 -> ingrediente.add("Leche")
                    3 -> ingrediente.add("Carne")
                    4 -> ingrediente.add("Verduras")
                    5 -> ingrediente.add("Frutas")
                    6 -> ingrediente.add("Cereal")
                    7 -> ingrediente.add("Huevos")
                    8 -> ingrediente.add("Aceite")
                    else -> println("Opcion no validad")
                }


            }
        }
    }while(usuario != 3)
}