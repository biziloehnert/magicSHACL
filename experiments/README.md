# Experiments

## Data Graph
The [DBPedia dataset](https://databus.dbpedia.org/dbpedia/collections/latest-core) (latest core dataset release, publication year 2020, 11.78GB) was used as a data graph for the experiments. The dataset can be downloaded with the following (Linux) commands:

```
$ query=$(curl -H "Accept:text/sparql" https://databus.dbpedia.org/dbpedia/collections/latest-core)
$ files=$(curl -H "Accept: text/csv" --data-urlencode "query=${query}" https://databus.dbpedia.org/repo/sparql | tail -n+2 | sed 's/"//g')
$ while IFS= read -r file ; do wget $file; done <<< "$files"
```
The downloaded files must then be extracted, which can be done by executing the command below in the directory of the files: 

```
$ bzip2 -d *.bz2
```
As a triple data base [Apache Jena TDB2](https://jena.apache.org/documentation/tdb2/tdb2_cmds.html) is used. The triples from DBPedia are loaded into the TDB by the following command: 
```
$ ./apache-jena-4.0.0/bin/tdb2.tdbloader --loc tdb *.ttl *.nt 
```
When loading the tripels to the tdb the tdbloader may complain about "Bad IRI". Lines containing a character that does not match the grammar for IRIs (i.e. BAD CHARACTER) can be deleted by the command below: 
```
sed -i 's/<.*[BAD CHARACTER].*>/d' *.ttl 
```


## Shapes Graph
Employee <-- MIN 1 employer.NOT Employee

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
|9|     C5    | Movie(Film)     | Director <-> Movie, Director <-> not Director
