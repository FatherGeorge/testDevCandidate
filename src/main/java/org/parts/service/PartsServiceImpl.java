package org.parts.service;

import org.parts.dao.PartsDAO;
import org.parts.dao.PartsDAOImpl;
import org.parts.model.Part;
import org.parts.service.fg.SortService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PartsServiceImpl implements PartsService {
    private PartsDAO dao = new PartsDAOImpl();

    private ArrayList<Part> filteredParts;
    private SortService sortService = new SortService();

    public List<Part> getAllParts() {
        return dao.getAllParts();
    }

    @Override
    public List<Part> getArrangedParts(Dto dto) {
        if (dto.isFiltered()) {
            filteredParts = applyFilter((ArrayList<Part>) getAllParts(), dto);
            return filteredParts;
        } else if (dto.isSorted()) {
            return sortService.applySort(filteredParts, dto.getSortField());
        }

        filteredParts = (ArrayList<Part>) getAllParts();
        return filteredParts;
    }

    private ArrayList<Part> applyFilter(ArrayList<Part> allParts, final Dto dto) {

        if (!"".equals(dto.getPartNumber())) {
            filter(allParts, new Filter<Part>() {
                @Override
                public boolean shouldRemove(Part part) {
                    return !part.getPartNumber().contains(dto.getPartNumber());
                }
            });
        }
        if (!"".equals(dto.getPartName())) {
            filter(allParts, new Filter<Part>() {
                @Override
                public boolean shouldRemove(Part part) {
                    return !part.getPartName().contains(dto.getPartName());
                }
            });
        }
        if (!"".equals(dto.getVendor())) {
            filter(allParts, new Filter<Part>() {
                @Override
                public boolean shouldRemove(Part part) {
                    return !part.getVendor().contains(dto.getVendor());
                }
            });
        }
        return allParts;
    }

    private void filter(List<Part> allParts, Filter<Part> filter) {
        Iterator<Part> partsIterator = allParts.iterator();
        while (partsIterator.hasNext()) {
            Part part = partsIterator.next();
            if (filter.shouldRemove(part)) {
                partsIterator.remove();
            }
        }
    }


}
