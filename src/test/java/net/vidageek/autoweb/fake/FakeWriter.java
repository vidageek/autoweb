package net.vidageek.autoweb.fake;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

/**
 * @author jonasabreu
 * 
 */
final public class FakeWriter extends JspWriter {

	private String printedString;

	public String getPrintedString() {
		return printedString;
	}

	public FakeWriter() {
		super(0, false);
	}

	@Override
	public void newLine() throws IOException {
	}

	@Override
	public void print(final boolean b) throws IOException {
	}

	@Override
	public void print(final char c) throws IOException {
	}

	@Override
	public void print(final int i) throws IOException {
	}

	@Override
	public void print(final long l) throws IOException {
	}

	@Override
	public void print(final float f) throws IOException {
	}

	@Override
	public void print(final double d) throws IOException {
	}

	@Override
	public void print(final char[] s) throws IOException {
	}

	@Override
	public void print(final String string) throws IOException {
		printedString = string;

	}

	@Override
	public void print(final Object obj) throws IOException {
	}

	@Override
	public void println() throws IOException {
	}

	@Override
	public void println(final boolean x) throws IOException {
	}

	@Override
	public void println(final char x) throws IOException {
	}

	@Override
	public void println(final int x) throws IOException {
	}

	@Override
	public void println(final long x) throws IOException {
	}

	@Override
	public void println(final float x) throws IOException {
	}

	@Override
	public void println(final double x) throws IOException {
	}

	@Override
	public void println(final char[] x) throws IOException {
	}

	@Override
	public void println(final String x) throws IOException {
	}

	@Override
	public void println(final Object x) throws IOException {
	}

	@Override
	public void clear() throws IOException {
	}

	@Override
	public void clearBuffer() throws IOException {
	}

	@Override
	public void flush() throws IOException {
	}

	@Override
	public void close() throws IOException {
	}

	@Override
	public int getRemaining() {
		return 0;
	}

	@Override
	public void write(final char[] cbuf, final int off, final int len) throws IOException {
	}

}
