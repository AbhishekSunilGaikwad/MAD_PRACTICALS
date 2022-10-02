fun main(){
    println("Enter a digit: ");
    val a = readLine()!!.toInt();
    if (a%2==0){
        println("$a is Even Number.");
    }
    else{
        println("$a is Odd Number");
    }
}
