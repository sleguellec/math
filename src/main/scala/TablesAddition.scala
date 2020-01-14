case class TablesAddition(n:Int) {

  List.range(1,n).foreach(t => affiche(t) )

  def affiche(t:Int) :Unit ={
    println(s"TABLE ADDITION $t")
    List.range(1,10).foreach(i => println(s"$t + $i = ${somme(t,i)}" ))
  }

  def somme(t:Int,i:Int) :Int ={
    t + i
  }

}
