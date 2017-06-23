package org.parts.service;

import org.parts.model.Part;

import java.util.List;

/**
 * Created by FRIEND on 07.06.2017.
 */
public interface PartsService {
    List<Part> getArrangedParts(Dto dto);
    List<Part> getAllParts();
}
