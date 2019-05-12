# Käyttöohje

## Ohjelman asentaminen

Ohjelma toimitetaan jar-tiedostona. Tiedoston (Opintojenseurantajärjestelmä) voi ladata alla olevasta linkistä

[opintojenseurantajarjestelma.jar](https://github.com/forstjoh/ot-harjoitustyo/releases/tag/Viikko6)

Tee ohjelmalle oma hakemisto.

## Konfigurointi

Ohjelma luo käynnistyshakemistoon tiedostoja 
- users.txt: tiedosto sisältää käyttäjät ja heidän tiedot	
- jokaiselle käyttäjälle luodaan erillinen tiedosto, joka sisältää kurssien tiedot  

## Ohjelman käynnistäminen

Ohjelman käynnistäminen vaatii, että koneessa on asennettuna java ohjelmisto.
Ohjelma käynnistetään komennolla

	java -jar StudyJournalUI_2.jar

## Pääikkuna

Ohjelman käynnistämisen jälkeen avautuu alla oleva pääikkuna. Ohjelmaan pitää ensimmäisenä toimena kirjautua.
Ensimmäisellä käyttökerralla ainakin yksi käyttäjä pitää luoda.
Ohjelmassa voi olla vain yksi aktiivinen käyttäjä kerrallaan.

!(https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/newuser.png)

Pääikkunassa on toimet:
 
**Login**: Olemassa olevan käyttäjän kirjautuminen tai uuden käyttäjän luominen

(https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/login.png)

**Logout**: Kirjaa käyttäjän aktiivisen käyttäjän ulos.

**New Course**: Uuden kurssin luonti
- *Course name*: Kurssin nimi
- *Status*: Kurssin tila
- *Exam day*: Tentin päivämäärä
- *Score*: Arvosana
- *notes*: Muistiinpanot/huomiot kurssista
- *Create new course*: Tallentaa uuden kurssin tiedot muistiin
- *Cancel*: Sulkee New Course ikkunan tallentamatta

(https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/Kurssinluominen.png)

**Update**: Päivittää käyttäjän kurssilistan.

(https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/Kurssit.png)

**Save to File** : Tallentaa tiedot tiedostoon.

(https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/Save.png)



