# Vaatimusmäärittely

## Sovelluksen tarkoitus

Opintojen seurantajärjestelmä mahdollistaa opiskelijan kirjata kaikki 
kurssit samlle listalle. Listalle voi kirjata vapaamuotoisesti kurssin 
tietoja, kuten kurssin nimi, kurssin tila, tenttipäivä, arvosana ja
muistiinpanoja kurssista.
Sovellusta on mahdollista käyttää useamman rekisteröityneen käyttäjän, 
joilla on kaikilla omat kurssilistansa.

## Käyttäjät

Kaikki käyttäjät ovat samalla roolilla.

## Käyttöliittymäluonnos

![Luonnos](https://github.com/forstjoh/ot-harjoitusty-/blob/master/Opintojenseurantajarjestelma/dokumentointi/kuvat/kuva.png)

## Perusversion tarjoama toiminnallisuus

### Ennen kirjautumista

* Uusi käyttäjä luo ensimmäisellä kirjautumiskerralla oman käyttäjätunnuksen 
ja salasanan.
* Käyttäjätunnuksella ja salasanalla käyttäjä pääsee omille kurssit sivuille, 
jollei käyttäjää löydy, järjestelmä ilmoittaa asiasta

### Kirjautumisen jälkeen

* Kurssit listalla luodaan omia kursseja
	* voi kirjautua ulos järjestelmästä
* Yksittäisen luodun kurssin kohdalta pääsee uudelle listasivulle, missä on
seuraavat kurssin tiedot:
	* kurssin nimi
	* kurssin tila
	* tenttipäivä
	* arvosana
	* muistiinpanot
	* Create new course: tallentaa tehdyt muutokset ja jolla pääsee takaisin
	 kurssit listaukseen
	* Cancel: mikä vie takaisin tallentamatta kurssit listaukseen 


## Jatkokehitysideoita

	* Käyttöliittymänäkymän parannuksia
	* Käyttäjäkurssilistan automaattinen päivitys
	* Käyttöliittymästä logiikan toimintoja omiin luokkiin 
	* Salasanan suojaus tietoturvan parantamiseksi
	* Kurssi sisällön lähettäminen sähköpostilla
	* Sovelluksen testauskattavuus paremmaksi

