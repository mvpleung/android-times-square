// Copyright 2012 Square, Inc.

package com.squareup.timessquare;

import java.util.Date;

/** Describes the state of a particular date cell in a {@link MonthView}. */
class MonthCellDescriptor {
  public enum RangeState {
    NONE, FIRST, MIDDLE, LAST
  }

  private final Date date;
  private final int value;
  private final boolean isCurrentMonth;
  private boolean isSelected;
  private final boolean isToday;
  private final boolean isSelectable;
  private final boolean isWeekend;
  private boolean isHighlighted;
  private String markValue;
  private RangeState rangeState;

  MonthCellDescriptor(Date date, boolean currentMonth, boolean selectable, boolean selected,
      boolean today, boolean highlighted,boolean weekend, int value, RangeState rangeState) {
    this.date = date;
    isCurrentMonth = currentMonth;
    isSelectable = selectable;
    isHighlighted = highlighted;
    isSelected = selected;
    isToday = today;
    isWeekend = weekend;
    this.markValue = null;
    this.value = value;
    this.rangeState = rangeState;
  }

  MonthCellDescriptor(Date date, boolean currentMonth, boolean selectable, boolean selected,
                      boolean today, boolean highlighted,boolean weekend, int value,String markValue, RangeState rangeState) {
    this.date = date;
    isCurrentMonth = currentMonth;
    isSelectable = selectable;
    isHighlighted = highlighted;
    isSelected = selected;
    isToday = today;
    isWeekend = weekend;
    this.markValue = markValue;
    this.value = value;
    this.rangeState = rangeState;
  }

  public Date getDate() {
    return date;
  }

  public boolean isCurrentMonth() {
    return isCurrentMonth;
  }

  public boolean isSelectable() {
    return isSelectable;
  }

  public boolean isSelected() {
    return isSelected;
  }

  public void setSelected(boolean selected) {
    isSelected = selected;
  }

  boolean isHighlighted() {
    return isHighlighted;
  }

  void setHighlighted(boolean highlighted) {
    isHighlighted = highlighted;
  }

  public boolean isToday() {
    return isToday;
  }

  public boolean isWeekend() {
    return isWeekend;
  }

  public RangeState getRangeState() {
    return rangeState;
  }

  public void setRangeState(RangeState rangeState) {
    this.rangeState = rangeState;
  }

  public String getMarkValue() {
    return markValue;
  }

  public void setMarkValue(String markValue) {
    this.markValue = markValue;
  }

  public int getValue() {
    return value;
  }

  @Override public String toString() {
    return "MonthCellDescriptor{"
        + "date="
        + date
        + ", value="
        + value
        + ", isCurrentMonth="
        + isCurrentMonth
        + ", isSelected="
        + isSelected
        + ", isToday="
        + isToday
        + ", isSelectable="
        + isSelectable
        + ", isHighlighted="
        + isHighlighted
        +", isWeekend="
        +isWeekend
        +", markValue="
        + markValue
        + ", rangeState="
        + rangeState
        + '}';
  }
}
