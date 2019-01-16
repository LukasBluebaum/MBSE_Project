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
    String _setBytes = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes);
    _builder.append("MATERIAL=");
    String _setBytes_1 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_1);
    String _setBytes_2 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_2);
    String _setBytes_3 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_3);
    _builder.append("                                                 ");
    String _intToByte = ByteConverter.intToByte(s.getFacets().size());
    _builder.append(_intToByte);
    {
      EList<Facet> _facets = s.getFacets();
      for(final Facet f : _facets) {
        String _floatToByte = ByteConverter.floatToByte(f.getNormal().getX(), f.getNormal().getY(), f.getNormal().getZ());
        String _floatToByte_1 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(0).getX(), ByteConverter.getVectors(f).get(0).getY(), ByteConverter.getVectors(f).get(0).getZ());
        String _plus = (_floatToByte + _floatToByte_1);
        String _floatToByte_2 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(1).getX(), ByteConverter.getVectors(f).get(1).getY(), ByteConverter.getVectors(f).get(1).getZ());
        String _plus_1 = (_plus + _floatToByte_2);
        String _floatToByte_3 = ByteConverter.floatToByte(ByteConverter.getVectors(f).get(2).getX(), ByteConverter.getVectors(f).get(2).getY(), ByteConverter.getVectors(f).get(2).getZ());
        String _plus_2 = (_plus_1 + _floatToByte_3);
        _builder.append(_plus_2);
        {
          Color _color = f.getColor();
          boolean _tripleNotEquals = (_color != null);
          if (_tripleNotEquals) {
            String _createColorBits = ByteConverter.createColorBits(f.getColor());
            _builder.append(_createColorBits);
          } else {
            String _shortToByte = ByteConverter.shortToByte(0);
            _builder.append(_shortToByte);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public static String serialise2(final Solid s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("COLOR=");
    String _setBytes = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes);
    _builder.append("MATERIAL=");
    String _setBytes_1 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_1);
    String _setBytes_2 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_2);
    String _setBytes_3 = ByteConverter.setBytes(127, 127, 127, 32);
    _builder.append(_setBytes_3);
    _builder.append("                                                 ");
    String _intToByte = ByteConverter.intToByte(s.getFacets().size());
    _builder.append(_intToByte);
    {
      EList<Facet> _facets = s.getFacets();
      for(final Facet f : _facets) {
        String _createBinary = ByteConverter.createBinary(f);
        _builder.append(_createBinary);
      }
    }
    return _builder.toString();
  }
}
