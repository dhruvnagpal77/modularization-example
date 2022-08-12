module service.consumer {
    requires service.provider; // Used so we can use the packages which module "service.provider" is exporting.
    requires rt; // Used so we can import List & String.
}