object main extends App{
     def Even(input:Int):Boolean = input match{
        case 0 => true
        case _ => Odd(input-1)
    }

    def Odd(input:Int):Boolean = !(Even(input))
    
    def patternMatching(input:Int) = input match{
        case a if a<0 => println("negative")
        case a if a==0 => println("zero")
        case a if Even(a) => println("even")
        case a if Odd(a) => println("odd")
    }

    patternMatching(-5)
    patternMatching(0)
    patternMatching(3)
    patternMatching(4)

}