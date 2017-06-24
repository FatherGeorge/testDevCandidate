package org.parts.service.fg;

import org.parts.model.Part;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortService {
    private Boolean ascending = true;
    private String sortField = "";

    public List<Part> applySort(List<Part> filteredParts, String sortField) {
        switch (sortField) {
            case "pn":
            case "partName":

                break;
        }
        return filteredParts;
    }
}
