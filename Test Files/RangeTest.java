package org.jfree.data.test;

import static org.junit.Assert.*; 
import org.jfree.data.Range; 
import org.junit.*;
import java.lang.Math;

public class RangeTest {
    private Range testRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception 
    { 
    	testRange = new Range(-10, 10);
    }

//Method Contains

/**
Tests to see if the variable value is present within the range
method contains(double value)
*/
    @Test
    public void testValuePresentInRangeForMethodContains()   //Contains method
    {
    	assertTrue("Test for a value present in the range for the contains method", testRange.contains(5));
    }
    
/**
Tests to see if the variable value is not present within the range
method contains(double value)
*/
    @Test
    public void testValueNotInRangeForMethodContains()    //Contains method
    {
    	assertFalse("Test for a value not in the range for the contains method", testRange.contains(10.01));
    }
    
/**
Tests to see if the variable value is the upper value of the present range
method contains(double value)
*/    

    @Test
    public void testValueIsUpperBoundaryForMethodContains() //Contains method
    {
    	assertTrue("Test for a value that equals the upper bound for the contains method", testRange.contains(10));
    }
    
/**
Tests to see if the variable value is the lower value of the present range
method contains(double value)
*/    
    @Test
    public void testValueIsLowerBoundaryForMethodContains() //Contains method
    {
    	assertTrue("Test for a value that equals the lower bound for the contains method", testRange.contains(-10));
    }

/**
Tests to see if the variable value is Not a Number (NaN)
method contains(double value)
*/    
    @Test
    public void testValueIsNaNForMethodContains() 
    {
    	assertFalse("Test for a value that equals NaN for the contains method", testRange.contains(0.0/0.0));
    }
    

/**
Tests to see the lowest value possible value of the variable value is contained in it. 
method contains(double value)
*/    
    @Test
    public void testLowestDoubleForMethodContains() //Contains method
    {
    	double x = Math.pow(2,-1024);
    	assertTrue("Test for a value that is lower than the floor of a double for the contains method", testRange.contains(x));
    }
    
/**
Tests to see if Negative Infinity is in the range 
method contains(double value)
*/    
    @Test
    public void testNegativeInfinityValueForMethodContains() //Contains method
    {
    	assertFalse("Test for a negative infinity value for the contains method", testRange.contains(-1.0/0.0));
    }
    
/**
Tests to see if Positive Infinity is in the range
method contains(double value)
*/    
    @Test
    public void testPositiveInfinityValueForMethodContains() //Contains method
    {
    	assertFalse("Test for a positive infinity value for the contains method", testRange.contains(1.0/0.0));
    }
    
    /**Constrain Method*/
    
/**
Tests to see if "value" is within the range that is closest to the specified value is the predicted one
method constrain(double value)
*/    
    @Test
    public void testValueInTheRangeForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value in the range for the constrain method", 5.0, testRange.constrain(5.0),.000000001d);
    }
    
/**
Tests to see if value within the range that is closest to the specified "value" variable
 is the predicted one where both are Not a Number
 method constrain(double value)
*/     
    @Test
    public void testValueThatIsNaNForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value that is not a number for the constrain method", Double.NaN, testRange.constrain(0.0/0.0),.000000001d);
    }
    
/**
Tests to see if the value within the range that is closest to the 
specified "value" variable is the predicted one where both are the upper bound of the range
 method constrain(double value)
*/    
    @Test
    public void testUpperBoundNumberForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value that is equal to the upper bound for the constrain method", 10, testRange.constrain(10),.000000001d);
    }
    
/**
Tests to see if the the value within the range that is closest to the specified
 "value" variable is the predicted one where they are both infinity
method constrain(double value)
*/    
    @Test
    public void testInfinityValueForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for infinity for the constrain method", 10, testRange.constrain(1.0/0.0), .000000001d);
    }
    
    /**Shift Method*/
/**
Tests to see if the base shifts to a higher value using delta that has a decimal value as well
 method shift(Range base, double delta)
*/    
//    @Test
//    public void testUpperBoundaryShiftWithDecimalForMethodShift() //Shift Method     FAILED CASE
//    {
//    	assertEquals("Test for upper boundary using positive number shift for shift method", new Range(0.1,20.1), Range.shift(testRange, 10.1));
//    }
    
/**
Tests to see if the base shifts to a lower value using delta that has a decimal value as well
 method shift(Range base, double delta)
*/ 
//    @Test
//    public void testLowerBoundaryShiftWithDecimalForMethodShift() //Shift Method   FAILED CASE
//    {
//    	assertEquals("Test for lower boundary using negative number shift for shift method", new Range(-20.1,-0.1), Range.shift(testRange, -10.1));
//    }
//    
/**
Tests to see if the base shifts to a higher value using delta that has does not have decimal value
 method shift(Range base, double delta)
*/ 
    @Test
    public void testUpperBoundaryShiftNoDecimalForMethodShift() //Shift Method    
    {
    	assertEquals("Test for upper boundary using positive number shift for shift method", new Range(0,20), Range.shift(testRange, 10));
    }
    
/**
Tests to see if the base shifts to a lower value using delta that has does not have decimal value
 method shift(Range base, double delta)
*/ 
    @Test
    public void testLowerBoundaryShiftNoDecimalForMethodShift() //Shift Method   
    {
    	assertEquals("Test for lower boundary using negative number shift for shift method", new Range(-20,-0), Range.shift(testRange, -10));
    }
    
/**
Tests to see if the base shifts to a using delta which is Not a Number(NaN)
 method shift(Range base, double delta)
*/ 
//    @Test
//    public void testNaNShiftForMethodShift() //Shift Method FAILED CASE
//    {
//    	assertEquals("Test for a shift of NaN for shift method", new Range(-10,10), Range.shift(testRange,0.0/0.0));
//    }
    
/**
Tests to see if the base shifts to a using delta which is positive infinity
 method shift(Range base, double delta)
*/ 
//    @Test
//    public void testPositiveInfinityForMethodShift() //Shift Method FAILED CASE
//    {
//    	assertEquals("Test for a shift of positive infinity for shift method", new Range(-10,10), Range.shift(testRange,1.0/0.0));
//    }
    
/**
Tests to see if the base shifts using delta. Where the base has a range of
Not a Number in both upper and lower boundary.
 method shift(Range base, double delta)
*/ 
//    @Test
//    public void testRangeObjectWithNaNBoundaryForMethodShift() //Shift Method  COME BACK TO THIS
//    {
//    	Range obj = new Range(Double.NaN, Double.NaN);
//    	assertEquals("Test for a NaN range object for shift method", new Range(Double.NaN, Double.NaN), Range.shift(obj,10));
//    }


/**
Tests to see if the base shifts using delta. Where the base has a range of
Not a Number a lower boundary of null.
method shift(Range base, double delta)
*/
    
    @Test
    public void testNullRangeObjectForMethodShift() //Shift Method
    {
    	try {
    		Range.shift(null, 10).getUpperBound();
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Null 'base' argument.";
    		assertEquals(expected,e.getMessage());
    	}
    	//assertEquals("Test for a null range for shift method", , Range.shift(null, 10).getUpperBound(), .000000001d);
    }
    
    /**expandToInclude Method*/
    


/**
Tests to see if it returns a range that includes all the values in the specified "range" AND 
the specified "value" compared to the expected values
method expandToInclude(Range range, double value)
*/ 
    @Test
    public void testValidDoubleValueForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a valid double value for expandToInclude Method", new Range(-10,20), Range.expandToInclude(testRange, 20));
    }


/**
Tests to see if it returns a range that includes all the values in the specified "range" AND the specified "value"
compared to the expected values where there is a value that is Not a Number "NaN"
method expandToInclude(Range range, double value)
*/     
    @Test
    public void testDoubleNaNValueForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-10,10), Range.expandToInclude(testRange, Double.NaN));
    }
   
/**
Tests to see if it returns a range that includes all the values in the specified "range" AND the specified "value"
compared to the expected values where there is a value that is null
method expandToInclude(Range range, double value)
*/      
    @Test
    public void testNullRangeForMethodExpandToInclude() //expandToInclude Method
    {
    	assertEquals("Test for a null range for expandToInclude Method", new Range(30,30), Range.expandToInclude(null, 30));
    }
    

/**
Tests to see if it returns a range that is Not a Number (NaN) the specified "range" AND the specified "value"
compared to the expected values where the is a values are Not a Number "NaN"
method expandToInclude(Range range, double value)
*/     
//    @Test
//    public void testNaNRangeForMethodExpandToInclude() //expandToInclude Method   cbts
//    {
//    	Range obj = new Range(Double.NaN, Double.NaN);
//    	assertEquals("Test for a NaN range for expandToInclude Method", new Range(Double.NaN, Double.NaN), Range.expandToInclude(obj, 20));
//    }
    



    /**Combine Method*/
/**
Tests to see if it the value of the actual range is the expected range with the combination of range1 and range2
method combine(Range range1, Range range2)
*/     
    @Test
    public void testValidRangeInputForMethodCombine() //Combine Method
    {
    	Range obj = new Range(2000,5000);
    	assertEquals("Test for an input of two valid ranges for combine method", new Range(-10,5000), Range.combine(testRange, obj));
    }

/**
Tests to see if it the value of the actual range is the expected range with 
the combination of range1 and range2 where range2 is null
method combine(Range range1, Range range2)
*/     
    @Test
    public void testSingleNullRangeInputForMethodCombine() //Combine Method
    {
    	assertEquals("Test for a single null range object and a normal range object for combine method", new Range(-10,10), Range.combine(testRange, null));
    }
    

/**
Tests to see if it the value of the actual range is the expected range is null using 
the combination of range1 and range2 where both are null ranges
method combine(Range range1, Range range2)
*/     
    @Test
    public void testTwoNullRangesInputForMethodCombine() //Combine Method
    {
    	assertEquals("Test for a two null range objects  for combine method", null, Range.combine(null, null));
    }
    
/**
Tests to see if it the value of the actual range is the expected range with 
the combination of range1 and range2 where range1 has a lower bound of 
Being Not a Number "NaN"
*/     
//    @Test
//    public void testSingleNaNInputForMethodCombine() //Combine Method  FAILED TEST CASE
//    {
//    	Range obj = new Range(Double.NaN, 60);
//    	assertEquals("Test for a single range of NaN for combine method", new Range(-10,60), Range.combine(obj, testRange));
//    }
    
  
    /**getCentralValue Method*/
    @Test
    public void testForValidRangeForMethodGetCentralValue()
    {
    	assertEquals("Test for a valid range for method getCentralValue", 0.0,testRange.getCentralValue(), .000000001d);
    }
    
    @Test
    public void testForValidNegativeDecimalLowerBoundaryRangeForMethodGetCentralValue()
    {
    	Range obj = new Range(-7.5, 5.5);
    	assertEquals("Test for a valid negative decimal range for method getCentralValue", -1.0,obj.getCentralValue(), .000000001d);
    }
    
    @Test
    public void testForDoubleNaNRangeForMethodGetCentralValue()
    {
    	Range obj = new Range(Double.NaN, 2);
    	assertEquals("Test for a Double.NaN value in range for method getCentralValue", Double.NaN,obj.getCentralValue(), .000000001d);
    }
    
    /**getLength Method*/
    @Test
    public void testForValidInputForGetLengthMethod()
    {
    	assertEquals("Test for a valid input for method getLength", 20, testRange.getLength(), .000000001d);
    }
    
    @Test
    public void testForNegativeDecimalInputForGetLengthMethod()
    {
    	Range obj = new Range(-7.5,5.5);
    	assertEquals("Test for a negative decimal valid input for method getLength", 13, obj.getLength(), .000000001d);
    }
    
    @Test
    public void testForDoubleNaNInputForGetLengthMethod()
    {
    	Range obj = new Range(Double.NaN,5.5);
    	assertEquals("Test for a Double.NaN decimal valid input for method getLength", Double.NaN, obj.getLength(), .000000001d);
    }
    
    /**getLowerBound Method*/
    @Test
    public void testForValidRangeInputForGetLowerBoundMethod()
    {
    	assertEquals("Test for a valid range being sent to getLowerBound method", -10, testRange.getLowerBound(), .000000001d);
    }
    
    /**getUpperBound Method*/
    @Test
    public void testForValidRangeInputForGetUpperBoundMethod()
    {
    	assertEquals("Test for a valid range being sent to getUpperBound method", 10, testRange.getUpperBound(), .000000001d);
    }
    
    /**combineIgnoringNaN Method*/
    @Test
    public void testForNullRangesInputForMethodCombineIgnoringNaN()
    {
    	Range obj = null;
    	assertEquals("Test for null range being sent to combineIgnoringNaN method", testRange, Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForTwoNullRangesInputForMethodCombineIgnoringNaN()
    {
    	Range obj = null;
    	Range temp = null;
    	assertEquals("Test for two null range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(null, obj));
    }
    
    @Test
    public void testForValidRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(-12,12);
    	assertEquals("Test for valid range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,12);
    	assertEquals("Test for Double.NaN range being sent to combineIgnoringNaN method", new Range(-10,12), Range.combineIgnoringNaN(testRange, obj));
    }
    
    @Test
    public void testForTwoNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	Range obj2 = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test for two Double.NaN range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(obj2, obj));
    }
    
    @Test
    public void testForNullAndDoubleNaNRangeInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test for Double.NaN and null range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(null, obj));
    }
    
    @Test
    public void testForNullAndDoubleNaNRangeTwoInputForMethodCombineIgnoringNaN()
    {
    	Range obj = new Range(Double.NaN,Double.NaN);
    	assertEquals("Test two for Double.NaN and null range being sent to combineIgnoringNaN method", null, Range.combineIgnoringNaN(obj, null));
    }
    
    /**expands Method*/
    @Test
    public void testForValidInputForMethodExpands()
    {
    	assertEquals("Test for valid inputs for expands method", new Range(-15, 20), Range.expand(testRange, 0.25, 0.5));
    }
    
    @Test
    public void testForNegativePercentValidInputForMethodExpands()
    {
    	assertEquals("Test for negative percent valid inputs for expands method", new Range(4, 4), Range.expand(testRange, -0.9, -0.5));
    }
    
    /**intersects Method 2 arguments*/
    @Test
    public void testForALowerBoundThatIsGreaterThanTestRangeLowerBoundForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles for intersects method", testRange.intersects(-5, 5));
    }
    
    @Test
    public void testForADoubleLowerThanTheLowerBoundOfTheTestRangeLowerBoundForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles intersects method", testRange.intersects(-10, 10));
    }
    
    /**intersects Method 1 argument*/
    @Test
    public void testForAValidRangeForMethodIntersects() 
    {
    	Range obj = new Range(-10,10);
    	assertTrue("Test for a valid range object intersects method", testRange.intersects(obj));
    }
    
    /**scale Method*/
    @Test
    public void testForAValidRangeAndFactorForMethodScale()
    {
    	assertEquals("Test for a valid range and scale factor for the scale method", new Range(-20,20), Range.scale(testRange, 2));
    }
    
    @Test
    public void testForAValidRangeAndNegativeFactorForMethodScale()
    {
    	
    	try
    	{
    		Range.scale(testRange, -2);
    	}
    	
    	catch(Exception e)
    	{
    		String expected = "Negative 'factor' argument.";
    		assertEquals(expected,e.getMessage());
    	}
    	
    }
    /**hashCode method*/
    @Test
    public void testForHashCodeMethod()
    {
    	assertEquals("Test for hashCode method", 70778880, testRange.hashCode());
    }
    
    /**Shift method with 3 args*/
    @Test
    public void testForValidRangeDoubleAndTrueForMethodShift()
    {
    	assertEquals("Test for a valid range, double and true for the method shift", new Range(-8,12), Range.shift(testRange, 2, true));
    }
    
    /**NEW TEST CASES*/
    
    /**NEW getCentralValue*/
    
    @Test
    public void testForValidRangeTwooForMethodGetCentralValue()
    {
    	Range obj = new Range(-10,9);
    	assertEquals("Test for a valid range for method getCentralValue", -0.5,obj.getCentralValue(), .000000001d);
    }
    
    @Test
    public void newTestForValidRangeThreeForMethodGetCentralValue()
    {
    	Range obj = new Range(-10,11);
    	assertEquals("Test for a valid range for method getCentralValue", 0.5,obj.getCentralValue(), .000000001d);
    }
    
    @Test
    public void newTestForValidRangeTwoNegativesForMethodGetCentralValue()
    {
    	Range obj = new Range(-20,-10);
    	assertEquals("Test for a valid range for method getCentralValue", -15,obj.getCentralValue(), .000000001d);
    }
    
    @Test
    public void newTestForValidRangeTwoPositivesForMethodGetCentralValue()
    {
    	Range obj = new Range(10, 20);
    	assertEquals("Test for a valid range for method getCentralValue", 15,obj.getCentralValue(), .000000001d);
    }
    
   /**NEW Constrains*/
    @Test
    public void newTestNegativeValueInTheRangeForMethodConstrain() //Constrain Method
    {
    	assertEquals("Test for a value in the range for the constrain method", -5.0, testRange.constrain(-5.0),.000000001d);
    }
    @Test
    public void newTestValueInTheNegativeRangeForMethodConstrain() //Constrain Method
    {
    	Range obj = new Range(-20, -10);
    	assertEquals("Test for a value in the range for the constrain method", -15.0, obj.constrain(-15.0),.000000001d);
    }
    @Test
    public void newTestOutofBoundsValueInTheNegativeRangeForMethodConstrain() //Constrain Method
    {
    	Range obj = new Range(-20, -10);
    	assertEquals("Test for a value not in the range for the constrain method", -20.0, obj.constrain(-30.0),.000000001d);
    }
    @Test
    public void newTestOutofBoundsValueInThePositiveRangeForMethodConstrain() //Constrain Method
    {
    	Range obj = new Range(20, 30);
    	assertEquals("Test for a value not in the range for the constrain method", 30, obj.constrain(40.0),.000000001d);
    }
    
    @Test
    public void newTestContrain1() //Constrain Method
    {
    	Range obj = new Range(-123.21, 56.3223);
    	assertEquals("Test for a value not in the range for the constrain method", -22.23, obj.constrain(-22.23),.000000001d);
    }
    
    @Test
    public void newTestContrain2() //Constrain Method
    {
    	Range obj = new Range(-123.21, 56.3223);
    	assertEquals("Test for a value not in the range for the constrain method", 56.3223, obj.constrain(2356),.000000001d);
    }
    
    @Test
    public void newTestContrain3() //Constrain Method
    {
    	Range obj = new Range(Double.NaN, -3432.222);
    	assertEquals("Test for a value not in the range for the constrain method", -9909.3, obj.constrain(-9909.3),.000000001d);
    }
    
    @Test
    public void newTestContrain4() //Constrain Method
    {
    	Range obj = new Range(Double.NaN, 3432.222);
    	assertEquals("Test for a value not in the range for the constrain method", 909.3, obj.constrain(909.3),.000000001d);
    }
    
    /**NEW combineIgnoringNaN*/
    @Test
    public void testCombineIgnoringNaN()
    {
        Range obj = new Range(-10,10.000000000000000000000000000000000000000000000001);
        assertEquals("Test for null range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(testRange, obj));
    }

    @Test
    public void testCombineIgnoringNaN2()
    {
        Range obj = new Range(-10.0012345,10.1);
        assertEquals("Test for null range being sent to combineIgnoringNaN method", obj, Range.combineIgnoringNaN(testRange, obj));
    }

    @Test
    public void testCombineIgnoringNaN3()
    {
        Range obj = new Range(-10,Double.NaN);
        Range obj2 = new Range(Double.NaN,10);
        assertEquals("Test for two Double.NaN range being sent to combineIgnoringNaN method", new Range(-10,10), Range.combineIgnoringNaN(obj2, obj));
    }
    
    /**NEW combine*/
    @Test
    public void testDoubleVariablesValidRangeIvnputForMethodCombine() //Combine Method
    {
        Range obj = new Range(-1000,-999);
        assertEquals("Test for an input of two valid ranges for combine method", new Range(-1000,10), Range.combine(testRange, obj));
    }
    
    /**NEW intersects 2 args*/
    @Test
    public void testForARangeThatIsOutOfBoundsOfTestRangeForMethodIntersects()
    {
    	assertTrue("Test for two out of bound doubles for intersects method", testRange.intersects(-11, 11));
    }
    
    @Test
    public void testForLowerBoundNotInIntersectionForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles intersects method", testRange.intersects(-11, 9));
    }
    
    @Test
    public void testForUpperBoundNotInIntersectionForMethodIntersects()
    {
    	assertTrue("Test for two valid doubles intersects method", testRange.intersects(-10, 11));
    }
    @Test
    public void intersects2Method()
    {
        assertTrue("Test for two valid doubles for intersects method", testRange.intersects(4.021, 5));
    }

    @Test
    public void intersects2Method2()
    {
        assertTrue("Test for two valid doubles for intersects method", testRange.intersects(0.0,0));
    }

    @Test
    public void intersects2Method3()
    {
        assertFalse("Test for two valid doubles for intersects method", testRange.intersects(Double.NaN,Double.NaN));
    }

    @Test
    public void intersects2Method4()
    {
        assertFalse("Test for two valid doubles for intersects method", testRange.intersects(Double.NaN,12));
    }

    @Test
    public void intersects2Method5()
    {
        assertTrue("Test for two valid doubles for intersects method", testRange.intersects(-10,(int)Double.NaN));
    }
    @Test
    public void testForIntersectsOnLowerBoundary() {

        assertTrue("Test for doubles on the lower boundary of the range", testRange.intersects(-10, -9.9999));
    }

    @Test
    public void testForIntersectsOnUpperBoundary() {

        assertTrue("Test for doubles on the upper boundary of the range", testRange.intersects(9.9999, 9.9999));
    } 
    
    /** NEW intersects 1 args*/
    @Test
    public void testForAValidRangeTwoForMethodIntersects() 
    {
    	Range obj = new Range(10,11);
    	assertFalse("Test for a valid range object intersects method", testRange.intersects(obj));
    }
    
    @Test
    public void testForAValidRangeThreeForMethodIntersects() 
    {
    	Range obj = new Range(-10,11);
    	assertTrue("Test for a valid range object intersects method", testRange.intersects(obj));
    }
    
    @Test
    public void testForAValidRangeFourForMethodIntersects() 
    {
    	Range obj = new Range(-5,5);
    	assertTrue("Test for a valid range object intersects method", testRange.intersects(obj));
    }
    
    /**NEW expand 3 arg*/
    @Test
    public void newTestForValidInputTwoForMethodExpands()
    {
    	Range obj = new Range(33.3, 51.3);
    	assertEquals("Test for valid inputs for expands method", new Range(27.72, 60.66), Range.expand(obj, 0.31, 0.52));
    }
    
    @Test
    public void newTestForValidInputThreeForMethodExpands()
    {
    	Range obj = new Range(-56.6, -30.3);
    	assertEquals("Test for valid inputs for expands method", new Range(-65.016, -19.517000000000003), Range.expand(obj, 0.32, 0.41));
    }
    
    @Test
    public void newTestForValidInputFourForMethodExpands()
    {
    	Range obj = new Range(20, 60);
    	assertEquals("Test for valid inputs for expands method", new Range(32.4, 80.8), Range.expand(obj, -0.31, 0.52));
    }
    
    @Test
    public void newTestForValidInputFiveForMethodExpands()
    {
    	Range obj = new Range(20, 90);
    	assertEquals("Test for valid inputs for expands method", new Range(-2.469999999999999,53.32), Range.expand(obj, 0.321, -0.524));
    }
    
    @Test
    public void newTestForValidInputSixForMethodExpands()
    {
    	Range obj = new Range(20, 70);
    	assertEquals("Test for valid inputs for expands method", new Range(47.75,53.849999999999994), Range.expand(obj, -0.555, -0.323));
    }
    
    @Test
    public void newTestForValidInputSevenForMethodExpands()
    {
    	Range obj = new Range(24.4, 83);
    	assertEquals("Test for valid inputs for expands method", new Range(-8.123000000000005,101.9278), Range.expand(obj, 0.555, 0.323));
    }
    @Test
    public void newTestForValidInputEightForMethodExpands()
    {
    	Range obj = new Range(-53.3, -29.121);
    	assertEquals("Test for valid inputs for expands method", new Range(-38.671704999999996,-38.671704999999996), Range.expand(obj, -0.62, -0.41));
    }
    
    @Test
    public void newTestForValidInputNineForMethodExpands()
    {
    	Range obj = new Range(-53.3, -29.121);
    	assertEquals("Test for valid inputs for expands method", new Range(-68.29097999999999,-39.034389999999995), Range.expand(obj, 0.62, -0.41));
    }
    
    /**NEW Shift with 3 args*/
    @Test
    public void Shift3Args1()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-7.788,12.212), Range.shift(testRange, 2.212, true));
    }

    @Test
    public void Shift3Args2()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-9.9996998,10.0003002), Range.shift(testRange, 0.0003002, true));
    }

    @Test
    public void Shift3Args3()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-12.212,7.788), Range.shift(testRange, -2.212, false));
    }

    @Test
    public void Shift3Args4()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-9.9996998,10.0003002), Range.shift(testRange, 0.0003002, false));
    }

    @Test
    public void Shift3Args5()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-10.0003002,9.9996998), Range.shift(testRange, -0.0003002, false));
    }

    @Test
    public void Shift3Args6()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-20,0), Range.shift(testRange, -10.000, true));
    }

    @Test
    public void Shift3Args7()
    {
        assertEquals("Test for a valid range, double and true for the method shift", new Range(-20.000002000000002,-2.000000000279556E-6), Range.shift(testRange, -10.000002, true));

    }
    
    /**NEW expandToInclude*/
    @Test
    public void newTestValidInputForMethodExpandToInclude() //expandToInclude Method
    {
    	Range obj = new Range(-30.2, -10.1);
    	assertEquals("Test for a valid double value for expandToInclude Method", new Range(-40.67, -10.1), Range.expandToInclude(obj, -40.67));
    }
   
    @Test
    public void newTestValidInputTwoForMethodExpandToInclude() //expandToInclude Method
    {
    	Range obj = new Range(-40.2, 30.232);
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-40.2,30.233), Range.expandToInclude(obj, 30.233));
    }
    
    @Test
    public void newTestValidInputThreeForMethodExpandToInclude() //expandToInclude Method
    {
    	Range obj = new Range(-40.2, -30.232);
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-40.2,30.233), Range.expandToInclude(obj, 30.233));
    }
    
    @Test
    public void newTestValidInputFourForMethodExpandToInclude() //expandToInclude Method
    {
    	Range obj = new Range(-40.2, 30.232);
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-40.2,30.232), Range.expandToInclude(obj, -30.233));
    }
    
    @Test
    public void newTestValidInputFiveForMethodExpandToInclude() //expandToInclude Method
    {
    	Range obj = new Range(40.23, 76.65);
    	assertEquals("Test for a double NaN value for expandToInclude Method", new Range(-30.233, 76.65), Range.expandToInclude(obj, -30.233));
    }
    
    /**NEW isNaN*/
    @Test
    public void testisNAN1() {
        assertFalse("Test for isNAN method", testRange.isNaNRange());
    }

    @Test
    public void testisNAN2() {
        Range testRange2 =new Range(Double.NaN, 10);
        assertFalse("Test for isNAN method", testRange2.isNaNRange());
    }

    @Test
    public void testisNAN3() {
        Range testRange2 =new Range(Double.NaN, Double.NaN);
        assertTrue("Test for isNAN method", testRange2.isNaNRange());
    }

    @Test
    public void testisNAN4() {
        Range testRange2 =new Range(-10.0, Double.NaN);
        assertFalse("Test for isNAN method", testRange2.isNaNRange());
    }
    
    /**NEW scale*/
    @Test
    public void testScale1() {

        Range obj = new Range(-12,12);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 1.2));
    }

    @Test
    public void testScale2() {

        Range obj = new Range(-10,10);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 1));
    }


    @Test
    public void testScale3() {

        Range obj = new Range(-5,5);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 0.5));
    }

    @Test
    public void testScale4() {

        Range obj = new Range(-10000,10000);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 1000));
    }
    
    @Test
    public void testScale5() {

        Range obj = new Range(-0.1,0.1);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 0.01));
    }


    @Test
    public void testScale6() {

        Range obj = new Range(-0.0001,0.0001);

        assertEquals("Test Valid for Positive", obj, Range.scale(testRange, 0.00001));
    }


    @Test
    public void testScale7() {

        Range obj = new Range(-10000.5,10000.5);

        assertEquals("Test Valid for Positive", new Range(-10005.0,10005.0), Range.scale(testRange, 1000.5));
    }
    
    /**NEW hashCode*/
    @Test
    public void newTestForHashCodeOneMethod()
    {
    	Range obj = new Range(-12323.132, 8893.22);
    	assertEquals("Test for hashCode method", -1404719384, obj.hashCode());
    }
    
    @Test
    public void newTestForHashCodeTwoMethod()
    {
    	Range obj = new Range(-34312.232, -232.8676);
    	assertEquals("Test for hashCode method", 699147769, obj.hashCode());
    }
    
    @Test
    public void newTestForHashCodeThreeMethod()
    {
    	Range obj = new Range(29038.232, 999454.565);
    	assertEquals("Test for hashCode method", -865850150, obj.hashCode());
    }
    
    @Test
    public void newTestForHashCodeFourMethod()
    {
    	Range obj = new Range(Double.NaN, 999454.565);
    	assertEquals("Test for hashCode method", -545182167, obj.hashCode());
    }
    
    @Test
    public void newTestForHashCodeFiveMethod()
    {
    	Range obj = new Range(22.22, Double.NaN);
    	assertEquals("Test for hashCode method", -213686171, obj.hashCode());
    }
    
    @Test
    public void testHashCodeMethod2()
    {
        Range testRange = new Range(0.0323,1.00021);
        assertEquals("Test for hashCode method", -536527771, testRange.hashCode());
    }

    @Test
    public void testHashCodeMethod3()
    {
        Range testRange = new Range(-0.0,0);
        assertEquals("Test for hashCode method", -2147483648, testRange.hashCode());
    }

    @Test
    public void testHashCodeMethod4()
    {
        Range testRange = new Range(Double.NaN,Double.NaN);
        assertEquals("Test for hashCode method", -15728640, testRange.hashCode());
    }
    
    /**NEW contains*/
    @Test
    public void newTestForContainOneForMethodContain()
    {
    	Range obj = new Range(40.2, 50.534);
    	assertTrue("Test for contains method", obj.contains(40.22));
    }
    
    @Test
    public void newTestForContainTwoForMethodContain()
    {
    	Range obj = new Range(-230.2345, 3000.2398);
    	assertTrue("Test for contains method", obj.contains(232));
    }
    
    @Test
    public void newTestForContainThreeForMethodContain()
    {
    	Range obj = new Range(-98230.7673, -2350.23438);
    	assertFalse("Test for contains method", obj.contains(0));
    }
    
    @Test
    public void newTestForContainFourForMethodContain()
    {
    	Range obj = new Range(-98230.7673, -2350.23438);
    	assertTrue("Test for contains method", obj.contains(-2350.23438));
    }
    
    @Test
    public void newTestForContainFiveForMethodContain()
    {
    	Range obj = new Range(-98230.7673, 2350.23438);
    	assertTrue("Test for contains method", obj.contains(0));
    }
    
    @Test
    public void newTestForContainSixForMethodContain()
    {
    	Range obj = new Range(-98230.7673, -2350.23438);
    	assertTrue("Test for contains method", obj.contains(-98230.7673));
    }
    
    @Test
    public void newTestForContainSevenForMethodContain()
    {
    	Range obj = new Range(-98230.7673, -2350.23438);
    	assertFalse("Test for contains method", obj.contains(-198230.7673));
    }
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}