# Sprint JWT Backend

Een jwt backend gebaseerd op https://www.javainuse.com/spring/boot-jwt. Wel wat geüpdate, geactualiseerd en verbeterd. Deze repo is bedoeld om wat gevoel te krijgen bij de manier waarop Spring met JWT (en met security) omgaat.

## Opdracht 1

Clone deze repository en zorg ervoor dat de boel compileert. Bestudeer de verschillende packages, klassen en het commentaar om je een beeld te vormen van hoe dit ding werkt.

Post de volgende gebruikers-gegevens naar `/authenticate` om een jwt terug te krijgen. Check dit jwt op [jwt.io](https://jwt.io).

gebruikersnaam | wachtwoord
----|----
hanze-user | password


Doe een get-request naar `/index`, waarbij je het jwt als authenticatie gebruikt (in de hearer: `Authorization:  Bearer <token>` Als het goed is krijg je nu een 200 terug van de server met de inhoud van de methode `index` van de `DefaultController`.

## Opdracht 2

Maak een nieuwe klasse `JwtUser` die [de klasse `User`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/userdetails/User.html) extends en [de interface `GrantedAuthority`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/GrantedAuthority.html) implementeert. Definieer twee rollen: `ROLE_USER` en `ROLE_ADMIN`.

Maak een nieuw endpoint `/register` waarbij gebruikers zich kunnen registeren. Voor deze opgave is het voldoende om de gebruikers in het geheugen van de server te laten staan (maar je *mag* ze natuurlijk wel opslaan in een database). Zorg ervoor dat je bij het registeren de rol van de gebruiker kunt opgeven. Maak een aantal gebruikers aan met de verschillende rollen.

Maak twee nieuwe endpoints in de `DefaultController`: één die voor alle geregistreerde bezoekers kan worden benaderd (`ROLE_ADMIN`) en één die alleen door de administrator (`ROLE_ADMIN`) bezocht kan worden. De endpoints hoeven niks terug te geven; het is voldoende om de infrastructuur op te zetten.


