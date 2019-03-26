# Vaatimusmäärittely

## Sovelluksen tarkoitus

Opintojen seurantajärjestelmä mahdollistaa opiskelijan kirjata kurssien
muistiinpanot yksittäisen kurssin listalle. Samalla listalla on koottuna myös 
kurssin tila, tenttipäivä ja arvosana.
Sovellusta on mahdollista käyttää useamman rekisteröityneen käyttäjän, 
joilla on kaikilla omat kurssilistansa.

## Käyttäjät

Kaikki käyttäjät ovat samalla roolilla.

## Käyttöliittymäluonnos

![Kuva](/ot-harjoitustyö/kuva.png)

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista

* Uusi käyttäjä luo ensimmäisellä kirjautumiskerralla oman käyttäjätunnuksen 
ja salasanan, mikä on kaksi merkkiä (aluksi, kunnes käyttäjäkanta kasvaa)
* Käyttäjätunnuksella ja salasanalla käyttäjä pääsee omille kurssit sivuille, 
jollei käyttäjää löydy, järjestelmä ilmoittaa asiasta

### Kirjautumisen jälkeen

* Kurssit listalla luodaan omia kursseja
	* voi kirjautua ulos järjestelmästä
* Yksittäisen luodun kurssin kohdalta pääsee uudelle listasivulle, missä on
seuraavat kurssin tiedot:
	* kurssin nimi
	* muistiinpanot
	* kurssin tila (ei alkanut, käynnissä, suoritettu, hylätty)
	* tenttipäivä
	* arvosana
	* OK, mikä tallentaa tehdyt muutokset ja jolla pääsee takaisin
	 kurssit listaukseen
	* Peru, mikä vie takaisin tallentamatta kurssit listaukseen 


## Jatkokehitysideoita

Jatkokehitysideoita kerätään ohjelman edetessä 
