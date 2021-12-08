package entity;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @SequenceGenerator(name = "category_generator", sequenceName = "CATEGORY_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "category_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "BREAKDOWN")
    private Long breakdown;


    @Column(name = "TOP_CATEGORY_ID")
    private Long topCategoryId;

    // Constructors
    public Category() {
    }

    public Category(Long id, String name, Long breakdown, Long topCategoryId) {
        this.id = id;
        this.name = name;
        this.breakdown = breakdown;
        this.topCategoryId = topCategoryId;
    }

    // Overrides
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breakdown=" + breakdown +
                ", topCategoryId=" + topCategoryId +
                '}';
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Long breakdown) {
        this.breakdown = breakdown;
    }

    public Long getTopCategoryId() {
        return topCategoryId;
    }

    public void setTopCategoryId(Long topCategoryId) {
        this.topCategoryId = topCategoryId;
    }
}
