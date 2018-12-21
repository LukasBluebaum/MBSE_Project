package org.xtext.example.mydsl.serialiser;

import Metamodell.Color;
import Metamodell.Facet;
import Metamodell.Solid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.serialiser.ByteConverter;

@SuppressWarnings("all")
public class Serialiser {
  public static String serialise(final Solid s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("COLOR=");
    String _intToByte = ByteConverter.intToByte(s.getFacets().size());
    _builder.append(_intToByte);
    _builder.newLineIfNotEmpty();
    {
      EList<Facet> _facets = s.getFacets();
      for(final Facet f : _facets) {
        String _floatToByte = ByteConverter.floatToByte(f.getNormal().getX());
        _builder.append(_floatToByte);
        _builder.newLineIfNotEmpty();
        String _floatToByte_1 = ByteConverter.floatToByte(f.getNormal().getY());
        _builder.append(_floatToByte_1);
        _builder.newLineIfNotEmpty();
        String _floatToByte_2 = ByteConverter.floatToByte(f.getNormal().getZ());
        _builder.append(_floatToByte_2);
        _builder.newLineIfNotEmpty();
        String _floatToByte_3 = ByteConverter.floatToByte(f.getNormal().getX());
        _builder.append(_floatToByte_3);
        _builder.newLineIfNotEmpty();
        String _floatToByte_4 = ByteConverter.floatToByte(f.getNormal().getY());
        _builder.append(_floatToByte_4);
        _builder.newLineIfNotEmpty();
        _builder.append("»ByteConverter.floatToByte(f.getNormal().getZ())»");
        _builder.newLine();
        String _floatToByte_5 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getX());
        _builder.append(_floatToByte_5);
        _builder.newLineIfNotEmpty();
        String _floatToByte_6 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getY());
        _builder.append(_floatToByte_6);
        _builder.newLineIfNotEmpty();
        String _floatToByte_7 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getZ());
        _builder.append(_floatToByte_7);
        _builder.newLineIfNotEmpty();
        String _floatToByte_8 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getX());
        _builder.append(_floatToByte_8);
        _builder.newLineIfNotEmpty();
        String _floatToByte_9 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getY());
        _builder.append(_floatToByte_9);
        _builder.newLineIfNotEmpty();
        String _floatToByte_10 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getZ());
        _builder.append(_floatToByte_10);
        _builder.newLineIfNotEmpty();
        String _floatToByte_11 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getX());
        _builder.append(_floatToByte_11);
        _builder.newLineIfNotEmpty();
        String _floatToByte_12 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getY());
        _builder.append(_floatToByte_12);
        _builder.newLineIfNotEmpty();
        String _floatToByte_13 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getZ());
        _builder.append(_floatToByte_13);
        _builder.newLineIfNotEmpty();
        {
          Color _color = f.getColor();
          boolean _tripleNotEquals = (_color != null);
          if (_tripleNotEquals) {
            String _createColorBits = ByteConverter.createColorBits(f.getColor());
            _builder.append(_createColorBits);
            _builder.newLineIfNotEmpty();
          } else {
            String _shortToByte = ByteConverter.shortToByte((Short.valueOf("0")).shortValue());
            _builder.append(_shortToByte);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
}
