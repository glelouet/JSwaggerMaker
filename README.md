# JSwaggerMaker

Tools to compile the access and cache from a open api scheme.

# Main differences

This project is very close to [codegen](https://github.com/swagger-api/swagger-codegen) . A few added features :

## Produce cache

This project aims at producing not only the classes to acces, but also to represent locally the distant server. One specific goal is to react dynamically to the updates on the distant server.

## Highly parrallel 

Another feature is the ability to use the minimum time to repsent your dataset.

For example, if you have a server that has a list of repositories, and you want to know which repositories are older than 3years ; In a traditional project, you would get the list of the projects and would call each one in sequence. Here you do it, but the calls are non-blocking.

Of course this has a price, which is the need to use a specific framework : instead of getting your data directly, you make chaining operations on the data, with a terminal one. This look a lot like the Java Streams.

## In-memory representation

Also this can be used to produce in-memory code, thus to parse an url and produce a full API able to connect to a web server in the java code. I used it in some cases, but it's mostly only used for debuging and test purposes.
