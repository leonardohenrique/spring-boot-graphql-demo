package com.example.graphqldemo.record;

import java.util.List;

public record BookInput(String title, Integer pageCount, Long authorId, List<Long> genreIds) {
}
