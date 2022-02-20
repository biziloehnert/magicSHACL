# Experiments

## Data Graph

## Shapes Graph

|S|Constraints| Targets | Recursion | 
|-|:---------:|:---------------:|:---------------: |
|1|     C1    | Movie(Film)     | |
|2|     C1    | Musician(Actor) | |
|3|     C1    | Person(Actor)   | |
|4|     C1    | Musician(Person)| |
|5|     C2    | Musician(Person)| Director <-> Movie |
|6|     C2    | Movie(Film)     | Director <-> Movie |
|7|     C3    | Musician(Person)| Influencer <-> not Influencer |
|8|     C4    | Movie(Film)     | Director <-> Movie, Influencer <-> not Influencer |
|9|     C5    | Movie(Film)     | Director <-> Movie, Director <-> not Director|

*todo: modify C3, C4 and C5 such that they the same set of shape constraints?*
