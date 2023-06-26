# Vulnerapp

- [x] Verwendung von korrekten REST-Verben.
- [x] Implementierung einer Authentifizierungslösung (z.B. BasicAuth).
- [x] Enforce RBAC (z.B. User- und Admin-Services unterscheiden).
- [x] Aktivieren von CSRF-Protection
- [x] Implementierung einer sicheren Passwort-Speicherung (Hashing, Passwortregeln).
- [x] Strikte Inputvalidierung (für REST-Endpunkte und Datenbank).
- [x] Behebung der initialen Sicherheitslücken (SQLi, XSS, CSRF).
- [x] Implementierung von securityrelevanten (Unit-)Tests.


# Selbstevalution

## Sicherheitsmechanismen die implementiert wurden
Es wurden viele Sicherheitsmechanisman implementiert. Als erstes habe ich die korrekten REST-Verben eingesetzt bei den calls.
Mit BasicAuth habe ich eine Authentifizierungslösung und dazu mit Hashing eine sichere Passwort-Speicherung implementiert.
Als nächstes habe ich die User und Admin-Services unterschieden. Die CSRF-Protection habe ich ebenfalls noch eingebaut.
Für die REST-Andpunkte habe ich eine strikte Inputvalidierung implementiert.
Zu letzt habe ich noch einige securityrelevante Tests geschrieben.

### warum diese Massnahmen die Sicherheit der Applikation verbessern
Verwendung korrekter REST-Verben: Verbessert die Vorhersagbarkeit und Konsistenz der API und reduziert potenzielle Sicherheitslücken.
Implementierung einer Authentifizierungslösung: Ermöglicht die Überprüfung der Identität von Benutzern und erschwert unbefugten Zugriff.
Enforce RBAC: Teilt Benutzer in Rollen ein und gewährt nur autorisierten Zugriff auf Ressourcen, um unautorisierte Zugriffe zu verhindern.
Aktivierung von CSRF-Protection: Verhindert Angriffe, bei denen Aktionen im Namen authentifizierter Benutzer durchgeführt werden, ohne deren Zustimmung.
Implementierung sicherer Passwort-Speicherung: Verschlüsselt Passwörter, um Benutzerkonten vor unbefugtem Zugriff zu schützen.
Strikte Inputvalidierung: Verhindert potenzielle Schwachstellen wie SQL-Injection durch die Überprüfung und Einschränkung der akzeptierten Daten.
Implementierung securityrelevanter (Unit-)Tests: Identifiziert potenzielle Sicherheitslücken während des Entwicklungsprozesses.

## Sicherheitsmechanismen die noch implementiert werden könnten
Zusätzlihc könnte man noch einige Sicherheitsmassnahmen einbauen:
- Content Security Policy (CSP): Eine CSP ermöglicht die Kontrolle darüber, welche Ressourcen (z. B. Skripte, Stylesheets, Bilder) in einer Webanwendung geladen werden dürfen. 
Durch die Einschränkung der zugelassenen Ressourcen wird das Risiko von Cross-Site Scripting (XSS) und ähnlichen Angriffen reduziert.
- Rate Limiting: Durch die Implementierung von Rate Limiting wird die Anzahl der Anfragen begrenzt, die ein Benutzer oder eine IP-Adresse innerhalb eines bestimmten Zeitraums senden kann. 
Dies hilft, Denial-of-Service (DoS)-Angriffe und Brute-Force-Angriffe einzudämmen.

## Schwierigkeiten
Ich hatte einige Probleme, da ich anfangs einiges schwer zu verstehen fand. Am Anfang hatte ich für alles sehr lange und es brauchte seine Zeit.
Sehr lange hatte ich bis ich mich einloggen konnte, als es dann endlich funktioniert hat, hatte ich auch shcon das nächste Problem mit dem posten von Blogs.
Zum Glück konnte ich aber auch dieses Problem lösen nache einiger Zeit.
Gegen Ende gingen zwar einige Sachen etwas schneller und es funktionierte das meiste gut. Doch die Rollenvergebung funktionierte nicht und trotz langem versuchen hat es nicht richtig geklappt.
