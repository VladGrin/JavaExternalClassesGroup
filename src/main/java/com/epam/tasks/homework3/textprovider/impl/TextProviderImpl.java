package com.epam.tasks.homework3.textprovider.impl;

import com.epam.tasks.homework3.textprovider.TextProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextProviderImpl implements TextProvider {

    @Override
    public String getText() {

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("temp.txt")))) {

            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
                stringBuilder.append(" ");
            }

        } catch (IOException e) {
            e.getStackTrace();
        }

        return stringBuilder.toString();
    }
}
