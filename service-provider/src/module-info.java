module service.provider {
    requires rt; // So that we can import List & Strings
    exports com.studyrelated.sorting.util; // So that we can export out util package to modules who requires our module.
}