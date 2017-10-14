package model;
import lombok.Data;
import lombok.experimental.Builder;

/**
 * 通过lombok注解方式创建一个实体
 * 创建一个构建器(Builder)模式实例
 */
@Data
@Builder
public class Car {
    String carId;
    String carName;
    String creator;
}
