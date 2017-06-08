package org.parts.service;

import org.parts.model.Part;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by FRIEND on 07.06.2017.
 */
public class PartsServiceImpl implements PartsService {
    private List<Part> parts = new ArrayList<>();

    {
        parts.add(new Part("10", "Flame thrower" ,"factory", 10, new GregorianCalendar(2017, 4, 7).getTime(), new GregorianCalendar(2017, 5, 7).getTime()));
        parts.add(new Part("50", "Rocket launcher" ,"factory", 10, new GregorianCalendar(2017, 4, 7).getTime(), new GregorianCalendar(2017, 5, 7).getTime()));
        parts.add(new Part("60", "Gas splitter" ,"factory", 10, new GregorianCalendar(2017, 4, 7).getTime(), new GregorianCalendar(2017, 5, 7).getTime()));
    }

    @Override
    public List<Part> getAllParts() {
        return parts;
    }


}
