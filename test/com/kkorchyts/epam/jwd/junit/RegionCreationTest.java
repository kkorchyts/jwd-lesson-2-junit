package com.kkorchyts.epam.jwd.junit;

import org.junit.Assert;
import org.junit.Test;

public class RegionCreationTest {

    @Test
    public void regionCreationPointInRightOrderTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(-2, 4);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(2, 0);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(2, 0);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(-2, 4);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInRightOrderWrongYOrderTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(-2, 0);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(2, 4);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderWrongXOrderTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(2, 4);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(-2, 0);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    // XEquals

    @Test
    public void regionCreationPointInRightOrderXEqualsTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(0, 4);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(0, 0);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderXEqualsTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(0, 0);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(0, 4);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }

    // YEquals

    @Test
    public void regionCreationPointInRightOrderYEqualsTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(-2, 0);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(2, 0);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point1.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point1.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point2.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point2.getY(), region.getRightBottom().getY());
    }

    @Test
    public void regionCreationPointInWrongOrderYEqualsTest() {
        pointInFigureApp.Point point1 = new pointInFigureApp.Point(2, 0);
        pointInFigureApp.Point point2 = new pointInFigureApp.Point(-2, 0);
        pointInFigureApp.Region region = new pointInFigureApp.Region(point1, point2);
        Assert.assertEquals(point2.getX(), region.getLeftTop().getX());
        Assert.assertEquals(point2.getY(), region.getLeftTop().getY());
        Assert.assertEquals(point1.getX(), region.getRightBottom().getX());
        Assert.assertEquals(point1.getY(), region.getRightBottom().getY());
    }
}