fun main(){
    names()
    peoplesheight()

    var d = person2("Mwenja",30,5,58)
    var a = person2("Flaria",26,6,68)
    var b = person2("Ambrose",20,7,65)
    var person2 = listOf(d,a,b)
    println(person2)
    var jeep= carobjects("KCD",40)
    var prado = carobjects("BMW",60)

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6.

fun names(){

    var name = listOf("Jane","Fardosa","Grace","Mollen","Sharon","Precious",
        "Faith","Joan","Charity","Joy")
     name[2]
    name[4]
    name[6]
    return names()
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height.
fun peoplesheight(){
    var height= mutableListOf(3,5,4,3,6,7)
    println(height.average())
    println(height.sum())
    return peoplesheight()

}
//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age.
open class person(name:String,age:Int,height:Int,weight:Int)
fun persons(){
    var y = listOf(person("Mwende",20,5,50))
    var x = listOf(person("Wafula",19,6,67))
    var r = listOf(person("Mwenja",28,4,70))
    var person = listOf(y,x,r)
    println(person)
}



//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
    data class person2(val name: String,val age: Int,val height: Int,
                       val weight: Int)








//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all vehicles in the list.
data class carobjects(val Registration:String,val Mileage:Int)
     fun carobject(obje:List<carobjects>):Double{
         var m = 0.0
         obje.forEach{ o->
             m+=o.Mileage
         }
         return m/obje.count()
     }

