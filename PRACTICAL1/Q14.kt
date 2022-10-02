fun main()
{
    val obj = ArrayList<Student> (5)

    obj.add(Student())
    obj.add(Student("20012531001","CE-AI","B","AI2","Arth","Jani",19))
    obj.add(Student("20012531008","CE-AI","B","AI2","Abhishek","Gaikwad", 20))
    obj.add(Student("20012531026","CE-AI","B","AI2","Sanket","Patel",20))


    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fn: String, private val ln: String, private val age: Int)
{
    fun details() {
        println("First Name = $fn")
        println("Last Name = $ln")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }
    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}
