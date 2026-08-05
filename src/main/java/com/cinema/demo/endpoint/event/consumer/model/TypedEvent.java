package com.cinema.demo.endpoint.event.consumer.model;

import com.cinema.demo.PojaGenerated;
import com.cinema.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
