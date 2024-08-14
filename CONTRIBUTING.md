# Contribuer au Projet Pomodoro App

## Structure des Branches

Notre projet utilise la structure de branches suivante :
- `main` : Code en production
- `develop` : Branche d'intégration pour les nouvelles fonctionnalités
- `feature/*` : Pour les nouvelles fonctionnalités ou améliorations
- `bugfix/*` : Pour les corrections de bugs
- `hotfix/*` : Pour les correctifs critiques en production

## Convention de Nommage des Branches

Utilisez le format suivant pour nommer vos branches :
- Pour les fonctionnalités : `feature/[initiales]/[description]`
- Pour les corrections de bugs : `bugfix/[initiales]/[description]`
- Pour les correctifs urgents : `hotfix/[initiales]/[description]`

Exemple : `feature/jd/timer-pomodoro` pour une fonctionnalité de timer Pomodoro développée par Jean Dupont.

## Création de Nouvelles Branches

### Pour une nouvelle fonctionnalité :

git checkout develop
git pull origin develop
git checkout -b feature/vos-initiales/nom-de-la-fonctionnalité

### Pour un bugfix :
git checkout develop
git pull origin develop
git checkout -b bugfix/vos-initiales/description-du-bug

### Pour un hotfix :
git checkout main
git pull origin main
git checkout -b hotfix/vos-initiales/description-du-correctif

## Workflow de Développement

1. Créez une nouvelle branche à partir de `develop` pour votre travail
2. Effectuez vos modifications et commitez régulièrement
3. Poussez votre branche et créez une Pull Request vers `develop`
4. Après revue et approbation, la branche sera fusionnée dans `develop`
5. Périodiquement, `develop` sera fusionné dans `main` pour les releases

## Messages de Commit

Utilisez des messages de commit clairs et descriptifs. Préfixez avec le type :
- feat: Une nouvelle fonctionnalité
- fix: Une correction de bug
- docs: Changements dans la documentation
- style: Formatage, point-virgules manquants, etc. ; pas de changement de code
- refactor: Refactorisation du code de production
- test: Ajout de tests, refactorisation de tests ; pas de changement de code de production
- chore: Mise à jour des tâches de build, configurations de gestionnaire de paquets, etc. ; pas de changement de code de production

## Pull Requests

- Fournissez une description claire des changements
- Référencez les issues liées
- Assurez-vous que tous les tests passent avant de demander une revue
- Demandez une revue à au moins un autre membre de l'équipe

## Revue de Code

- Soyez respectueux et constructif dans vos commentaires
- Concentrez-vous sur le code, pas sur la personne
- Expliquez le raisonnement derrière vos suggestions
- Approuvez la PR une fois que vous êtes satisfait des changements

## Tests

- Écrivez des tests unitaires pour toutes les nouvelles fonctionnalités
- Maintenez une couverture de test élevée
- Assurez-vous que tous les tests passent avant de soumettre une PR

## Standards de Code

- Suivez les conventions de codage établies pour Java/Spring (backend) et React (frontend)
- Utilisez des outils de formatage automatique quand c'est possible
- Commentez votre code de manière claire et concise
