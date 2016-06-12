package OperacionesBasicas;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses( { TestMetodoSuma.class, TestMetodoResta.class })
public class AllTest {}