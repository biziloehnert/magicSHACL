# Experiments

## Data Graph
The [DBPedia dataset](https://databus.dbpedia.org/dbpedia/collections/latest-core) (latest core dataset release, publication year 2020, 11.78GB) was used as a data graph for the experiments. The complete latest-core dataset can be downloaded with the following (Linux) commands:

```cmd
query=$(curl -H "Accept:text/sparql" https://databus.dbpedia.org/dbpedia/collections/latest-core)
files=$(curl -H "Accept: text/csv" --data-urlencode "query=${query}" https://databus.dbpedia.org/repo/sparql | tail -n+2 | sed 's/"//g')
while IFS= read -r file ; do wget $file; done <<< "$files"
```
For the experiments merely the files "InstanceTypes", "Labels", "Mappingbased Literals", "Mappingbased Objects" and "PersonData" are required. Use the following command to download these files directly:
```cmd
$files = https://databus.dbpedia.org/dbpedia/mappings/instance-types/2021.12.01/instance-types_lang=en_specific.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/instance-types/2021.12.01/instance-types_lang=en_transitive.ttl.bz2 https://databus.dbpedia.org/vehnem/yago/instance-types/2016.10.01/instance-types_tag=specific.ttl.bz2 https://databus.dbpedia.org/dbpedia/generic/labels/2021.12.01/labels_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/mappingbased-literals/2021.12.01/mappingbased-literals_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/mappingbased-objects/2021.12.01/mappingbased-objects_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/generic/persondata/2021.12.01/persondata_lang=en.ttl.bz2 
while IFS= read -r file ; do wget $file; done <<< "$files"
```

The downloaded files must then be extracted, which can be done by executing the command below in the directory of the files: 

```cmd
bzip2 -d *.bz2
```
As a triple data base [Apache Jena TDB2](https://jena.apache.org/documentation/tdb2/tdb2_cmds.html) is used. The triples from DBPedia are loaded into the TDB by the following command: 
```cmd
./apache-jena-4.0.0/bin/tdb2.tdbloader --loc tdb *.ttl *.nt 
```
When loading the tripels to the tdb the tdbloader may complain about "Bad IRI". Lines containing a character that does not match the grammar for IRIs (i.e. BAD CHARACTER) can be deleted by the command below: 
```cmd
sed -i 's/[BAD CHARACTER]/d' *.ttl 
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
