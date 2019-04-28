# Opintojenseurantajärjestelmä

Opintojen seurantajärjestelmä mahdollistaa opiskelijan kirjata kurssien
muistiinpanot yksittäisen kurssin listalle. Samalla listalla on koottuna
myös kurssin tila, tenttipäivä ja arvosana. Sovellusta on mahdollista käyttää
useamman rekisteröityneen käyttäjän, joilla on kaikilla omat kurssilistansa.

## Dokumentaatio

[Käyttöohje](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/kayttoohje.md)

[Vaatimusmäärittely](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/vaatimusmaarittely.md)

[Arkkitehtuurikuvaus](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/arkkitehtuuri.md)

[Testausdokumentti](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/testaus.md)

[Työaikakirjanpito](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/tuntikirjanpito.md) 

## Releaset

[Viikko 5](https://github.com/forstjoh/ot-harjoitusty-/releases/tag/viikko5)

[Viikko 6](https://github.com/forstjoh/ot-harjoitusty-/releases/tag/Viikko6)

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
