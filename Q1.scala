object main extends App{

    def interest(amountOfInterest:Double)=
        amountOfInterest match{

            case a if a <= 20000 =>a*2/100
            case a if a <= 200000 =>a*4/100
            case a if a <= 2000000 =>a*3.5/100
            case a if a > 2000000 =>a*6.5/100

        }

    

    println(interest(15000));
    println(interest(150000));
    println(interest(1500000));
    println(interest(15000000));

}