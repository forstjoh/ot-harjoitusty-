# Opintojenseurantajärjestelmä

Opintojen seurantajärjestelmä mahdollistaa opiskelijan kirjata kurssien
muistiinpanot yksittäisen kurssin listalle. Samalla listalla on koottuna
myös kurssin tila, tenttipäivä ja arvosana. Sovellusta on mahdollista käyttää
useamman rekisteröityneen käyttäjän, joilla on kaikilla omat kurssilistansa.


## Dokumentaatio

[Vaatimusmäärittely](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/vaatimusmaarittely.md)

Työaikakirjanpito
https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/tuntikirjanpito.md 

## Komentorivitoiminnot

**Testaus**

Testit suoritetaan komennolla

	mvn test

Testikattavuusraportti luodaan komennolla

	mvn jacoco:report

## Checkstyle

Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

	mvn jxr:jxr checkstyle:checkstyle

Mahdolliset virheilmoitukset selviävät avaamalla selaimen tiedosto target/site/checkstyle.html
