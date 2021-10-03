package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointInFigureTest {
    public static final pointInFigureApp.Region[] regions;

    static {
        regions = new pointInFigureApp.Region[2];
        pointInFigureApp.Point regionPoint1 = new pointInFigureApp.Point(-2, 4);
        pointInFigureApp.Point regionPoint2 = new pointInFigureApp.Point(2, 0);
        regions[0] = new pointInFigureApp.Region(regionPoint1, regionPoint2);

        regionPoint1 = new pointInFigureApp.Point(-4, 0);
        regionPoint2 = new pointInFigureApp.Point(4, -3);
        regions[1] = new pointInFigureApp.Region(regionPoint1, regionPoint2);
    }

    @Test
    public void pointInFigureTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(1, 1));
        points.add(new pointInFigureApp.Point(-3, 0));
        points.add(new pointInFigureApp.Point(-1, -1));

        for (pointInFigureApp.Point point: points) {
            Assert.assertTrue(pointInFigureApp.pointIsInFigure(regions, point));
        }
    }

    @Test
    public void pointNotInFigureTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(-3, 1));
        points.add(new pointInFigureApp.Point(-1, 5));
        points.add(new pointInFigureApp.Point(3, 2));

        for (pointInFigureApp.Point point: points) {
            Assert.assertFalse(pointInFigureApp.pointIsInFigure(regions, point));
        }
    }
}
