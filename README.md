# Production-Scientifique

## Mini projet qui affiche/ajoute/modifie/supprimer les information d'une publication de production scientifique

### Pages:
          / : Page d'accueil.
          /publication : Page d'affichage des publication (sera visible apres authentification login : admin, password : admin).
          
### Liste des controllers APi
          /publication/all : requette GET retourn l'ensemble des publication enregistrer dans la base des donnes.
          /publication/id/{id : long} : requette GET retourn une publication préciser par son id.
          /publication/title/{title : String} : requette GET retourn une publication préciser par son titre.
          /publication/add : Requette PUT enregistre une publication dans la base des données.
          /publication/update : Requette PATCH pour la mise a joure d'une publication.
          /publication/remove : Requette DELETE pour la suppression d'une publication de la base de données.
