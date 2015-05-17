/**
 * Created by Anshul Dutta on 16/05/15.
 */
def list = []
def insert = list.&add
insert 'Groovy'
insert 'scala'

list.each {
    println it
}

