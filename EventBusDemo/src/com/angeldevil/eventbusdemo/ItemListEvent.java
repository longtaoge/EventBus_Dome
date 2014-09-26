package com.angeldevil.eventbusdemo;

import java.util.List;

import com.angeldevil.eventbusdemo.dummy.DummyContent.DummyItem;

public class ItemListEvent extends Event{
    private List<DummyItem> items;

    public ItemListEvent(List<DummyItem> items) {
        this.items = items;
    }

    public List<DummyItem> getItems() {
        return items;
    }
}
