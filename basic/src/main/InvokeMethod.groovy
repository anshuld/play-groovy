import javax.lang.model.element.Name

/**
 * Created by Anshul Dutta on 17/05/15.
 */
class PersonDynamic {
    String Name
    Map relationship = [:]

    Object invokeMethod(String what, Object who) {
        if (relationship.containsKey(what)) {
            relationship.get(what).add(who);
        } else {
            relationship.put(what, who as List)
        }
    }
}

def jyotu = new PersonDynamic(Name: 'jyotu')
jyotu.loves 'Anshul'

println jyotu.relationship
