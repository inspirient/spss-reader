# SPSS Reader

Java library to read SPSS files.

## Reading an SPSS File
 
    SpssDataFileReader reader = new SpssDataFileReader("mydata.sav");
    
    // Print variables present in the file
    for(SpssVariable variable : reader.getVariables()) {
        System.out.println(variable.getLabel());
    }
    
    // Read the cases
    while(reader.readNextCase()) {
        double var0 = reader.getDoubleValue(0);
        String var1 = reader.getStringValue(1);
    }
    
## Changelog

### 1.4inspirient12 - 2023-11-06

- Correctly skip SPSS Document Records

### 1.4inspirient11 - 2023-07-04

- Add support for reading SPSS files larger than 2GB via BufferedInputStream
- Remove restart functionality (cannot be supported at the same time as above)

### 1.4inspirient10 - 2023-07-04

- Bump to Java 8 to support lamda expressions

### 1.4inspirient9 - 2023-07-04

- Optimization: Further avoid object creation overhead

### 1.4inspirient8 - 2023-07-04

- Correctly initialize array

### 1.4inspirient7 - 2023-07-04

- Avoid Java 11 dependency

### 1.4inspirient6 - 2023-07-04

- Optimize code: Avoid creating objects in inner loop, avoid repeatedly appending single-character

### 1.4inspirient5 - 2023-06-14

- Ensure a valid storage flag is available at all times (fixes StringIndexOutOfBoundsException)

### 1.4inspirient4 - 2022-05-10

- Explicitly use same encoding when retrieving short variable names (fixes NullPointerException)
- Fix of-by-one indexing issue when retrieving the weight variable index (fixes ArrayIndexOutOfBoundsException when weight variable is last variable in SPSS file)

### 1.4inspirient3 - 2022-05-10

- Merge fixes and clean-ups. First production release.

### 1.4inspirient2 - 2022-05-10

- Merge commit [f01dc1e](https://github.com/Elmervc/spss-reader/commit/f01dc1ec34f4f16d26e0eed4ebaa5a2ee3048843) from [@Elmervc](https://github.com/Elmervc): Use encoding from version info
- Merge commit [56a6e74](https://github.com/tzeman77/spss-reader/commit/56a6e74de1cd61998826e1fb943231661927c219) from [@tzeman77](https://github.com/tzeman77): Optional charset for SpssInputStream

### 1.4inspirient1 - 2022-05-10

- Fork based on 1.4-SNAPSHOT (commit [c675df9](https://github.com/bedatadriven/spss-reader/commit/c675df9a93b2bc02013cac02607fcf76804e5ea3)) [@bedatadriven](https://github.com/bedatadriven/spss-reader).
- Remove setup instructions that are not applicable to this fork to avoid confusion.

### 1.3 - 2020-02-04

- Support for very long strings [@ElmervcElmervc](https://github.com/Elmervc).
- Support for extended number of cases record [@ElmervcElmervc](https://github.com/Elmervc).
- Support for write and print formats [@gdecaso](https://github.com/gdecaso).

