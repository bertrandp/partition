# Partition

Partition is a library that contains static methods to split an array into smaller chunks.
If you want to partition list instead of array then you can use [Lists.partition(java.util.List, int)](https://google.github.io/guava/releases/19.0/api/docs/com/google/common/collect/Lists.html#partition(java.util.List,%20int)) from Google Guava.

## How to use it with maven

Download sources and run `mvn install` to install the library in your local repository.

Add the dependency to your project:

```xml
<dependency>
  <groupId>pestre.bertrand</groupId>
  <artifactId>partition</artifactId>
  <version>1.0</version>
</dependency>
```

Examples:

```java
int[] intArray = {1, 2, 3, 4, 5};
int[][] subarrays = Partition.partition(intArray, 2);  // [[1,2],[3,4],[5]]
```

```java
String[] stringArray = {"1", "2", "3", "4", "5"};
String[][] result = Partition.partition(stringArray, 3); // [["1","2","3"],["4","5"]]
```
