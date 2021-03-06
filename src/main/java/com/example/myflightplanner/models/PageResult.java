package com.example.myflightplanner.models;

import java.util.List;

public class PageResult {
  private int page = 0;
  private int totalItems;
  private List<Flight> items;

  public PageResult(List<Flight> items) {
    this.totalItems = items.size();
    this.items = items;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(int totalItems) {
    this.totalItems = totalItems;
  }

  public List<Flight> getItems() {
    return items;
  }

  public void setItems(List<Flight> items) {
    this.items = items;
  }
}
