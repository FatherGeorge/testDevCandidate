package org.parts.service;

import org.parts.dao.PartsDAO;
import org.parts.dao.PartsDAOImpl;
import org.parts.model.Part;
import org.parts.service.fg.SortService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PartsServiceImpl implements PartsService {
    private PartsDAO dao = new PartsDAOImpl();

    private List<Part> filteredParts;
    private SortService sortService = new SortService();

    public List<Part> getAllParts() {
        return dao.getAllParts();
    }

    @Override
    public List<Part> getArrangedParts(Dto dto) {
        if (dto.isFiltered()) {
            filteredParts = applyFilter(dto);
            return filteredParts;
        } else if (dto.isSorted()) {
            return sortService.applySort(filteredParts, dto.getSortField());
        }

        filteredParts = getAllParts();
        return filteredParts;
    }

    private List<Part> applyFilter(Dto dto) {
        dao.getAllParts();
        return null;
    }
}
