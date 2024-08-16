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

- [Modèle Conceptuel de Données (MCD)](mcd.puml)
- [Diagramme de Classes UML](class-diagram.puml)

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
