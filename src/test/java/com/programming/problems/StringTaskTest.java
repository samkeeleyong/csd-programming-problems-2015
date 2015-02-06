package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringTaskTest {

	StringTask stringTask;
	
	@Before
	public void setup(){
		stringTask = new StringTask();
	}
	
	@Test
	public void testA() {
		String actual = stringTask.convert("tour");
		String expected = ".t.r";
		assertEquals(actual, expected);
	}
	
	@Test
	public void testB() {
		String actual = stringTask.convert("aBAcAba");
		String expected = ".b.c.b";
		assertEquals(actual, expected);
	}	

	@Test
	public void testC() {
		String actual = stringTask.convert("aBAcAba");
		String expected = ".b.c.b";
		assertEquals(actual, expected);
	}	

	@Test
	public void testD() {
		String actual = stringTask.convert("g");
		String expected = ".g";
		assertEquals(actual, expected);
	}	

	@Test
	public void testE() {
		String actual = stringTask.convert("aab");
		String expected = ".b";
		assertEquals(actual, expected);
	}	
	
	@Test
	public void testF() {
		String actual = stringTask.convert("baa");
		String expected = ".b";
		assertEquals(actual, expected);
	}	
	
	@Test
	public void testG() {
		String actual = stringTask.convert("FSNRBXLFQHZXGVMKLQDVHWLDSLKGKFMDRQWMWSSKPKKQBNDZRSCBLRSKCKKFFKRDMZFZGCNSMXNPMZVDLKXGNXGZQCLRTTDXLMXQ");
		String expected = ".f.s.n.r.b.x.l.f.q.h.z.x.g.v.m.k.l.q.d.v.h.w.l.d.s.l.k.g.k.f.m.d.r.q.w.m.w.s.s.k.p.k.k.q.b.n.d.z.r.s.c.b.l.r.s.k.c.k.k.f.f.k.r.d.m.z.f.z.g.c.n.s.m.x.n.p.m.z.v.d.l.k.x.g.n.x.g.z.q.c.l.r.t.t.d.x.l.m.x.q";
		assertEquals(actual, expected);
	}
}
