class employees (
    var employeeName: String? = "Unknown",
    var employeeNumber: Int? = null,
    var employeeShift: Int? = null
) {
    init {
        println("Created employee: $employeeName")
    }

    fun printAll(){   // this function, printALL() prints out all the employee details in a well formatted way
        println("\nEmployee name: $employeeName \nEmployee Number: $employeeNumber \nShift: $employeeShift \n")
    }
}

//EXAMPLE FROM VIDEO LECTURE
//class contacts constructor(var cantactId:Int,
//                           var firstName:String? = "Unknown",
//                           var lastName:String? = "User",
//                            var emailAddress:String? = null,
//                            var phoneHome:String? = null,
//                            var phoneWork:String? = null,
//                            var phoneCell:String? = null
//){
//    init {
//        println("Created contact: $firstName $lastName") // you don't need to add the init,
//                                                        // this will be printed out each time. A new contact is added.
//                                                        // so in the Main.kt file when I run the program, it will show Created Contact: the first and last name
//    }
//
//    fun printAll(){
//        println(cantactId.toString() + "\n" + firstName + lastName + "\nEmail: " + emailAddress + "\nHome phone: " + phoneHome + "\nWork phone:"
//                + phoneWork + "\nCell Phone: " + phoneCell + "\n")
//    }
//
//}