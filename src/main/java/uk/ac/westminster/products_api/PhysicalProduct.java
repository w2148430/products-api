package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits from Product and represents type of product with physical properties.
// ShoppingCart would NOT pass this test because a shopping cart contains products rahter than being a type of product
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // (a) Empty no-arg constructor for Jackson
    public PhysicalProduct() {
    }

    // (b) Full constructor
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // (c) Getters
    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}