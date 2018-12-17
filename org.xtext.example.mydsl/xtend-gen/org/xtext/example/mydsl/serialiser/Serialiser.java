package org.xtext.example.mydsl.serialiser;

import Metamodell.Solid;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.serialiser.ByteConverter;

@SuppressWarnings("all")
public class Serialiser {
  public static String serialise(final Solid s) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("COLOR=");
      String _intToByte = ByteConverter.intToByte(s.getFacets().size());
      _builder.append(_intToByte);
      _builder.append("\t");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
