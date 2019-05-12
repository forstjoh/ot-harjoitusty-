# Arkkitehtuurikuvaus

## Rakenne

Rakennekuvaus kuvaa ohjelman rakennetta

![rakenne](https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/rakenne.png)

## Käyttöliittymä

Käyttöliittymässä on seuraavat toiminnot:
	*Login = sisäänkirjautuminen
	*New Course = uuden kurssin luonti tai muokkaus

Käyttöliittymä on toteutettu luokassa StudyJournalUI.

## Sovelluslogiikka

Sovellusluokkia on User, Users ja Courses. Näissä luokissa on käyttäjät ja
käyttäjien kurssit.

Luokkakaavio:
![Luokkakaavio](https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/luokkakaavio.png)


## Päätoiminnallisuudet

Sekvenssikaavio:
![Sekvenssikaavio](https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/sekvenssikaavio.png)

## Tietojen pysyväistallennus 

Sovellus tallentaa käyttäjien ja kurssien tiedot erilliseen tiedostoon. 
