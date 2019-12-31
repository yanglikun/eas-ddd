package xyz.zhangyi.ddd.eas.trainingcontext.training;

import java.util.Objects;

public class TrainingId {
    private String id;

    public TrainingId(String id) {
        this.id = id;
    }

    public static TrainingId from(String id) {
        return new TrainingId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingId that = (TrainingId) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}