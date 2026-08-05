package com.cinema.demo.file.hash;

import com.cinema.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
