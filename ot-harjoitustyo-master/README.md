# Opintojenseurantajärjestelmä

Opintojen seurantajärjestelmä mahdollistaa opiskelijan kirjata itselleen
kaikki kurssit samalle listalle, mihin voi laittaa tietoja kursseista. 
Jokaiselle kurssille voi lisätä tietoja, kuten kurssin tila, tenttipäivä,
arvosana ja muistiinpanoja kurssista. 
Sovellusta on mahdollista käyttää useamman rekisteröityneen käyttäjän,
joilla on kaikilla omat kurssilistansa.

## Dokumentaatio

[Käyttöohje](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/kayttoohje.md)

[Vaatimusmäärittely](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/vaatimusmaarittely.md)

[Arkkitehtuurikuvaus](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/arkkitehtuuri.md)

[Testausdokumentti](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/testaus.md)

[Työaikakirjanpito](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/tuntikirjanpito.md) 

## Releaset

[Viikko 5](https://github.com/forstjoh/ot-harjoitusty-/releases/tag/viikko5)

[Viikko 6](https://github.com/forstjoh/ot-harjoitusty-/releases/tag/Viikko6)

[Loppupalautus]()

## Komentorivitoiminnot

**Testaus**

Testit komennolla

	mvn test

Testikattavuusraportti komennolla

	mvn jacoco:report

**Jar**

Jarin komento

	mvn package

**JavaDoc**

JavaDoc komento

	mvn javadoc:javadoc

**Checkstyle**

Checkstyle komento

	mvn jxr:jxr checkstyle:checkstyle

Selaimessa target/site/checkstyle.html on tiedot tallennettuna

