/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jamesfen.hbasethrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Specify type of delete:
 *  - DELETE_COLUMN means exactly one version will be removed,
 *  - DELETE_COLUMNS means previous versions will also be removed.
 */
public enum TDeleteType implements org.apache.thrift.TEnum {
  DELETE_COLUMN(0),
  DELETE_COLUMNS(1);

  private final int value;

  private TDeleteType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TDeleteType findByValue(int value) { 
    switch (value) {
      case 0:
        return DELETE_COLUMN;
      case 1:
        return DELETE_COLUMNS;
      default:
        return null;
    }
  }
}
