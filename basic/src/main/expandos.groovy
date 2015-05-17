/**
 * Created by Anshul Dutta on 17/05/15.
 */
def e = new Expando()
println e.properties

e.longitude = 100
e.latitude = 20

e.dessert = { return longitude > 100 && latitude > 0}

println e.dessert()

e.goNorth = {howMuch -> e.longitude += howMuch}
e.goNorth 10

def result = e.dessert()
println result

