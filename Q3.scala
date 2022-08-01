
object main extends App{
    
    def toLower(str:String):String=str.toLowerCase();
    def toUpper(str:String):String=str.toUpperCase();
    
    def formatNames(name: String)(func: String => String)(index: Int*):String = {
        if (index.isEmpty){ 
            func(name);
        }
        else {
            var i:Int =0;
            var j:Int =0;
            var output:String="";
            for(i <- 0 to (name.length()-1)){
                var temp:String = name.charAt(i).toString();
                for(j<-0 to (index.length-1)){
                    if(index(j)==i){
                        temp=func(temp);
                    }
                }
                output=output+temp;
            }
            output;
        };
    }

    println(formatNames("Benny")(toUpper(_))());
    println(formatNames("Niroshan")(toUpper(_))(1));
    println(formatNames("Saman")(toLower(_))());
    println(formatNames("Kumara")(toUpper(_))(5));
    
}

    

