package com.food.ordering.system.domain.entity;

public abstract class BaseEntity<ID> {
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        BaseEntity<?> that = (BaseEntity<?>) object;
        return id.equals(that.id);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }
}
