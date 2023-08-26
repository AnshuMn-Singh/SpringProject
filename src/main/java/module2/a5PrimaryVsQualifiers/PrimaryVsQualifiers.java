package module2.a5PrimaryVsQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class QuickSort implements SortingAlgorithm {}

@Component
class BubbleSort implements SortingAlgorithm{}

@Component
@Qualifier("RadixSortQualifier")
class RadixSort implements SortingAlgorithm {}

@Component
class ComplexAlgorithm {
    @Autowired
    private SortingAlgorithm algorithm;

    
}

@Component
class AnotherComplexAlgorithm {
    @Autowired
    @Qualifier("RadixSortQualifier")
    private SortingAlgorithm iWantToUseRadixSortOnly;
}

public class PrimaryVsQualifiers {
}

/*
@Primary - A bean should be given preference when multiple candidates are qualified
@Qualifier - A specific bean should be auto-wired (name of the bean can be used as qualifier)
ALWAYS think from the perspective of the class using the SortingAlgorithm:
1: Just @Autowired: Give me (preferred) SortingAlgorithm
2: @Autowired + @Qualifier: I only want to use specific SortingAlgorithm - RadixSort
(REMEMBER) @Qualifier has higher priority then @Primary
*/