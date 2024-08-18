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
- Node.js (version 14.x ou supérieure)
- Java JDK (version 11 ou supérieure)
- Maven
- PostgreSQL

### Frontend
```bash
cd pomodoro-app-frontend
npm install
npm start
