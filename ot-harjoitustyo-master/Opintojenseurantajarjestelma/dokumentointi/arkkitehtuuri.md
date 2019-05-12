# Arkkitehtuurikuvaus

## Rakenne

Rakennekuvaus kuvaa ohjelman rakennetta

![rakenne](https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/rakenne.png)

## Käyttöliittymä

Käyttöliittymässä on seuraavat toiminnot:
* Login = sisäänkirjautuminen
* Logout = uloskirjautuminen
* New Course = uuden kurssin luonti tai muokkaus
* Update List = kurssitietojen päivittäminen
* Save to File = Tietojen tallentaminen tiedostoon
* Aktiivisen käyttäjän kurssilista

Käyttöliittymä on toteutettu luokassa StudyJournalUI.

## Sovelluslogiikka

Sovellusluokkia on Users, User ja Courses. Näissä luokissa on käyttäjät ja
käyttäjien kurssit.
Users luoka olio luodaan pääohjelmassa ja se pitää sisällään sovelluslogiikan.
Hyödyntäen edelleen luokki user ja courses.

Users luokka sisältää joukon user luookan käyttäjiä, jotka puolestaan pitävät 
sisällään lista courses tyypin kursseista.

Luokkakaavio:
![Luokkakaavio](https://github.com/forstjoh/ot-harjoitustyo/blob/master/ot-harjoitustyo-master/Opintojenseurantajarjestelma/dokumentointi/kuvat/luokkakaavio.png)


## Päätoiminnallisuudet

### käyttäjän kirjautuminen

Sovelluksen käynnistyessä käyttäjän pitää kirjautua sisälle. Tämä tapahtuu
Login toiminnon avulla.
Login napin painamisen jälkeen avautuu uusi ikkuna, jossa käyttäjä voi 
kirjautua sisälle tai luoda uuden käyttäjätunnuksen.
Sisäänkirjautumisen jälkeen käyttäjän pitää painaa Update list nähdäkseen 
kurssinsa.

![Sekvenssikaavio]()

### kurssin luominen

Kirjautunut käyttäjä pystyy luomaan itselleen uusia kursseja New course 
toiminnon avulla tai muokkaamaan olemassa olevia kurssejaan. Toiminnosta 
poistumisen jälkeen käyttäjän pitää painaa Update list nähdäkseen kurssinsa.

![Sekvenssikaavio]()

## Tietojen pysyväistallennus 

Sovellus tallentaa käyttäjien ja kurssien tiedot erilliseen tiedostoon. 
