# Experiments

## Data Graph
The [DBPedia dataset](https://databus.dbpedia.org/dbpedia/collections/latest-core) (latest core dataset release, publication year 2020, 11.78GB) was used as a data graph for the experiments. The complete latest-core dataset can be downloaded with the following (Linux) commands:

```cmd
query=$(curl -H "Accept:text/sparql" https://databus.dbpedia.org/dbpedia/collections/latest-core)
files=$(curl -H "Accept: text/csv" --data-urlencode "query=${query}" https://databus.dbpedia.org/repo/sparql | tail -n+2 | sed 's/"//g')
while IFS= read -r file ; do wget $file; done <<< "$files"
```
For the experiments merely the files "InstanceTypes", "Labels", "Mappingbased Literals", "Mappingbased Objects" and "PersonData" (from 2016, because the PersonData from 2021 is empty) are required. Use the following command to download these files directly:
```cmd
files="https://databus.dbpedia.org/dbpedia/mappings/instance-types/2021.12.01/instance-types_lang=en_specific.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/instance-types/2021.12.01/instance-types_lang=en_transitive.ttl.bz2 https://databus.dbpedia.org/vehnem/yago/instance-types/2016.10.01/instance-types_tag=specific.ttl.bz2 https://databus.dbpedia.org/dbpedia/generic/labels/2021.12.01/labels_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/mappingbased-literals/2021.12.01/mappingbased-literals_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/mappings/mappingbased-objects/2021.12.01/mappingbased-objects_lang=en.ttl.bz2 https://databus.dbpedia.org/dbpedia/generic/persondata/2016.10.01/persondata_lang=en.ttl.bz2"
while IFS= read -r file ; do wget $file; done <<< "$files"
```

The downloaded files must then be extracted, which can be done by executing the command below in the directory of the files: 

```cmd
bzip2 -d *.bz2
```
As a triple data base [Apache Jena TDB2](https://jena.apache.org/documentation/tdb2/tdb2_cmds.html) is used. The triples from DBPedia are loaded into the TDB by the following command: 
```cmd
<PATH-TO>/apache-jena-4.0.0/bin/tdb2.tdbloader --loc <PATH-TO>/tdb *.ttl
```
When loading the tripels to the tdb the tdbloader may complain about "Bad IRI". Apache Jena provides a tool to validate the syntax of the datasets before loading it to the triple store: 
```cmd
<PATH-TO>/apache-jena-4.0.0/bin/riot --validate *.ttl
```
The dataset can be converted into ASCII encoding by the following command (note that by this some IRIs might change):
```cmd
iconv -f utf-8 -t ascii//TRANSLIT <INPUT_PATH> -o <OUTPUT_PATH>
```
Lines containing a character that does not match the grammar for IRIs (i.e. BAD CHARACTER) can be deleted by the command below: 
```cmd
sed -i 's/<BAD CHARACTER>/d' *.ttl 
```
<!---As a SPARQL server we used [Apache Jena Fuseki](https://jena.apache.org/documentation/fuseki2/fuseki-webapp.html#fuseki-standalone-server). To start the server with the triple dataset loaded above execute the command below. 
```cmd
fuseki-server --loc=<PATH-TO>/tdb --update /DBPedia
```
-->

## Shapes Graph
The shapes graphs for the experiments are created based on two different sets of shape constraints, namely C1 and C2. Each of the sets is combined with 20 different targets to form 40 different shapes graphs/test cases. The targets used for this purpose are shown in the Table below.

|S | Targets                          | S |  Targets                |  
|- |:--------------------------------:|-  | :----------------------:|
|1 | Musician(Wolfgang_Amadeus_Mozart)|11 | Employee(Actor)         |
|2 | Musician(Actor)                  |12 | Employee(Person)        |
|3 | Musician(Person)                 |13 | WorkingPerson(bill)     |
|4 | Actor(cameronHallactor)          |14 | WorkingPerson(markMadoff)|
|5 | Actor(Actor)                     |15 | WorkingPerson(Actor)    |
|6 | Actor(Person)                    |16 | WorkingPerson(Person)   |
|7 | Movie(Film)                      |17 | WorkingClass(bill)      |
|8 | TranslatedMovie(Film)            |18 | WorkingClass(markMadoff)|
|9 | Employee(bill)                   |19 | WorkingClass(Actor)     |
|10| Employee(markMadoff)             |20 | WorkingClass(Person)    |
