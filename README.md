# Production-Scientifique

## Mini projet qui affiche/ajoute/modifie/supprimer les information d'une publication de production scientifique
## application réalise avec thymeleaf pour la partie de front end.

### Pages:
          /            : Page d'accueil.
          /publication : Page d'affichage des publication (sera visible apres authentification login : admin, password : admin).
          
### Liste des controllers APi
          /publication/all : requette GET retourn l'ensemble des publication enregistrer dans la base des donnes.
          /publication/add : Requette PUT enregistre une publication dans la base des données.
          /publication/update/{id} : Requette PATCH pour la mise a joure d'une publication.
          /publication/remove/{id} : Requette DELETE pour la suppression d'une publication de la base de données.
