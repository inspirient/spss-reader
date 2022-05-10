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

### 1.4inspirient1 - 2022-05-10

- Fork based 1.4-SNAPSHOT (commit [c675df9](https://github.com/bedatadriven/spss-reader/commit/c675df9a93b2bc02013cac02607fcf76804e5ea3)) [@bedatadriven](https://github.com/bedatadriven/spss-reader).
- Remove setup instructions that are not applicable to this to avoid confusion.

### 1.3 - 2020-02-04

- Support for very long strings [@ElmervcElmervc](https://github.com/Elmervc).
- Support for extended number of cases record [@ElmervcElmervc](https://github.com/Elmervc).
- Support for write and print formats [@gdecaso](https://github.com/gdecaso).

