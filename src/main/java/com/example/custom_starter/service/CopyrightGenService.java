package com.example.custom_starter.service;

import com.example.custom_starter.config.StarterCopyrightProperties;

import java.time.LocalDate;

public class CopyrightGenService {
    private final StarterCopyrightProperties props;

    public CopyrightGenService(StarterCopyrightProperties props) {
        this.props = props;
    }

    public String generateCopyright() {
        return String.format("(c) %s %s", LocalDate.now().getYear(), props.getAuthor());
    }
}
