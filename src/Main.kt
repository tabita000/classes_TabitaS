// create an employee class that accepts employee name, employee number and employee shift as parameters. Shift will be int:1,2,or3
// create a constructor. You will need to add a public method for displaying well formatted employee information.
// then you will create a program that calls the class and instantiates the class with information for three employees(no user input, create info)
fun main() {
    val emp1 = employees("Jenny", 1001, 3)
    val emp2 = employees("Sam", 1002, 2)
    val emp3 = employees("Michael", 1003, 1)

    emp1.printAll()
    emp2.printAll()
    emp3.printAll()
}



//EXAMPLE FROM LECTURE VIDEO
//fun main() {
//    val person1 = contacts(1, "Jenny", "Johnson", "jenny@aol.com", "",
//    "847-533-8977", "224-533-8977")
//
//    val person2 = contacts(2, "Sam", "Smith", "sam@aol.com", "224-533-8977",
//        "847-533-4105", "224-533-8977")
//
//    val person3 = contacts(3, "Michael", "Williams", "michael@aol.com",
//        "224-533-8977", "847-533-4105", "224-533-8977")
//
//    person1.printAll()
//    person2.printAll()
//    person3.printAll()
//
//}