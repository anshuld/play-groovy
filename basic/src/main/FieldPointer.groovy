/**
 * Created by Anshul Dutta on 16/05/15.
 */

class Person {
    String name

    String getName() {
        "My name is sheela ki ${name}"
    }

}

def person = new Person(name: "Jawani")

println(person.name)
println(person.@name)

