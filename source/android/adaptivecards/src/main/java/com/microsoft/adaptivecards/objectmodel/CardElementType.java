/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public final class CardElementType {
  public final static CardElementType Unsupported = new CardElementType("Unsupported", AdaptiveCardObjectModelJNI.CardElementType_Unsupported_get());
  public final static CardElementType AdaptiveCard = new CardElementType("AdaptiveCard");
  public final static CardElementType TextBlock = new CardElementType("TextBlock");
  public final static CardElementType Image = new CardElementType("Image");
  public final static CardElementType Container = new CardElementType("Container");
  public final static CardElementType Column = new CardElementType("Column");
  public final static CardElementType ColumnSet = new CardElementType("ColumnSet");
  public final static CardElementType FactSet = new CardElementType("FactSet");
  public final static CardElementType Fact = new CardElementType("Fact");
  public final static CardElementType ImageSet = new CardElementType("ImageSet");
  public final static CardElementType ChoiceInput = new CardElementType("ChoiceInput");
  public final static CardElementType ChoiceSetInput = new CardElementType("ChoiceSetInput");
  public final static CardElementType DateInput = new CardElementType("DateInput");
  public final static CardElementType NumberInput = new CardElementType("NumberInput");
  public final static CardElementType TextInput = new CardElementType("TextInput");
  public final static CardElementType TimeInput = new CardElementType("TimeInput");
  public final static CardElementType ToggleInput = new CardElementType("ToggleInput");
  public final static CardElementType Custom = new CardElementType("Custom");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CardElementType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CardElementType.class + " with value " + swigValue);
  }

  private CardElementType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CardElementType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CardElementType(String swigName, CardElementType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CardElementType[] swigValues = { Unsupported, AdaptiveCard, TextBlock, Image, Container, Column, ColumnSet, FactSet, Fact, ImageSet, ChoiceInput, ChoiceSetInput, DateInput, NumberInput, TextInput, TimeInput, ToggleInput, Custom };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

