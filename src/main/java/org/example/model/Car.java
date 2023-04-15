package org.example.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {
  private long id;
  private String brand;
  private String model;
  private int manufactureYear;
  private float engineSize;
}
