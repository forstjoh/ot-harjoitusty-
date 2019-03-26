# Vaatimusmäärittely

## Sovelluksen tarkoitus

Opintojen seurantajärjestelmällä opiskelija näkee kaikki kurssit, mitkä on
itse lisännyt kurssit listalleen. Yksittäisen kurssin tiedoistan pääsee uudelle
listalle, jossa on tiedot kyseisen kurssin tilasta, tenttipäivästä ja 
arvosanasta. Tälle listasivulle voi myös kirjoittaa kurssin muistiinpanoja.
Sovellusta on mahdollista käyttää useamman rekisteröityneen käyttäjän, 
joilla on kaikilla omat kurssilistansa.

## Käyttäjät

Kaikki käyttäjät ovat samalla roolilla.

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
	* kurssin tila (ei alkanut, käynnissä, suoritettu, hylätty)
	* tenttipäivä
	* muistiinpanot
	* OK, mikä tallentaa tehdyt muutokset ja jolla pääsee takaisin
	 kurssit listaukseen
	* Peru, mikä vie takaisin tallentamatta kurssit listaukseen 


## Jatkokehitysideoita

Jatkokehitysideoita kerätään ohjelman edetessä 
