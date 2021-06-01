# Production-Scientifique

## Mini projet qui affiche/ajoute/modifie/supprimer les information d'une publication de production scientifique

### Pages:
          / : Page d'accueil.
          /pub : Page d'affichage des publication (sera visible apres authentification login : admin, password : admin).
          
### Liste des controllers APi
          /pub/all : requette GET retourn l'ensemble des publication enregistrer dans la base des donnes.
          /pub/id/{id : long} : requette GET retourn une publication préciser par son id.
          /pub/title/{title : String} : requette GET retourn une publication préciser par son titre.
          /pud/add : Requette PUT enregistre une publication dans la base des données.
          /pub/update : Requette PATCH pour la mise a joure d'une publication.
          /pub/remove : Requette DELETE pour la suppression d'une publication de la base de données.
