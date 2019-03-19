          
        //Jos merkkijonon pituus on 0 tai 1, palauta true.
        //Muuten jos merkkijonon ensimmäinen ja viimeinen merkki ovat erilaiset, palauta false.
        //Muissa tapauksissa ota jonon keskiosa, josta puuttuvat ensimmäinen ja viimeinen merkki,
        //selvitä rekursiivisella metodikutsulla, onko keskiosa palindromi, ja
        //palauta sama totuusarvo, jonka rekursiivinen kutsukin palautti.
    
    function fact(n) {
      console.log(n);
      // triviaalitapaus
      if (n.length  <= 1) {
        return (true);
      }
      else if (n.charAt(0) !== n.charAt(n.length-1)) {
        return (false);
      }
      // perussilmukka
      console.log(n);
      return fact(n.substring(n.length-1, 1));
    }
    var tulos = fact("sokos");
    console.log(tulos);
    //console.log(fact(n));
        