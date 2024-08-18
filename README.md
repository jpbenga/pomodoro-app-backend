# Application Pomodoro

## Description
Cette application Pomodoro est conçue pour aider les utilisateurs à gérer leur temps efficacement en utilisant la technique Pomodoro. Elle offre un timer personnalisable, un suivi des tâches, et des statistiques de productivité.

## Fonctionnalités principales
- Timer Pomodoro avec intervalles de travail et de pause personnalisables
- Gestion des tâches
- Suivi des sessions Pomodoro
- Statistiques de productivité
- Authentification des utilisateurs
- Interface responsive pour une utilisation sur desktop et mobile

## Structure du projet
Ce projet est divisé en deux parties principales :
- `pomodoro-app-frontend` : Application React pour le frontend
- `pomodoro-app-backend` : API REST Java Spring Boot pour le backend

## Documentation technique
Les diagrammes techniques et la documentation détaillée du projet sont disponibles dans le [dossier docs](docs/).

## Diagrammes

- [Modèle Conceptuel de Données (MCD)](docs/mcd.PNG)
- [Diagramme de Classes UML](docs/uml.PNG)

Pour visualiser ces diagrammes, vous pouvez utiliser :
- L'extension PlantUML pour VSCode
- Le [site web PlantUML](http://www.plantuml.com/plantuml/uml/)
- Ou tout autre outil compatible avec PlantUML

## Modification des Diagrammes

Pour modifier un diagramme :
1. Ouvrez le fichier `.puml` correspondant
2. Modifiez le contenu selon vos besoins
3. Commitez et pushez vos changements
4. La visualisation sera automatiquement mise à jour dans les outils compatibles

## Wireframes

Les wireframes de l'application Pomodoro sont disponibles dans le dossier [wireframes](wireframes/).

### Visualisation
- [Wireframe principal (PNG)](docs/wireframes/pomodorowireframe.png)
- [Version interactive sur Excalidraw](https://excalidraw.com/#json=o2KUfBnZDUJemf9yxZNjh,Oof_8vbA-xXK6gWxnW4tag)
   - Ce lien vous permet de voir et modifier le wireframe en temps réel.
   - Idéal pour la collaboration et les itérations rapides.

### Modification
Le fichier source Excalidraw est également disponible pour modification :
[Fichier source Excalidraw](docs/wireframes/pomodorowireframe.excalidraw)

Pour modifier le wireframe :
1. Téléchargez le fichier .excalidraw
2. Visitez [Excalidraw.com](https://excalidraw.com/)
3. Cliquez sur 'Open' et sélectionnez le fichier téléchargé
4. Après modification, exportez et mettez à jour les fichiers dans ce repository

## Installation et démarrage

### Prérequis
- Docker
- Docker Compose

Aucune installation locale de Java ou Maven n'est nécessaire grâce à l'utilisation de Docker.

## Configuration de l'environnement de développement

1. Clonez ce repository :

git clone https://github.com/your-organization/pomodoro-app-backend.git
cd pomodoro-app-backend

2. Lancez l'environnement de développement :

docker-compose -f docker-compose.dev.yml up --build

3. L'application sera accessible à l'adresse `http://localhost:8080`.

4. Pour arrêter l'application :

docker-compose -f docker-compose.dev.yml down

## Développement

- Les modifications apportées aux fichiers sources seront automatiquement détectées et l'application sera rechargée.
- Si vous modifiez le `pom.xml`, reconstruisez l'image Docker :

docker-compose -f docker-compose.dev.yml up --build

## Base de données de développement

- PostgreSQL est utilisé comme base de données de développement.
- Accès à la base de données :
- Host: localhost
- Port: 5432
- Database: pomodorodb
- Username: pomodoro
- Password: pomodoro

## Intégration Continue et Déploiement Continu (CI/CD)

Ce projet utilise GitHub Actions pour l'intégration continue et le déploiement continu.

- Les tests sont exécutés automatiquement à chaque push et pull request.
- Lorsqu'un push est effectué sur la branche `main` et que tous les tests passent, une nouvelle image Docker est automatiquement construite et poussée sur Docker Hub.

### Configuration Docker Hub

Ce projet utilise un compte Docker Hub dédié pour stocker les images Docker. 

Pour les membres de l'équipe :
- Les informations d'accès au compte Docker Hub du projet sont gérées par [nom du responsable ou de l'équipe].
- Si vous avez besoin d'accéder au compte Docker Hub pour le développement ou le déploiement, veuillez contacter [nom/email du responsable].

Pour la configuration CI/CD :
- Les secrets nécessaires (`DOCKER_HUB_USERNAME` et `DOCKER_HUB_ACCESS_TOKEN`) sont déjà configurés dans les paramètres du repository GitHub.
- Ces secrets sont gérés par les administrateurs du projet et ne nécessitent pas d'action de la part des développeurs individuels.

### Workflow CI/CD

Le workflow CI/CD est défini dans le fichier `.github/workflows/ci-cd.yml`. Il comprend les étapes suivantes :

1. Exécution des tests
2. Construction du projet avec Maven
3. Construction de l'image Docker
4. Push de l'image Docker sur Docker Hub (uniquement pour les pushes sur la branche `main`)

Vous pouvez suivre l'exécution du workflow dans l'onglet "Actions" de votre repository GitHub.

## Déploiement en production

Pour déployer en production, utilisez :

docker-compose -f docker-compose.prod.yml up --build

Assurez-vous d'avoir correctement configuré les variables d'environnement nécessaires pour la production.

## Contribution

1. Forkez le projet
2. Créez votre branche de fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Committez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Poussez vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request

Veuillez vous assurer que vos contributions respectent les normes de codage du projet et sont accompagnées de tests appropriés.

## Licence

Ce projet est sous licence [insérez le type de licence ici, par exemple MIT]. Voir le fichier `LICENSE` pour plus de détails.

## Contact

Pour toute question ou suggestion, n'hésitez pas à ouvrir une issue ou à contacter l'équipe de développement à [adresse email du projet].
