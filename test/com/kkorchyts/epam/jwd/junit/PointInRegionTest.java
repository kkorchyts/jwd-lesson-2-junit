package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PointInRegionTest {
    public static pointInFigureApp.Region region;

    static {
        pointInFigureApp.Point regionPoint1 = new pointInFigureApp.Point(-4, 4);
        pointInFigureApp.Point regionPoint2 = new pointInFigureApp.Point(4, -4);
        region = new pointInFigureApp.Region(regionPoint1, regionPoint2);
    }

    @Test
    public void pointInRegionTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(2, 2));
        points.add(new pointInFigureApp.Point(-4, 4));
        points.add(new pointInFigureApp.Point(-4, 3));
        points.add(new pointInFigureApp.Point(-4, -3));
        points.add(new pointInFigureApp.Point(-4, -4));

        points.add(new pointInFigureApp.Point(-3, 4));
        points.add(new pointInFigureApp.Point(-3, 3));
        points.add(new pointInFigureApp.Point(-3, -3));
        points.add(new pointInFigureApp.Point(-3, -4));


        points.add(new pointInFigureApp.Point(3, 4));
        points.add(new pointInFigureApp.Point(3, 3));
        points.add(new pointInFigureApp.Point(3, -3));
        points.add(new pointInFigureApp.Point(3, -4));

        points.add(new pointInFigureApp.Point(4, 4));
        points.add(new pointInFigureApp.Point(4, 3));
        points.add(new pointInFigureApp.Point(4, -3));
        points.add(new pointInFigureApp.Point(4, -4));

        for (pointInFigureApp.Point point: points) {
            Assert.assertTrue(pointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(-10, 10));
        points.add(new pointInFigureApp.Point(-10, 5));
        points.add(new pointInFigureApp.Point(-10, 4));
        points.add(new pointInFigureApp.Point(-10, 3));
        points.add(new pointInFigureApp.Point(-10, 0));
        points.add(new pointInFigureApp.Point(-10, -3));
        points.add(new pointInFigureApp.Point(-10, -4));
        points.add(new pointInFigureApp.Point(-10, -5));
        points.add(new pointInFigureApp.Point(-10, -10));

        points.add(new pointInFigureApp.Point(-5, 10));
        points.add(new pointInFigureApp.Point(-5, 5));
        points.add(new pointInFigureApp.Point(-5, 4));
        points.add(new pointInFigureApp.Point(-5, 3));
        points.add(new pointInFigureApp.Point(-5, 0));
        points.add(new pointInFigureApp.Point(-5, -3));
        points.add(new pointInFigureApp.Point(-5, -4));
        points.add(new pointInFigureApp.Point(-5, -5));
        points.add(new pointInFigureApp.Point(-5, -10));

        points.add(new pointInFigureApp.Point(5, 10));
        points.add(new pointInFigureApp.Point(5, 5));
        points.add(new pointInFigureApp.Point(5, 4));
        points.add(new pointInFigureApp.Point(5, 3));
        points.add(new pointInFigureApp.Point(5, 0));
        points.add(new pointInFigureApp.Point(5, -3));
        points.add(new pointInFigureApp.Point(5, -4));
        points.add(new pointInFigureApp.Point(5, -5));
        points.add(new pointInFigureApp.Point(5, -10));

        points.add(new pointInFigureApp.Point(10, 10));
        points.add(new pointInFigureApp.Point(10, 5));
        points.add(new pointInFigureApp.Point(10, 4));
        points.add(new pointInFigureApp.Point(10, 3));
        points.add(new pointInFigureApp.Point(10, 0));
        points.add(new pointInFigureApp.Point(10, -3));
        points.add(new pointInFigureApp.Point(10, -4));
        points.add(new pointInFigureApp.Point(10, -5));
        points.add(new pointInFigureApp.Point(10, -10));

        for (pointInFigureApp.Point point: points) {
            Assert.assertFalse(pointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionXInYNotTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(-4, 10));
        points.add(new pointInFigureApp.Point(-4, 5));
        points.add(new pointInFigureApp.Point(-4, -5));
        points.add(new pointInFigureApp.Point(-4, -10));

        points.add(new pointInFigureApp.Point(-3, 10));
        points.add(new pointInFigureApp.Point(-3, 5));
        points.add(new pointInFigureApp.Point(-3, -5));
        points.add(new pointInFigureApp.Point(-3, -10));

        points.add(new pointInFigureApp.Point(0, 10));
        points.add(new pointInFigureApp.Point(0, 5));
        points.add(new pointInFigureApp.Point(0, -5));
        points.add(new pointInFigureApp.Point(0, -10));

        points.add(new pointInFigureApp.Point(3, 10));
        points.add(new pointInFigureApp.Point(3, 5));
        points.add(new pointInFigureApp.Point(3, -5));
        points.add(new pointInFigureApp.Point(3, -10));

        points.add(new pointInFigureApp.Point(4, 10));
        points.add(new pointInFigureApp.Point(4, 5));
        points.add(new pointInFigureApp.Point(4, -5));
        points.add(new pointInFigureApp.Point(4, -10));

        for (pointInFigureApp.Point point: points) {
            Assert.assertFalse(pointInFigureApp.pointIsInRegion(region, point));
        }
    }

    @Test
    public void pointNotInRegionXNotYInTest() {
        List<pointInFigureApp.Point> points =  new ArrayList<>();
        points.add(new pointInFigureApp.Point(10, -4));
        points.add(new pointInFigureApp.Point(5, -4));
        points.add(new pointInFigureApp.Point(-5, -4));
        points.add(new pointInFigureApp.Point(-10, -4));

        points.add(new pointInFigureApp.Point(10, -3));
        points.add(new pointInFigureApp.Point(5, -3));
        points.add(new pointInFigureApp.Point(-5, -3));
        points.add(new pointInFigureApp.Point(-10, -3));

        points.add(new pointInFigureApp.Point(10, 0));
        points.add(new pointInFigureApp.Point(5, 0));
        points.add(new pointInFigureApp.Point(-5, 0));
        points.add(new pointInFigureApp.Point(-10, 0));

        points.add(new pointInFigureApp.Point(10, 3));
        points.add(new pointInFigureApp.Point(5, 3));
        points.add(new pointInFigureApp.Point(-5, 3));
        points.add(new pointInFigureApp.Point(-10, 3));

        points.add(new pointInFigureApp.Point(10, 4));
        points.add(new pointInFigureApp.Point(5, 4));
        points.add(new pointInFigureApp.Point(-5, 4));
        points.add(new pointInFigureApp.Point(-10, 4));

        for (pointInFigureApp.Point point: points) {
            Assert.assertFalse(pointInFigureApp.pointIsInRegion(region, point));
        }
    }
}
